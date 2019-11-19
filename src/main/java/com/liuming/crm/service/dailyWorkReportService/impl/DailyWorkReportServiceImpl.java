package com.liuming.crm.service.dailyWorkReportService.impl;

import com.liuming.crm.mapper.dailyWorkReportMapper.DailyWorkReportMapper;
import com.liuming.crm.service.dailyWorkReportService.DailyWorkReportService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DailyWorkReportServiceImpl implements DailyWorkReportService {
    @Resource
    private DailyWorkReportMapper dailyWorkReportMapper;
}
