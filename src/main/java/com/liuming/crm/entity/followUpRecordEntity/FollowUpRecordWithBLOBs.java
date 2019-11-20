package com.liuming.crm.entity.followUpRecordEntity;

public class FollowUpRecordWithBLOBs extends FollowUpRecord {
    private String followUpContent;

    private String nextFollowUpContent;

    public String getFollowUpContent() {
        return followUpContent;
    }

    public void setFollowUpContent(String followUpContent) {
        this.followUpContent = followUpContent == null ? null : followUpContent.trim();
    }

    public String getNextFollowUpContent() {
        return nextFollowUpContent;
    }

    public void setNextFollowUpContent(String nextFollowUpContent) {
        this.nextFollowUpContent = nextFollowUpContent == null ? null : nextFollowUpContent.trim();
    }
}