package com.liuming.crm.mapper.dailyWorkReportMapper;

import com.liuming.crm.entity.dailyWorkReportEntity.DailyWorkReport;
import com.liuming.crm.entity.dailyWorkReportEntity.DailyWorkReportExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DailyWorkReportMapper {
    int countByExample(DailyWorkReportExample example);

    int deleteByExample(DailyWorkReportExample example);

    int deleteByPrimaryKey(String dailyWorkReportId);

    int insert(DailyWorkReport record);

    int insertSelective(DailyWorkReport record);

    List<DailyWorkReport> selectByExampleWithBLOBs(DailyWorkReportExample example);

    List<DailyWorkReport> selectByExample(DailyWorkReportExample example);

    DailyWorkReport selectByPrimaryKey(String dailyWorkReportId);

    int updateByExampleSelective(@Param("record") DailyWorkReport record, @Param("example") DailyWorkReportExample example);

    int updateByExampleWithBLOBs(@Param("record") DailyWorkReport record, @Param("example") DailyWorkReportExample example);

    int updateByExample(@Param("record") DailyWorkReport record, @Param("example") DailyWorkReportExample example);

    int updateByPrimaryKeySelective(DailyWorkReport record);

    int updateByPrimaryKeyWithBLOBs(DailyWorkReport record);

    int updateByPrimaryKey(DailyWorkReport record);
}