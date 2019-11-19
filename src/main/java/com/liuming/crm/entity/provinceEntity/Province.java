package com.liuming.crm.entity.provinceEntity;

import lombok.Data;

import java.util.Date;

@Data
public class Province {
    private Integer provinceId;

    private String provinceCode;

    private String provinceName;

    private String shortName;

    private String lng;

    private String lat;

    private Integer sort;

    private Date gmtCreate;

    private Date gmtModified;

    private String memo;

    private Integer dataState;
}