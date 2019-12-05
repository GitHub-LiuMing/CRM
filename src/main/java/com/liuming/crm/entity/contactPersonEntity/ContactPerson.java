package com.liuming.crm.entity.contactPersonEntity;

import java.util.Date;

public class ContactPerson {
    private String contactPersonId;

    private String customerId;

    private String contactPersonName;

    private String contactPersonPhone;

    private String contactPersonWechat;

    private String contactPersonWangwang;

    private Integer contactPersonStatus;

    private Date contactPersonCreatedDate;

    private Date contactPersonUpdatedDate;

    public String getContactPersonId() {
        return contactPersonId;
    }

    public void setContactPersonId(String contactPersonId) {
        this.contactPersonId = contactPersonId == null ? null : contactPersonId.trim();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getContactPersonName() {
        return contactPersonName;
    }

    public void setContactPersonName(String contactPersonName) {
        this.contactPersonName = contactPersonName == null ? null : contactPersonName.trim();
    }

    public String getContactPersonPhone() {
        return contactPersonPhone;
    }

    public void setContactPersonPhone(String contactPersonPhone) {
        this.contactPersonPhone = contactPersonPhone == null ? null : contactPersonPhone.trim();
    }

    public String getContactPersonWechat() {
        return contactPersonWechat;
    }

    public void setContactPersonWechat(String contactPersonWechat) {
        this.contactPersonWechat = contactPersonWechat == null ? null : contactPersonWechat.trim();
    }

    public String getContactPersonWangwang() {
        return contactPersonWangwang;
    }

    public void setContactPersonWangwang(String contactPersonWangwang) {
        this.contactPersonWangwang = contactPersonWangwang == null ? null : contactPersonWangwang.trim();
    }

    public Integer getContactPersonStatus() {
        return contactPersonStatus;
    }

    public void setContactPersonStatus(Integer contactPersonStatus) {
        this.contactPersonStatus = contactPersonStatus;
    }

    public Date getContactPersonCreatedDate() {
        return contactPersonCreatedDate;
    }

    public void setContactPersonCreatedDate(Date contactPersonCreatedDate) {
        this.contactPersonCreatedDate = contactPersonCreatedDate;
    }

    public Date getContactPersonUpdatedDate() {
        return contactPersonUpdatedDate;
    }

    public void setContactPersonUpdatedDate(Date contactPersonUpdatedDate) {
        this.contactPersonUpdatedDate = contactPersonUpdatedDate;
    }
}