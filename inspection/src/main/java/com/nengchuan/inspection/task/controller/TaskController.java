package com.nengchuan.inspection.task.controller;

import com.nengchuan.inspection.common.controller.BaseController;
import com.nengchuan.inspection.common.log.annotation.ControllerLog;
import com.nengchuan.inspection.common.model.Result;
import com.nengchuan.inspection.task.model.TaskModel;
import com.nengchuan.inspection.task.service.TaskService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author： chenr
 * @date： Created on 2021/1/7 15:39
 * @version： v1.0
 * @modified By:
 */
@Api(tags = "任务管理")
@RequestMapping("/task")
@RestController
public class TaskController  extends BaseController {
    @Autowired
    private TaskService taskService;
    /**
     * 日志组件
     */
    private static Logger logger = LoggerFactory.getLogger(TaskController.class);

    @ControllerLog(doAction = "任务新增")
    @ApiOperation(value = "任务新增",notes = "任务信息新增")
    @RequestMapping(value = "/saveTask", method = RequestMethod.POST)
    public Result saveTask(@RequestBody TaskModel taskModel){
        taskService.saveTask(taskModel);
        return new Result();
    }

}
