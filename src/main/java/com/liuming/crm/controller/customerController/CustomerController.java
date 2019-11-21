package com.liuming.crm.controller.customerController;

import com.liuming.crm.service.customerService.CustomerService;
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
}
