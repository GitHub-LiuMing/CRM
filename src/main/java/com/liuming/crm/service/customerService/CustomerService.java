package com.liuming.crm.service.customerService;

import com.liuming.crm.entity.contactPersonEntity.ContactPerson;
import com.liuming.crm.entity.contactPersonEntity.ContactPersonCustomerSearchContent;
import com.liuming.crm.entity.customerEntity.Customer;
import com.liuming.crm.utils.DataResult;

public interface CustomerService {
    DataResult addCustomer(Customer customer, ContactPersonCustomerSearchContent contactPerson);

    DataResult findCustomerByUserId(int pageNum, int pageSize, String userId, String customerSearchContent,
                                    String customerStatusId);

    DataResult updateCustomer(Customer customer);

    DataResult findCustomerPublicArea(int pageNum, int pageSize);

    DataResult findCustomerById(String customerId);
}
