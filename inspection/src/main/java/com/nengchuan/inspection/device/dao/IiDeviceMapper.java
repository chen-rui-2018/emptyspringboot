package com.nengchuan.inspection.device.dao;

import com.nengchuan.inspection.device.entity.IiDevice;
import com.nengchuan.inspection.device.entity.IiDeviceCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IiDeviceMapper {
    int countByExample(IiDeviceCriteria example);

    int deleteByExample(IiDeviceCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(IiDevice record);

    int insertSelective(IiDevice record);

    List<IiDevice> selectByExample(IiDeviceCriteria example);

    IiDevice selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") IiDevice record, @Param("example") IiDeviceCriteria example);

    int updateByExample(@Param("record") IiDevice record, @Param("example") IiDeviceCriteria example);

    int updateByPrimaryKeySelective(IiDevice record);

    int updateByPrimaryKey(IiDevice record);
}