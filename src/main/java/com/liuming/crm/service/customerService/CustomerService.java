package com.liuming.crm.service.customerService;

import com.liuming.crm.entity.contactPersonEntity.ContactPerson;
import com.liuming.crm.entity.customerEntity.Customer;
import com.liuming.crm.utils.DataResult;

public interface CustomerService {
    DataResult addCustomer(Customer customer, ContactPerson contactPerson);

    DataResult findCustomerByUserId(int pageNum, int pageSize, String userId, String customerSearchContent);

    DataResult updateCustomer(Customer customer);

    DataResult findCustomerPublicArea(int pageNum, int pageSize);

    DataResult findCustomerById(String customerId);
}
