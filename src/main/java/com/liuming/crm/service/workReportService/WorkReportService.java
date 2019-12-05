package com.liuming.crm.service.workReportService;

import com.liuming.crm.entity.workReportEntity.WorkReportWithBLOBs;
import com.liuming.crm.utils.DataResult;

public interface WorkReportService {
    DataResult addWorkReport(WorkReportWithBLOBs workReportWithBLOBs);

    DataResult findWorkReportByUserId(int pageNum, int pageSize, String workReportUserId);

    DataResult addReviews(WorkReportWithBLOBs workReportWithBLOBs);

    DataResult findWorkReportById(String workReportId);
}
