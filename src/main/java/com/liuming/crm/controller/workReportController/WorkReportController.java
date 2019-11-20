package com.liuming.crm.controller.workReportController;

import com.liuming.crm.entity.workReportEntity.WorkReport;
import com.liuming.crm.entity.workReportEntity.WorkReportWithBLOBs;
import com.liuming.crm.service.workReportService.WorkReportService;
import com.liuming.crm.utils.DataResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Descripti 工作报告
 * @ClassName WorkReportController
 * @Author 鲸落
 * @date 2019.11.19 23:55
 */
@RestController
@RequestMapping("/workReport")
public class WorkReportController {
    @Resource
    private WorkReportService workReportService;

    /**
     * @Description 新增工作报告
     * @param workReportWithBLOBs
     * @return com.liuming.crm.utils.DataResult
     * @Author 鲸落
     * @Date 2019.11.20 09:34
     */
    @RequestMapping("/addWorkReport")
    public DataResult addWorkReport(WorkReportWithBLOBs workReportWithBLOBs){
        if (StringUtils.isNotBlank(workReportWithBLOBs.getWorkReportContent()) && StringUtils.isNotBlank(workReportWithBLOBs.getWorkReportUserId()) && StringUtils.isNotBlank(workReportWithBLOBs.getWorkReportUserName()) && workReportWithBLOBs.getWorkReportType() != null) {
            return workReportService.addWorkReport(workReportWithBLOBs);
        } else {
            return DataResult.build(500,"工作内容、用户ID、用户名称、工作报告类型不得为空");
        }
    }

    /**
     * @Description 查询工作报告
     * @param workReportUserId
     * @return com.liuming.crm.utils.DataResult
     * @Author 鲸落
     * @Date 2019.11.20 10:41
     */
    @RequestMapping("/findWorkReport")
    public DataResult findWorkReport(String workReportUserId){
        if (StringUtils.isNotBlank(workReportUserId)) {
            return workReportService.findWorkReport(workReportUserId);
        } else {
            return DataResult.build(500,"用户ID不得为空");
        }
    }

    // TODO: 2019/11/20 后续增加点评功能
}
