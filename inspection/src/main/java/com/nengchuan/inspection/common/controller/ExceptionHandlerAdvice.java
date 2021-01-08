package com.nengchuan.inspection.common.controller;


import com.nengchuan.inspection.common.enums.CommonExceptionEnum;
import com.nengchuan.inspection.common.exception.NcSpringBootException;
import com.nengchuan.inspection.common.model.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.MultipartException;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

/**
 * 异常处理增强器
 *
 * @author： chern
 * @date： Created on 2018/9/20 11:24
 * @version： v1.0
 * @modified By:
 */
@RestControllerAdvice
public class ExceptionHandlerAdvice {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandlerAdvice.class);

     /**
     * 业务异常处理
     */
    @ExceptionHandler(NcSpringBootException.class)
    public Result handleNcSpringBootException(NcSpringBootException e) {
        logger.warn("NcSpringBootException异常:{}:{}", e.getCode(), e.getMsg());
        return new Result(e.getCode(), e.getMsg());
    }
    /**
     * valid的参数异常处理
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        return this.handleBindResult(e.getBindingResult()) ;
    }
    /**
     * Bind数据异常
     */
    @ExceptionHandler(value = BindException.class)
    public Result handelIllegalArgumentException(BindException e) {
        return this.handleBindResult(e);
    }

    /**
     * 文件上传异常
     */
    @ExceptionHandler(value = MultipartException.class)
    public Result handelIllegalArgumentException(MultipartException e) {
        logger.error("文件流异常", e);
        return new Result(CommonExceptionEnum.FILE_ERROR.getCode(),CommonExceptionEnum.FILE_ERROR.getMessage());
    }


    /**
     * Exception的异常处理
     */
    @ExceptionHandler(Exception.class)
    public Result handleException(Exception e) {
        logger.error("Exception异常", e);
        return new Result(CommonExceptionEnum.UN_KNOW.getCode(), e.getMessage());
    }


    /**
     * 封装绑定参数的异常
     * @param bindingResult
     * @return
     */
    private Result handleBindResult(BindingResult bindingResult){
        StringBuffer resultBuffer = new StringBuffer();
        List<ObjectError> errors = bindingResult.getAllErrors();
        Object targetObject = bindingResult.getTarget();
        String tips = "参数不合法";
        if (errors.size() > 0) {
            for(ObjectError objectError :errors) {
                resultBuffer.append(objectError.getDefaultMessage()).append(",");
            }
        }else {
            resultBuffer.append(tips) ;
        }
        String result = resultBuffer.toString();
        logger.warn("参数不合法，源文件地址：【{}】，入参：【{}】，校验结果：【{}】",targetObject.getClass().getName(),targetObject.toString(),result);
        return new Result(CommonExceptionEnum.ARGS_ERROR.getCode(),result);
    }


}
