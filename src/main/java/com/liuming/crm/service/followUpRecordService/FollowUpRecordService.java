package com.liuming.crm.service.followUpRecordService;

import com.liuming.crm.entity.followUpRecordEntity.FollowUpRecordWithBLOBs;
import com.liuming.crm.utils.DataResult;

public interface FollowUpRecordService {
    DataResult addFollowUpRecord(FollowUpRecordWithBLOBs followUpRecordWithBLOBs);

    DataResult findFollowUpRecord(String userId);
}
