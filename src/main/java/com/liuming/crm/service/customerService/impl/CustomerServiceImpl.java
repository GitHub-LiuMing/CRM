package com.liuming.crm.service.customerService.impl;

import com.github.pagehelper.PageHelper;
import com.liuming.crm.entity.contactPersonEntity.ContactPerson;
import com.liuming.crm.entity.customerEntity.Customer;
import com.liuming.crm.entity.customerEntity.CustomerAndContactPerson;
import com.liuming.crm.entity.customerEntity.CustomerDetails;
import com.liuming.crm.entity.followUpRecordEntity.FollowUpRecord;
import com.liuming.crm.entity.followUpRecordEntity.FollowUpRecordWithBLOBs;
import com.liuming.crm.entity.userEntity.User;
import com.liuming.crm.mapper.contactPersonMapper.ContactPersonMapper;
import com.liuming.crm.mapper.customerMapper.CustomerMapper;
import com.liuming.crm.mapper.followUpRecordMapper.FollowUpRecordMapper;
import com.liuming.crm.mapper.userMapper.UserMapper;
import com.liuming.crm.service.customerService.CustomerService;
import com.liuming.crm.utils.DataResult;
import com.liuming.crm.utils.IDUtils;
import com.liuming.crm.utils.PageBean;
import com.sun.xml.internal.bind.v2.TODO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Resource
    private ContactPersonMapper contactPersonMapper;

    @Resource
    private FollowUpRecordMapper followUpRecordMapper;

    @Override
    public DataResult addCustomer(Customer customer, ContactPerson contactPerson) {
        //手机号、微信号、旺旺号三者有其一存在，就无法保存该客户
        ContactPerson findContactPersonByPhoneOrWechatOrWangwang =
                contactPersonMapper.findContactPersonByPhoneOrWechatOrWangwang(contactPerson);
        if (findContactPersonByPhoneOrWechatOrWangwang == null) {
            String id = IDUtils.getID();
            customer.setCustomerId(id);
            customer.setCustomerCreatedDate(new Date());
            customer.setCustomerUpdatedDate(new Date());
            int i = customerMapper.insertSelective(customer);
            if (i > 0) {
                contactPerson.setContactPersonId(IDUtils.getID());
                contactPerson.setCustomerId(id);
                contactPerson.setContactPersonCreatedDate(new Date());
                contactPerson.setContactPersonUpdatedDate(new Date());
                int i1 = contactPersonMapper.insertSelective(contactPerson);
                if (i1 > 0){
                    return DataResult.build(200,"客户新增成功");
                } else {
                    return DataResult.build(500, "客户新增失败");
                }
            } else {
                return DataResult.build(500, "客户新增失败");
            }
        } else {
            return DataResult.build(500, "该客户信息已存在");
        }
    }

    @Override
    public DataResult findCustomerByUserId(int pageNum, int pageSize, String userId, String customerSearchContent) {
        User user = userMapper.selectByPrimaryKey(userId);
        PageHelper.startPage(pageNum, pageSize);
        List<CustomerAndContactPerson> customerAndContactPersonList;
        int customerCount;
        PageBean<CustomerAndContactPerson> personPageBean;
        if (user != null) {
            if(pageNum > 0 && pageSize >= 1){
                if (user.getUserType() == 0 || user.getUserType() == 1) {
                    /**
                     * 当用户类型为超级管理员和管理员的时候，返回所有的客户
                     */
                    // TODO: 2019/11/26 返回结果要获取最新的联系人信息
                    customerAndContactPersonList = customerMapper.findCustomerByCustomerSearchContent(customerSearchContent);
                    customerCount = customerMapper.findCustomerCountByCustomerSearchContent(customerSearchContent);
                    personPageBean = new PageBean<>(pageNum, pageSize, customerCount);
                    personPageBean.setItems(customerAndContactPersonList);
                    return DataResult.ok(personPageBean);
                } else {
                    customerAndContactPersonList = customerMapper.findCustomerByUserId(userId, customerSearchContent);
                    customerCount = customerMapper.findCustomerCountByUserId(userId, customerSearchContent);
                    personPageBean = new PageBean<>(pageNum, pageSize, customerCount);
                    personPageBean.setItems(customerAndContactPersonList);
                    return DataResult.ok(personPageBean);
                }
            } else {
                if (user.getUserType() == 0 || user.getUserType() == 1) {
                    /**
                     * 当用户类型为超级管理员和管理员的时候，返回所有的客户
                     */
                    // TODO: 2019/11/26 返回结果要获取最新的联系人信息
                    customerAndContactPersonList = customerMapper.findCustomerByCustomerSearchContent(customerSearchContent);
                    customerCount = customerMapper.findCustomerCountByCustomerSearchContent(customerSearchContent);
                    personPageBean = new PageBean<>(pageNum, pageSize, customerCount);
                    personPageBean.setItems(customerAndContactPersonList);
                    return DataResult.ok(personPageBean);
                } else {
                    customerAndContactPersonList = customerMapper.findCustomerByUserId(userId, customerSearchContent);
                    customerCount = customerMapper.findCustomerCountByUserId(userId, customerSearchContent);
                    personPageBean = new PageBean<>(pageNum, pageSize, customerCount);
                    personPageBean.setItems(customerAndContactPersonList);
                    return DataResult.ok(personPageBean);
                }
            }
        } else {
            return DataResult.build(500,"用户不存在");
        }
    }

    @Override
    public DataResult updateCustomer(Customer customer) {
        Customer selectByPrimaryKey = customerMapper.selectByPrimaryKey(customer.getCustomerId());
        if (selectByPrimaryKey.getCustomerStatusId().equals("2") && selectByPrimaryKey.getCustomerStatusName().equals(
                "已成交")){
            //判断用户是否成交
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

    @Override
    public DataResult findCustomerPublicArea(int pageNum, int pageSize) {
        List<CustomerAndContactPerson> customerPublicArea = customerMapper.findCustomerPublicArea();
        List<CustomerAndContactPerson> customerAndContactPersonList;
        int customerPublicAreaCount;
        if (pageNum > 0 && pageSize >= 1){
            PageHelper.startPage(pageNum, pageSize);
            customerAndContactPersonList = customerMapper.findCustomerPublicArea();
            customerPublicAreaCount = customerPublicArea.size();
            PageBean<CustomerAndContactPerson> customerAndContactPersonPageBean = new PageBean<>(pageNum, pageSize,
                    customerPublicAreaCount);
            customerAndContactPersonPageBean.setItems(customerAndContactPersonList);
            return DataResult.ok(customerAndContactPersonPageBean);
        } else {
            customerAndContactPersonList = customerMapper.findCustomerPublicArea();
            return DataResult.ok(customerAndContactPersonList);
        }
    }

    @Override
    @Transactional
    public DataResult findCustomerById(String customerId) {
        try {
            CustomerDetails customerDetails = new CustomerDetails();
            Customer customer = customerMapper.selectByPrimaryKey(customerId);
            customerDetails.setCustomer(customer);
            List<ContactPerson> contactPersonByCustomerId = contactPersonMapper.findContactPersonByCustomerId(customerId);
            customerDetails.setContactPersonList(contactPersonByCustomerId);
            List<FollowUpRecordWithBLOBs> followUpRecordWithBLOBs = followUpRecordMapper.findFollowUpRecordByCustomerId(customerId);
            customerDetails.setFollowUpRecordWithBLOBsList(followUpRecordWithBLOBs);
            return DataResult.ok(customerDetails);
        } catch (Exception e) {
            return DataResult.build(500,"系统异常");
        }
    }
}
