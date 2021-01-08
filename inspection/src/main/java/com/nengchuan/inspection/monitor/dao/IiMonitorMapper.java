package com.nengchuan.inspection.monitor.dao;

import com.nengchuan.inspection.monitor.entity.IiMonitor;
import com.nengchuan.inspection.monitor.entity.IiMonitorCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IiMonitorMapper {
    int countByExample(IiMonitorCriteria example);

    int deleteByExample(IiMonitorCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(IiMonitor record);

    int insertSelective(IiMonitor record);

    List<IiMonitor> selectByExample(IiMonitorCriteria example);

    IiMonitor selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") IiMonitor record, @Param("example") IiMonitorCriteria example);

    int updateByExample(@Param("record") IiMonitor record, @Param("example") IiMonitorCriteria example);

    int updateByPrimaryKeySelective(IiMonitor record);

    int updateByPrimaryKey(IiMonitor record);
}