package com.liuming.crm.entity.customerStatusEntity;

import lombok.Data;

import java.util.Date;

@Data
public class CustomerStatus {
    private String customerStatusId;

    private String customerStatusName;

    private Integer customerStatusStatus;

    private Date customerStatusCreatedDate;

    private Date customerStatusUpdatedDate;
}