package com.liuming.crm.service.contactPersonService.impl;

import com.liuming.crm.entity.contactPersonEntity.ContactPerson;
import com.liuming.crm.mapper.contactPersonMapper.ContactPersonMapper;
import com.liuming.crm.service.contactPersonService.ContactPersonService;
import com.liuming.crm.utils.DataResult;
import com.liuming.crm.utils.IDUtils;
import org.apache.commons.lang3.StringUtils;
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

        //查询手机号、微信号、旺旺号
        if (StringUtils.isNotBlank(contactPerson.getContactPersonPhone())){
            //当手机号不等于空的时候查询手机号是否存在在客户联系人列表中
            List<ContactPerson> contactPersonByPhone = contactPersonMapper.findContactPersonByPhone(contactPerson.getContactPersonPhone());
            if (contactPersonByPhone.size() == 0){
                //没有通过手机号查询到客户联系人列表
                if (StringUtils.isNotBlank(contactPerson.getContactPersonWechat())){
                    //当微信号不等于空的时候查询微信号是否存在在客户联系人列表中
                    List<ContactPerson> contactPersonByWechat = contactPersonMapper.findContactPersonByWechat(contactPerson.getContactPersonWechat());
                    if (contactPersonByWechat.size() == 0){
                        //没有通过微信号查询到客户联系人列表
                        if (StringUtils.isNotBlank(contactPerson.getContactPersonWangwang())){
                            //当旺旺号不等于空的时候查询旺旺号是否存在在客户联系人列表
                            List<ContactPerson> contactPersonByWangwang = contactPersonMapper.findContactPersonByWangwang(contactPerson.getContactPersonWangwang());
                            if (contactPersonByWangwang.size() == 0){
                                //没有通过旺旺号查询到客户联系人列表
                                int i = contactPersonMapper.insertSelective(contactPerson);
                                if (i > 0) {
                                    return DataResult.build(200,"联系人新增成功");
                                } else {
                                    return DataResult.build(500,"联系人新增失败");
                                }
                            } else {
                                //通过旺旺号查询到客户联系人列表
                                return DataResult.build(500,"该联系人已存在");
                            }
                        } else {
                            //当旺旺号等于空的时候，返回不得为空的提示
                            return DataResult.build(500,"请填写手机号、微信号或者旺旺号三者其一");
                        }
                    } else {
                        //通过微信号查询到客户联系人列表
                        return DataResult.build(500,"该联系人已存在");
                    }
                } else {
                    //微信号为空，查询旺旺号
                    if (StringUtils.isNotBlank(contactPerson.getContactPersonWangwang())){
                        //旺旺号不为空的时候查询旺旺号是否存在在客户联系人列表中
                        List<ContactPerson> contactPersonByWangwang = contactPersonMapper.findContactPersonByWangwang(contactPerson.getContactPersonWangwang());
                        if (contactPersonByWangwang.size() == 0){
                            //没有查询到客户联系人列表
                            int i = contactPersonMapper.insertSelective(contactPerson);
                            if (i > 0) {
                                return DataResult.build(200,"联系人新增成功");
                            } else {
                                return DataResult.build(500,"联系人新增失败");
                            }
                        } else {
                            //查询到客户联系人列表
                            return DataResult.build(500,"该联系人已存在");
                        }
                    } else {
                        //旺旺号为空的时候返回相应提示语
                        return DataResult.build(500,"请填写手机号、微信号或者旺旺号三者其一");
                    }
                }
            } else {
                //通过手机号查询到客户联系人列表
                return DataResult.build(500,"该联系人已存在");
            }
        } else {
            //查询微信号
            if (StringUtils.isNotBlank(contactPerson.getContactPersonWechat())){
                //当微信号不为空的时候查询微信号是否存在在客户联系人列表中
                List<ContactPerson> contactPersonByWechat = contactPersonMapper.findContactPersonByWechat(contactPerson.getContactPersonWechat());
                if (contactPersonByWechat.size() == 0){
                    //没有通过微信号查询到客户联系人列表中的数据
                    if (StringUtils.isNotBlank(contactPerson.getContactPersonWangwang())){
                        //当旺旺号不为空的时候查询旺旺号是否存在在客户联系人列表中
                        List<ContactPerson> contactPersonByWangwang = contactPersonMapper.findContactPersonByWangwang(contactPerson.getContactPersonWangwang());
                        if (contactPersonByWangwang.size() == 0){
                            //没有通过旺旺号查询到客户联系人列表中的数据
                            int i = contactPersonMapper.insertSelective(contactPerson);
                            if (i > 0) {
                                return DataResult.build(200,"联系人新增成功");
                            } else {
                                return DataResult.build(500,"联系人新增失败");
                            }
                        } else {
                            //通过旺旺号查询到客户联系人列表中的数据
                            return DataResult.build(500,"该联系人已存在");
                        }
                    } else {
                        //旺旺号为空的时候返回相应的提示语
                        return DataResult.build(500,"请填写手机号、微信号或者旺旺号三者其一");
                    }
                } else {
                    //通过微信号查询到客户联系人列表中的数据
                    return DataResult.build(500,"该联系人已存在");
                }
            } else {
                //查询旺旺号
                if (StringUtils.isNotBlank(contactPerson.getContactPersonWangwang())){
                    //当旺旺号不为空的时候查询旺旺号是否存在在客户联系人列表中
                    List<ContactPerson> contactPersonByWangwang = contactPersonMapper.findContactPersonByWangwang(contactPerson.getContactPersonWangwang());
                    if (contactPersonByWangwang.size() == 0){
                        //没有通过旺旺号查询到客户联系人
                        int i = contactPersonMapper.insertSelective(contactPerson);
                        if (i > 0) {
                            return DataResult.build(200,"联系人新增成功");
                        } else {
                            return DataResult.build(500,"联系人新增失败");
                        }
                    } else {
                        //通过旺旺号查询到客户联系人
                        return DataResult.build(500,"该联系人已存在");
                    }
                } else {
                    return DataResult.build(500,"请填写手机号、微信号或者旺旺号三者其一");
                }
            }
        }
        /*int i = contactPersonMapper.insertSelective(contactPerson);
        if (i > 0) {
            return DataResult.build(200,"联系人新增成功");
        } else {
            return DataResult.build(500,"联系人新增失败");
        }*/
    }

    @Override
    public DataResult findContactPerson(String customerId) {
        List<ContactPerson> contactPersonList = contactPersonMapper.findContactPersonByCustomerId(customerId);
        return DataResult.ok(contactPersonList);
    }
}
