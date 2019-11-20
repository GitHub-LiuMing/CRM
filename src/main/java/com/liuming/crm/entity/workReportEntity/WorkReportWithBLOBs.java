package com.liuming.crm.entity.workReportEntity;

public class WorkReportWithBLOBs extends WorkReport {
    private String workReportContent;

    private String reviews;

    public String getWorkReportContent() {
        return workReportContent;
    }

    public void setWorkReportContent(String workReportContent) {
        this.workReportContent = workReportContent == null ? null : workReportContent.trim();
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews == null ? null : reviews.trim();
    }
}