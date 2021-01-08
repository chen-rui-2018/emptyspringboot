package com.nengchuan.inspection.common.exception;


import com.nengchuan.inspection.common.api.CodeAndMsg;
import com.nengchuan.inspection.common.model.Result;

/**
 * 统一接口对外的异常包装类，用于业务抛异常
 *
 * @author： chenr
 * @date： Created on 2018/9/20 15:31
 * @version： v1.0
 * @modified By:
 */
public class NcSpringBootException extends RuntimeException {
    /**
     * 错误编码
     */
    protected String code;
    /**
     * 错误信息
     */
    protected String msg;
    /**
     * 通过接口实例类
     * @param codeAndMsg 状态业务方法
     */
    public NcSpringBootException(CodeAndMsg codeAndMsg) {
        super(codeAndMsg.getMessage());
        this.msg = codeAndMsg.getMessage();
        this.code = codeAndMsg.getCode();
    }
    /**
     * 通过接口实例类
     * @param codeAndMsg
     * @param msg 动态信息
     */
    public NcSpringBootException(CodeAndMsg codeAndMsg, String msg) {
        super(msg);
        this.msg = msg;
        this.code = codeAndMsg.getCode();
    }


    /**
     * 通过结果model初始化
     * @param result
     */
    public NcSpringBootException(Result result) {
        this.msg = result.getResult() ;
        this.code = result.getCode() ;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
