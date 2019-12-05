package com.liuming.crm.controller.contactPersonController;

import com.liuming.crm.entity.contactPersonEntity.ContactPerson;
import com.liuming.crm.service.contactPersonService.ContactPersonService;
import com.liuming.crm.utils.DataResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description 联系人
 * @ClassName ContactPersonController
 * @Author 鲸落
 * @date 2019.11.26 11:25
 */
@RestController
@RequestMapping("/contactPerson")
public class ContactPersonController {
    @Resource
    private ContactPersonService contactPersonService;

    /**
     * @Description 新增联系人
     * @param contactPerson
     * @return com.liuming.crm.utils.DataResult
     * @Author 鲸落
     * @Date 2019.11.26 11:29
     */
    @RequestMapping("/addContactPerson")
    public DataResult addContactPerson(ContactPerson contactPerson){
        if (StringUtils.isNotBlank(contactPerson.getCustomerId())) {
            return contactPersonService.addContactPerson(contactPerson);
        } else {
            return DataResult.build(500,"客户ID不得为空");
        }
    }

    /**
     * @Description 查询客户联系人
     * @param customerId
     * @return com.liuming.crm.utils.DataResult
     * @Author 鲸落
     * @Date 2019.11.26 11:34
     */
    @RequestMapping("/findContactPerson")
    public DataResult findContactPerson(String customerId){
        if (StringUtils.isNotBlank(customerId)) {
            return contactPersonService.findContactPerson(customerId);
        } else {
            return DataResult.build(500,"客户ID不得为空");
        }
    }
}
