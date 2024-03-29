package com.liuming.crm.controller.workReportController;

import com.liuming.crm.entity.workReportEntity.WorkReport;
import com.liuming.crm.entity.workReportEntity.WorkReportWithBLOBs;
import com.liuming.crm.service.workReportService.WorkReportService;
import com.liuming.crm.utils.DataResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    @RequestMapping("/findWorkReportByUserId")
    public DataResult findWorkReportByUserId(@RequestParam(defaultValue = "1") int pageNum,
                                     @RequestParam(defaultValue = "10") int pageSize,
                                     String workReportUserId){
        if (StringUtils.isNotBlank(workReportUserId)) {
            return workReportService.findWorkReportByUserId(pageNum, pageSize, workReportUserId);
        } else {
            return DataResult.build(500,"用户ID不得为空");
        }
    }

    /**
     * @Description 新增点评（如果多次调用该接口会覆盖掉原有的点评）
     * @param workReportWithBLOBs
     * @return com.liuming.crm.utils.DataResult
     * @Author 鲸落
     * @Date 2019.11.21 10:30
     */
    @RequestMapping("/addReviews")
    public DataResult addReviews(WorkReportWithBLOBs workReportWithBLOBs){
        if (StringUtils.isNotBlank(workReportWithBLOBs.getWorkReportId()) && StringUtils.isNotBlank(workReportWithBLOBs.getReviewsUserId()) && StringUtils.isNotBlank(workReportWithBLOBs.getReviewsUserName()) && StringUtils.isNotBlank(workReportWithBLOBs.getReviews())) {
            return workReportService.addReviews(workReportWithBLOBs);
        } else {
            return DataResult.build(500,"工作报告ID、点评用户ID、点评用户名称、工作报告点评不得为空");
        }
    }

    /**
     * @Description 根据工作报告ID查询工作报告详情
     * @param workReportId
     * @return com.liuming.crm.utils.DataResult
     * @Author 鲸落
     * @Date 2019.12.02 11:14
     */
    @RequestMapping("/findWorkReportById")
    public DataResult findWorkReportById(String workReportId){
        if (StringUtils.isNotBlank(workReportId)) {
            return workReportService.findWorkReportById(workReportId);
        } else {
            return DataResult.build(500,"工作报告获取失败");
        }
    }
}
