package com.liuming.crm.service.customerService.impl;

import com.liuming.crm.entity.customerEntity.Customer;
import com.liuming.crm.entity.userEntity.User;
import com.liuming.crm.mapper.customerMapper.CustomerMapper;
import com.liuming.crm.mapper.userMapper.UserMapper;
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

    @Resource
    private UserMapper userMapper;

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
        User user = userMapper.selectByPrimaryKey(userId);
        List<Customer> customerList;
        if (user != null) {
            if (user.getUserType() == 0 || user.getUserType() == 1) {
                /**
                 * 当用户类型为超级管理员和管理员的时候，返回所有的客户
                 */
                List<Customer> customers = customerMapper.findCustomer();
                return DataResult.ok(customers);
            } else {
                customerList = customerMapper.findCustomerByUserId(userId);
                return DataResult.ok(customerList);
            }
        } else {
            return DataResult.build(500,"用户不存在");
        }
    }

    @Override
    public DataResult updateCustomer(Customer customer) {
        Customer selectByPrimaryKey = customerMapper.selectByPrimaryKey(customer.getCustomerId());
        if (selectByPrimaryKey.getCustomerStatusName().equals("已成交")){//判断用户是否成交
            if (selectByPrimaryKey.getUserId() == customer.getUserId()){
                //用户已成交，并且用户ID和修改前的ID相同，则允许对客户信息进行修改
                int i = customerMapper.updateByPrimaryKeySelective(customer);
                if (i > 0){
                    return DataResult.build(200,"客户信息修改成功");
                } else {
                    return DataResult.build(500,"客户信息修改失败");
                }
            } else {
                //用户已成交，但是用户ID和修改前的ID不同，则不允许对客户信息进行修改
                return DataResult.build(500,"该客户已成交，无权修改该客户信息");
            }
        } else {
            //用户未成交，允许修改客户信息
            int i = customerMapper.updateByPrimaryKeySelective(customer);
            if (i > 0){
                return DataResult.build(200,"客户信息修改成功");
            } else {
                return DataResult.build(500,"客户信息修改失败");
            }
        }

    }
}
