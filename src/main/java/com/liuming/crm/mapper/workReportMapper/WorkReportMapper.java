package com.liuming.crm.mapper.workReportMapper;

import com.liuming.crm.entity.workReportEntity.WorkReport;
import com.liuming.crm.entity.workReportEntity.WorkReportExample;
import com.liuming.crm.entity.workReportEntity.WorkReportWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WorkReportMapper {
    int countByExample(WorkReportExample example);

    int deleteByExample(WorkReportExample example);

    int deleteByPrimaryKey(String workReportId);

    int insert(WorkReportWithBLOBs record);

    int insertSelective(WorkReportWithBLOBs record);

    List<WorkReportWithBLOBs> selectByExampleWithBLOBs(WorkReportExample example);

    List<WorkReport> selectByExample(WorkReportExample example);

    WorkReportWithBLOBs selectByPrimaryKey(String workReportId);

    int updateByExampleSelective(@Param("record") WorkReportWithBLOBs record, @Param("example") WorkReportExample example);

    int updateByExampleWithBLOBs(@Param("record") WorkReportWithBLOBs record, @Param("example") WorkReportExample example);

    int updateByExample(@Param("record") WorkReport record, @Param("example") WorkReportExample example);

    int updateByPrimaryKeySelective(WorkReportWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(WorkReportWithBLOBs record);

    int updateByPrimaryKey(WorkReport record);

    WorkReport findWorkReportByUserIdAndDate(@Param("workReportUserId") String workReportUserId, @Param(
            "workReportUpdatedDate") String format);

    List<WorkReportWithBLOBs> findWorkReportByUserId(@Param("workReportUserId") String workReportUserId);

    List<WorkReportWithBLOBs> findWorkReport();
}