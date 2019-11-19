package com.liuming.crm.service.dailyWorkReportService.impl;

import com.liuming.crm.mapper.dailyWorkReportMapper.DailyWorkReportMapper;
import com.liuming.crm.service.dailyWorkReportService.DailyWorkReportService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description
 * @ClassName DailyWorkReportServiceImpl
 * @Author 鲸落
 * @date 2019.11.19 23:58
 */
@Service
public class DailyWorkReportServiceImpl implements DailyWorkReportService {
    @Resource
    private DailyWorkReportMapper dailyWorkReportMapper;
}
