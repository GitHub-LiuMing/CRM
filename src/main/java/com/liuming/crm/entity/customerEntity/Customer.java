package com.liuming.crm.entity.customerEntity;

import lombok.Data;

import java.util.Date;

@Data
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
}