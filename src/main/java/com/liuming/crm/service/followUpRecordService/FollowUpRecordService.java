package com.liuming.crm.service.followUpRecordService;

import com.liuming.crm.entity.followUpRecordEntity.FollowUpRecordWithBLOBs;
import com.liuming.crm.utils.DataResult;

public interface FollowUpRecordService {
    DataResult addFollowUpRecord(FollowUpRecordWithBLOBs followUpRecordWithBLOBs);

    DataResult findFollowUpRecordByUserId(String userId);

    DataResult findFollowUpRecordByRemind(String userId);

    DataResult findFollowUpRecordById(String followUpRecordId);

    DataResult findFollowUpRecordByCustomerId(String customerId);
}
