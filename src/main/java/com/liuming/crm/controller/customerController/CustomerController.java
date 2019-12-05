package com.liuming.crm.controller.customerController;

import com.liuming.crm.entity.contactPersonEntity.ContactPerson;
import com.liuming.crm.entity.customerEntity.Customer;
import com.liuming.crm.service.customerService.CustomerService;
import com.liuming.crm.utils.DataResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Descripti 客户
 * @ClassName CustomerController
 * @Author 鲸落
 * @date 2019.11.19 22:40
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Resource
    private CustomerService customerService;

    /**
     * @Description 添加客户
     * @param customer
     * @param contactPerson
     * @return com.liuming.crm.utils.DataResult
     * @Author 鲸落
     * @Date 2019.11.22 10:49
     */
    @RequestMapping("/addCustomer")
    public DataResult addCustomer(Customer customer, ContactPerson contactPerson) {
        if (StringUtils.isNotBlank(customer.getCustomerName())
                && StringUtils.isNotBlank(customer.getCustomerStatusId())
                && StringUtils.isNotBlank(customer.getCustomerStatusName())
                && StringUtils.isNotBlank(customer.getUserId())
                && StringUtils.isNotBlank(customer.getUserName())) {
            if (StringUtils.isNotBlank(contactPerson.getContactPersonName())
                    && StringUtils.isNotBlank(contactPerson.getContactPersonPhone())
                    || StringUtils.isNotBlank(contactPerson.getContactPersonWechat())
                    || StringUtils.isNotBlank(contactPerson.getContactPersonWangwang())) {
                return customerService.addCustomer(customer, contactPerson);
            } else {
                return DataResult.build(500, "请必填联系人姓名和选填客户电话、客户微信号、客户阿里旺旺号任意一个");
            }
        } else {
            return DataResult.build(500, "客户名称、客户状态ID、客户状态名称、用户ID、用户名称不得为空");
        }
    }

    /**
     * @Description 查询客户
     * @param userId
     * @return com.liuming.crm.utils.DataResult
     * @Author 鲸落
     * @Date 2019.11.23 10:01
     */
    @RequestMapping("/findCustomerByUserId")
    public DataResult findCustomerByUserId(@RequestParam(defaultValue = "1") int pageNum,
                                   @RequestParam(defaultValue = "10") int pageSize,
                                   String userId, String customerSearchContent) {
        if (StringUtils.isNotBlank(userId)) {
            return customerService.findCustomerByUserId(pageNum, pageSize, userId, customerSearchContent);
        } else {
            return DataResult.build(500, "用户ID不得为空");
        }
    }
    /**
     * @Description 修改客户信息
     * @param customer
     * @return com.liuming.crm.utils.DataResult
     * @Author 鲸落
     * @Date 2019.11.23 15:45
     */
    @RequestMapping("/updateCustomer")
    public DataResult updateCustomer(Customer customer){
        return customerService.updateCustomer(customer);
    }

    /**
     * @Description 查询公海客户
     * @param pageNum
     * @param pageSize
     * @return com.liuming.crm.utils.DataResult
     * @Author 鲸落
     * @Date 2019.11.29 09:00
     */
    @RequestMapping("/findCustomerPublicArea")
    public DataResult findCustomerPublicArea(@RequestParam(defaultValue = "1") int pageNum,
                                             @RequestParam(defaultValue = "10") int pageSize){
        return customerService.findCustomerPublicArea(pageNum, pageSize);
    }

    /**
     * @Description 根据客户ID查询客户详情
     * @param customerId
     * @return com.liuming.crm.utils.DataResult
     * @Author 鲸落
     * @Date 2019.12.02 14:10
     */
    @RequestMapping("/findCustomerById")
    public DataResult findCustomerById(String customerId){
        if (StringUtils.isNotBlank(customerId)) {
            return customerService.findCustomerById(customerId);
        } else {
            return DataResult.build(500,"客户信息获取失败");
        }
    }
}
