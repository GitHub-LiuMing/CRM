package com.liuming.crm.service.contactPersonService.impl;

import com.liuming.crm.entity.contactPersonEntity.ContactPerson;
import com.liuming.crm.mapper.contactPersonMapper.ContactPersonMapper;
import com.liuming.crm.service.contactPersonService.ContactPersonService;
import com.liuming.crm.utils.DataResult;
import com.liuming.crm.utils.IDUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Description 
 * @ClassName ContactPersonServiceImpl
 * @Author 鲸落
 * @date 2019.11.26 11:26
 */
@Service
public class ContactPersonServiceImpl implements ContactPersonService {
    @Resource
    private ContactPersonMapper contactPersonMapper;

    @Override
    public DataResult addContactPerson(ContactPerson contactPerson) {
        contactPerson.setContactPersonId(IDUtils.getID());
        contactPerson.setContactPersonCreatedDate(new Date());
        contactPerson.setContactPersonUpdatedDate(new Date());
        int i = contactPersonMapper.insertSelective(contactPerson);
        if (i > 0) {
            return DataResult.build(200,"联系人新增成功");
        } else {
            return DataResult.build(500,"联系人新增失败");
        }
    }

    @Override
    public DataResult findContactPerson(String customerId) {
        List<ContactPerson> contactPersonList = contactPersonMapper.findContactPersonByCustomerId(customerId);
        return DataResult.ok(contactPersonList);
    }
}
