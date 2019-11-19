package com.liuming.crm.controller.dailyWorkReportController;

import com.liuming.crm.service.dailyWorkReportService.DailyWorkReportService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Descripti 工作日报
 * @ClassName DailyWorkReportController
 * @Author 鲸落
 * @date 2019.11.19 23:55
 */
@RestController
@RequestMapping("/dailyWorkReport")
public class DailyWorkReportController {
    @Resource
    private DailyWorkReportService dailyWorkReportService;
}
