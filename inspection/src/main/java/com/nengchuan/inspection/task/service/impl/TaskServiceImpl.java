package com.nengchuan.inspection.task.service.impl;

import com.nengchuan.inspection.common.log.annotation.ServiceLog;
import com.nengchuan.inspection.task.dao.IiTaskMapper;
import com.nengchuan.inspection.task.entity.IiTask;
import com.nengchuan.inspection.task.model.TaskModel;
import com.nengchuan.inspection.task.service.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author： chenr
 * @date： Created on 2021/1/7 16:52
 * @version： v1.0
 * @modified By:
 */
@Service
public class TaskServiceImpl implements TaskService {
    /**
     * 日志组件
     */
    private static Logger logger = LoggerFactory.getLogger(TaskServiceImpl.class);
    @Autowired
    private IiTaskMapper iiTaskMapper;
    @ServiceLog(doAction = "新增任务信息")
    @Override
    public void saveTask(TaskModel taskModel) {
        IiTask iiTask = new IiTask();
        BeanUtils.copyProperties(taskModel,iiTask);
        iiTaskMapper.insertSelective(iiTask);
    }
}
