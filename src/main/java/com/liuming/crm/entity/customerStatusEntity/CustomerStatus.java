package com.liuming.crm.entity.customerStatusEntity;

import java.util.Date;

public class CustomerStatus {
    private String customerStatusId;

    private Integer customerStatusName;

    private Integer customerStatusStatus;

    private Date customerStatusCreatedDate;

    private Date customerStatusUpdatedDate;

    public String getCustomerStatusId() {
        return customerStatusId;
    }

    public void setCustomerStatusId(String customerStatusId) {
        this.customerStatusId = customerStatusId == null ? null : customerStatusId.trim();
    }

    public Integer getCustomerStatusName() {
        return customerStatusName;
    }

    public void setCustomerStatusName(Integer customerStatusName) {
        this.customerStatusName = customerStatusName;
    }

    public Integer getCustomerStatusStatus() {
        return customerStatusStatus;
    }

    public void setCustomerStatusStatus(Integer customerStatusStatus) {
        this.customerStatusStatus = customerStatusStatus;
    }

    public Date getCustomerStatusCreatedDate() {
        return customerStatusCreatedDate;
    }

    public void setCustomerStatusCreatedDate(Date customerStatusCreatedDate) {
        this.customerStatusCreatedDate = customerStatusCreatedDate;
    }

    public Date getCustomerStatusUpdatedDate() {
        return customerStatusUpdatedDate;
    }

    public void setCustomerStatusUpdatedDate(Date customerStatusUpdatedDate) {
        this.customerStatusUpdatedDate = customerStatusUpdatedDate;
    }
}