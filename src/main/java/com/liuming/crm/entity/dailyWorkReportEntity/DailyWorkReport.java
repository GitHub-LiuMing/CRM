package com.liuming.crm.entity.dailyWorkReportEntity;

import java.util.Date;

public class DailyWorkReport {
    private String dailyWorkReportId;

    private String userId;

    private String userName;

    private Date dailyWorkReportCreatedTime;

    private Date dailyWorkReportUpdatedTime;

    private String dailyWorkReportContent;

    public String getDailyWorkReportId() {
        return dailyWorkReportId;
    }

    public void setDailyWorkReportId(String dailyWorkReportId) {
        this.dailyWorkReportId = dailyWorkReportId == null ? null : dailyWorkReportId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Date getDailyWorkReportCreatedTime() {
        return dailyWorkReportCreatedTime;
    }

    public void setDailyWorkReportCreatedTime(Date dailyWorkReportCreatedTime) {
        this.dailyWorkReportCreatedTime = dailyWorkReportCreatedTime;
    }

    public Date getDailyWorkReportUpdatedTime() {
        return dailyWorkReportUpdatedTime;
    }

    public void setDailyWorkReportUpdatedTime(Date dailyWorkReportUpdatedTime) {
        this.dailyWorkReportUpdatedTime = dailyWorkReportUpdatedTime;
    }

    public String getDailyWorkReportContent() {
        return dailyWorkReportContent;
    }

    public void setDailyWorkReportContent(String dailyWorkReportContent) {
        this.dailyWorkReportContent = dailyWorkReportContent == null ? null : dailyWorkReportContent.trim();
    }
}