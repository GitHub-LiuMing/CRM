package com.liuming.crm.entity.workReportEntity;

import lombok.Data;

import java.util.Date;

@Data
public class WorkReport {
    private String workReportId;

    private String workReportUserId;

    private String workReportUserName;

    private String reviewsUserId;

    private String reviewsUserName;

    private Integer workReportType;

    private Date workReportCreatedDate;

    private Date workReportUpdatedDate;
}