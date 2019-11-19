package com.liuming.crm.service.customerStatusService;

import com.liuming.crm.entity.customerStatusEntity.CustomerStatus;
import com.liuming.crm.utils.DataResult;

public interface CustomerStatusService {
    DataResult addCustomerStatus(CustomerStatus customerStatus);

    DataResult delCustomerStatus(String customerStatusId);

    DataResult findCustomerStatus();
}
