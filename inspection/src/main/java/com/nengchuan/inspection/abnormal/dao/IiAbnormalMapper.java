package com.nengchuan.inspection.abnormal.dao;

import com.nengchuan.inspection.abnormal.entity.IiAbnormal;
import com.nengchuan.inspection.abnormal.entity.IiAbnormalCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IiAbnormalMapper {
    int countByExample(IiAbnormalCriteria example);

    int deleteByExample(IiAbnormalCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(IiAbnormal record);

    int insertSelective(IiAbnormal record);

    List<IiAbnormal> selectByExample(IiAbnormalCriteria example);

    IiAbnormal selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") IiAbnormal record, @Param("example") IiAbnormalCriteria example);

    int updateByExample(@Param("record") IiAbnormal record, @Param("example") IiAbnormalCriteria example);

    int updateByPrimaryKeySelective(IiAbnormal record);

    int updateByPrimaryKey(IiAbnormal record);
}