package com.liuming.crm.entity.customerEntity;

import java.util.Date;

public class Customer {
    private String customerId;

    private String customerName;

    private String customerStatusId;

    private String customerStatusName;

    private String userId;

    private String userName;

    private Date lastFollowUpDate;

    private String provinceCode;

    private String provinceShortName;

    private String cityCode;

    private String cityShortName;

    private String districtCode;

    private String districtShortName;

    private Integer customerPublicAreaStatus;

    private Date customerCreatedDate;

    private Date customerUpdatedDate;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCustomerStatusId() {
        return customerStatusId;
    }

    public void setCustomerStatusId(String customerStatusId) {
        this.customerStatusId = customerStatusId == null ? null : customerStatusId.trim();
    }

    public String getCustomerStatusName() {
        return customerStatusName;
    }

    public void setCustomerStatusName(String customerStatusName) {
        this.customerStatusName = customerStatusName == null ? null : customerStatusName.trim();
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

    public Date getLastFollowUpDate() {
        return lastFollowUpDate;
    }

    public void setLastFollowUpDate(Date lastFollowUpDate) {
        this.lastFollowUpDate = lastFollowUpDate;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getProvinceShortName() {
        return provinceShortName;
    }

    public void setProvinceShortName(String provinceShortName) {
        this.provinceShortName = provinceShortName == null ? null : provinceShortName.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getCityShortName() {
        return cityShortName;
    }

    public void setCityShortName(String cityShortName) {
        this.cityShortName = cityShortName == null ? null : cityShortName.trim();
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode == null ? null : districtCode.trim();
    }

    public String getDistrictShortName() {
        return districtShortName;
    }

    public void setDistrictShortName(String districtShortName) {
        this.districtShortName = districtShortName == null ? null : districtShortName.trim();
    }

    public Integer getCustomerPublicAreaStatus() {
        return customerPublicAreaStatus;
    }

    public void setCustomerPublicAreaStatus(Integer customerPublicAreaStatus) {
        this.customerPublicAreaStatus = customerPublicAreaStatus;
    }

    public Date getCustomerCreatedDate() {
        return customerCreatedDate;
    }

    public void setCustomerCreatedDate(Date customerCreatedDate) {
        this.customerCreatedDate = customerCreatedDate;
    }

    public Date getCustomerUpdatedDate() {
        return customerUpdatedDate;
    }

    public void setCustomerUpdatedDate(Date customerUpdatedDate) {
        this.customerUpdatedDate = customerUpdatedDate;
    }
}