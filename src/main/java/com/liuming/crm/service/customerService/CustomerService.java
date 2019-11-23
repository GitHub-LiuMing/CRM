package com.liuming.crm.service.customerService;

import com.liuming.crm.entity.customerEntity.Customer;
import com.liuming.crm.utils.DataResult;

public interface CustomerService {
    DataResult addCustomer(Customer customer);

    DataResult findCustomer(String userId);

    DataResult updateCustomer(Customer customer);
}
