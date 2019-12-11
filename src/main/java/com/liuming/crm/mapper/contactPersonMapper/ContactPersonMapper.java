package com.liuming.crm.mapper.contactPersonMapper;

import com.liuming.crm.entity.contactPersonEntity.ContactPerson;
import com.liuming.crm.entity.contactPersonEntity.ContactPersonCustomerSearchContent;
import com.liuming.crm.entity.contactPersonEntity.ContactPersonExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ContactPersonMapper {
    int countByExample(ContactPersonExample example);

    int deleteByExample(ContactPersonExample example);

    int deleteByPrimaryKey(String contactPersonId);

    int insert(ContactPerson record);

    int insertSelective(ContactPerson record);

    List<ContactPerson> selectByExample(ContactPersonExample example);

    ContactPerson selectByPrimaryKey(String contactPersonId);

    int updateByExampleSelective(@Param("record") ContactPerson record, @Param("example") ContactPersonExample example);

    int updateByExample(@Param("record") ContactPerson record, @Param("example") ContactPersonExample example);

    int updateByPrimaryKeySelective(ContactPerson record);

    int updateByPrimaryKey(ContactPerson record);

    List<ContactPerson> findContactPersonByPhoneOrWechatOrWangwang(@Param("customerSearchContent") String customerSearchContent);

    List<ContactPerson> findContactPersonByCustomerId(@Param("customerId") String customerId);

    List<ContactPerson> findContactPersonByPhone(@Param("customerSearchContent") String customerSearchContent);

    List<ContactPerson> findContactPersonByWechat(@Param("customerSearchContent") String customerSearchContent);

    List<ContactPerson> findContactPersonByWangwang(@Param("customerSearchContent") String customerSearchContent);
}