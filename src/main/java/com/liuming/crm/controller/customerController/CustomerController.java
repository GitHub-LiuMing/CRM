package com.liuming.crm.controller.customerController;

import com.liuming.crm.entity.customerEntity.Customer;
import com.liuming.crm.service.customerService.CustomerService;
import com.liuming.crm.utils.DataResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
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
     * @param customer
     * @return com.liuming.crm.utils.DataResult
     * @Description 添加客户
     * @Author 鲸落
     * @Date 2019.11.22 10:49
     */
    @RequestMapping("/addCustomer")
    public DataResult addCustomer(Customer customer) {
        if (StringUtils.isNotBlank(customer.getCustomerName())
                && StringUtils.isNotBlank(customer.getCustomerStatusId())
                && StringUtils.isNotBlank(customer.getCustomerStatusName())
                && StringUtils.isNotBlank(customer.getUserId())
                && StringUtils.isNotBlank(customer.getUserName())) {
            if (StringUtils.isNotBlank(customer.getCustomerPhone())
                    || StringUtils.isNotBlank(customer.getCustomerWechat())
                    || StringUtils.isNotBlank(customer.getCustomerWangwang())) {
                return customerService.addCustomer(customer);
            } else {
                return DataResult.build(500, "请选填客户电话、客户微信号、客户阿里旺旺号任意一个");
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
    @RequestMapping("/findCustomer")
    public DataResult findCustomer(String userId) {
        if (StringUtils.isNotBlank(userId)) {
            return customerService.findCustomer(userId);
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
}
