package com.liuming.crm.service.customerService.impl;

import com.liuming.crm.mapper.customerMapper.CustomerMapper;
import com.liuming.crm.service.customerService.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description
 * @ClassName CustomerServiceImpl
 * @Author 鲸落
 * @date 2019.11.19 22:45
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Resource
    private CustomerMapper customerMapper;
}
