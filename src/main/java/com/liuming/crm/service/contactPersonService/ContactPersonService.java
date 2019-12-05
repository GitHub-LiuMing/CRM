package com.liuming.crm.service.contactPersonService;

import com.liuming.crm.entity.contactPersonEntity.ContactPerson;
import com.liuming.crm.utils.DataResult;

public interface ContactPersonService {
    DataResult addContactPerson(ContactPerson contactPerson);

    DataResult findContactPerson(String customerId);
}
