package com.liuming.crm.service.workReportService.impl;

import com.github.pagehelper.PageHelper;
import com.liuming.crm.entity.userEntity.User;
import com.liuming.crm.entity.workReportEntity.WorkReport;
import com.liuming.crm.entity.workReportEntity.WorkReportWithBLOBs;
import com.liuming.crm.mapper.userMapper.UserMapper;
import com.liuming.crm.mapper.workReportMapper.WorkReportMapper;
import com.liuming.crm.service.workReportService.WorkReportService;
import com.liuming.crm.utils.DataResult;
import com.liuming.crm.utils.IDUtils;
import com.liuming.crm.utils.PageBean;
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

    @Resource
    private UserMapper userMapper;

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
    public DataResult findWorkReportByUserId(int pageNum, int pageSize, String workReportUserId) {
        User user = userMapper.selectByPrimaryKey(workReportUserId);
        List<WorkReportWithBLOBs> workReportWithBLOBsList;
        int workReportCount;
        PageBean<WorkReportWithBLOBs> workReportPageBean;
        if (user != null){
            if (pageNum > 0 && pageSize >= 1){
                //设置分页数据
                PageHelper.startPage(pageNum, pageSize);
                if (user.getUserType() == 0 || user.getUserType() ==1){
                    workReportWithBLOBsList = workReportMapper.findWorkReport();
                    workReportCount = workReportMapper.findWorkReportCount();
                    workReportPageBean = new PageBean<>(pageNum,pageSize,workReportCount);
                    workReportPageBean.setItems(workReportWithBLOBsList);
                    return DataResult.ok(workReportPageBean);
                } else {
                    workReportWithBLOBsList = workReportMapper.findWorkReportByUserId(workReportUserId);
                    workReportCount = workReportMapper.findWorkReportCountByUserId(workReportUserId);
                    workReportPageBean = new PageBean<>(pageNum, pageSize, workReportCount);
                    workReportPageBean.setItems(workReportWithBLOBsList);
                    return DataResult.ok(workReportPageBean);
                }
            } else {
                if (user.getUserType() == 0 || user.getUserType() ==1){
                    workReportWithBLOBsList = workReportMapper.findWorkReport();
                    workReportCount = workReportMapper.findWorkReportCount();
                    workReportPageBean = new PageBean<>(pageNum,pageSize,workReportCount);
                    workReportPageBean.setItems(workReportWithBLOBsList);
                    return DataResult.ok(workReportPageBean);
                } else {
                    workReportWithBLOBsList = workReportMapper.findWorkReportByUserId(workReportUserId);
                    workReportCount = workReportMapper.findWorkReportCountByUserId(workReportUserId);
                    workReportPageBean = new PageBean<>(pageNum, pageSize, workReportCount);
                    workReportPageBean.setItems(workReportWithBLOBsList);
                    return DataResult.ok(workReportPageBean);
                }
            }
        } else {
            return DataResult.build(500,"用户不存在");
        }
    }

    @Override
    public DataResult addReviews(WorkReportWithBLOBs workReportWithBLOBs) {
        workReportWithBLOBs.setWorkReportUpdatedDate(new Date());
        int i = workReportMapper.updateByPrimaryKeySelective(workReportWithBLOBs);
        if (i > 0) {
            return DataResult.build(200,"点评成功");
        } else {
            return DataResult.build(500,"点评失败");
        }
    }

    @Override
    public DataResult findWorkReportById(String workReportId) {
        WorkReportWithBLOBs workReportWithBLOBs = workReportMapper.selectByPrimaryKey(workReportId);
        return DataResult.ok(workReportWithBLOBs);
    }
}
