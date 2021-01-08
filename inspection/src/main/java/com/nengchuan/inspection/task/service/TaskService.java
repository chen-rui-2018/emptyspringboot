package com.nengchuan.inspection.task.service;

import com.nengchuan.inspection.task.model.TaskModel;

/**
 * @author： chenr
 * @date： Created on 2021/1/7 16:52
 * @version： v1.0
 * @modified By:
 */

public interface TaskService {
    /**
     * 新增任务信息
     * @param taskModel
     */
   void  saveTask(TaskModel taskModel);
}
