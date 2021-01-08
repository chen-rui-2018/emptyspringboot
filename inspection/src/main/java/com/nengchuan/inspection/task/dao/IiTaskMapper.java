package com.nengchuan.inspection.task.dao;

import com.nengchuan.inspection.task.entity.IiTask;
import com.nengchuan.inspection.task.entity.IiTaskCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IiTaskMapper {
    int countByExample(IiTaskCriteria example);

    int deleteByExample(IiTaskCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(IiTask record);

    int insertSelective(IiTask record);

    List<IiTask> selectByExample(IiTaskCriteria example);

    IiTask selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") IiTask record, @Param("example") IiTaskCriteria example);

    int updateByExample(@Param("record") IiTask record, @Param("example") IiTaskCriteria example);

    int updateByPrimaryKeySelective(IiTask record);

    int updateByPrimaryKey(IiTask record);
}