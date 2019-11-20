package com.liuming.crm.service.workReportService.impl;

import com.liuming.crm.entity.workReportEntity.WorkReport;
import com.liuming.crm.entity.workReportEntity.WorkReportWithBLOBs;
import com.liuming.crm.mapper.workReportMapper.WorkReportMapper;
import com.liuming.crm.service.workReportService.WorkReportService;
import com.liuming.crm.utils.DataResult;
import com.liuming.crm.utils.IDUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Description
 * @ClassName WorkReportServiceImpl
 * @Author 鲸落
 * @date 2019.11.19 23:58
 */
@Service
public class WorkReportServiceImpl implements WorkReportService {
    @Resource
    private WorkReportMapper workReportMapper;

    @Override
    public DataResult addWorkReport(WorkReportWithBLOBs workReportWithBLOBs) {
        //每个用户一天只能提交一次工作日报，查询该用户有没有提交过工作日报
        WorkReport workReportByUserIdAndDate =
                workReportMapper.findWorkReportByUserIdAndDate(workReportWithBLOBs.getWorkReportUserId(),
                new SimpleDateFormat(
                "yyyy-MM-dd").format(new Date()) + "%");
        if (workReportByUserIdAndDate == null) {
            workReportWithBLOBs.setWorkReportId(IDUtils.getID());
            workReportWithBLOBs.setWorkReportCreatedDate(new Date());
            workReportWithBLOBs.setWorkReportUpdatedDate(new Date());
            int i = workReportMapper.insertSelective(workReportWithBLOBs);
            if (i > 0) {
                return DataResult.build(200,"提交成功");
            } else {
                return DataResult.build(500,"提交失败");
            }
        } else {
            return DataResult.build(500,"今日已提交工作日报");
        }
    }

    @Override
    public DataResult findWorkReport(String workReportUserId) {
        // TODO: 2019/11/20 上线前需要完成根据用户表的用户类型分析返回的数据，如果只是普通用户，则返回该用户的工作报告，如果类型为管理员和超级管理员，则返回所有用户的工作报告
        List<WorkReport> workReportList = workReportMapper.findWorkReportByUserId(workReportUserId);
        return DataResult.ok(workReportList);
    }
}
