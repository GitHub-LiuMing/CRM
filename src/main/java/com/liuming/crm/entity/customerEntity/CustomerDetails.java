package com.liuming.crm.entity.customerEntity;

import com.liuming.crm.entity.contactPersonEntity.ContactPerson;
import com.liuming.crm.entity.followUpRecordEntity.FollowUpRecordWithBLOBs;
import lombok.Data;

import java.util.List;

/**
 * @Description 
 * @ClassName CustomerDetails
 * @Author 鲸落
 * @date 2019.12.02 11:29
 */
@Data
public class CustomerDetails {
    private Customer customer;

    List<ContactPerson> contactPersonList;

    List<FollowUpRecordWithBLOBs> followUpRecordWithBLOBsList;
}
