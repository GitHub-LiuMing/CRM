package com.liuming.crm.entity.followUpRecordEntity;

import lombok.Data;

import java.util.Date;

@Data
public class FollowUpRecord {
    private String followUpRecordId;

    private String userId;

    private String userName;

    private String customerId;

    private String customerName;

    private Date followUpDate;

    private String followUpTheme;

    private Date nextRemindDate;

    private Integer followUpRecordType;

    private Integer followUpRecordStatus;

    private Date followUpRecordCreateDate;

    private Date followUpRecordUpdateDate;
}