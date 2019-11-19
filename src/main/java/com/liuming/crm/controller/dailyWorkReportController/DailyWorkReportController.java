package com.liuming.crm.controller.dailyWorkReportController;

import com.liuming.crm.service.dailyWorkReportService.DailyWorkReportService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/dailyWorkReport")
public class DailyWorkReportController {
    @Resource
    private DailyWorkReportService dailyWorkReportService;
}
