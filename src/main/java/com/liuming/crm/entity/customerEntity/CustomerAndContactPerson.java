package com.liuming.crm.entity.customerEntity;

import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @Description 
 * @ClassName CustomerAndContactPerson
 * @Author 鲸落
 * @date 2019.11.26 15:18
 */
@Data
public class CustomerAndContactPerson extends Customer {
    private String contactPersonId;

    private String contactPersonName;

    private String contactPersonPhone;

    private String contactPersonWechat;

    private String contactPersonWangwang;

    private Integer contactPersonStatus;

    private Date contactPersonCreatedDate;

    private Date contactPersonUpdatedDate;
}
