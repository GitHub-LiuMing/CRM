package com.liuming.crm.service.customerService.impl;

import com.liuming.crm.entity.customerEntity.Customer;
import com.liuming.crm.mapper.customerMapper.CustomerMapper;
import com.liuming.crm.service.customerService.CustomerService;
import com.liuming.crm.utils.DataResult;
import com.liuming.crm.utils.IDUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

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

    @Override
    public DataResult addCustomer(Customer customer) {
        //手机号、微信号、旺旺号三者有其一存在，就无法保存该客户
        Customer findCustomerByPhoneAndWechatAndWangwang =
                customerMapper.findCustomerByPhoneAndWechatAndWangwang(customer);
        if (findCustomerByPhoneAndWechatAndWangwang == null) {
            customer.setCustomerId(IDUtils.getID());
            customer.setCustomerCreatedDate(new Date());
            customer.setCustomerUpdatedDate(new Date());
            int i = customerMapper.insertSelective(customer);
            if (i > 0) {
                return DataResult.build(200, "客户新增成功");
            } else {
                return DataResult.build(500, "客户新增失败");
            }
        } else {
            return DataResult.build(500, "该客户信息已存在");
        }
    }

    @Override
    public DataResult findCustomer(String userId) {
        List<Customer> customerList = customerMapper.findCustomerByUserId(userId);
        return DataResult.ok(customerList);
    }
}
