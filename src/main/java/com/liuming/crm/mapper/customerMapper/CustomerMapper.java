package com.liuming.crm.mapper.customerMapper;

import com.liuming.crm.entity.customerEntity.Customer;
import com.liuming.crm.entity.customerEntity.CustomerAndContactPerson;
import com.liuming.crm.entity.customerEntity.CustomerExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CustomerMapper {
    int countByExample(CustomerExample example);

    int deleteByExample(CustomerExample example);

    int deleteByPrimaryKey(String customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExample(CustomerExample example);

    Customer selectByPrimaryKey(String customerId);

    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    List<CustomerAndContactPerson> findCustomerByUserId(@Param("userId") String userId,
                                                        @Param("customerSearchContent") String customerSearchContent);

    List<CustomerAndContactPerson> findCustomer();

    int findCustomerCount();

    int findCustomerCountByUserId(@Param("userId") String userId, @Param("customerSearchContent") String customerSearchContent);

    List<CustomerAndContactPerson> findCustomerPublicArea();

    List<CustomerAndContactPerson> findCustomerByCustomerSearchContent(@Param("customerSearchContent") String customerSearchContent);

    int findCustomerCountByCustomerSearchContent(@Param("customerSearchContent") String customerSearchContent);

    List<CustomerAndContactPerson> findCustomerByCustomerSearchContentAndCustomerStatusId(@Param(
            "customerSearchContent") String customerSearchContent, @Param("customerStatusId") String customerStatusId);

    int findCustomerCountByCustomerSearchContentAndCustomerStatusId(@Param("customerSearchContent") String customerSearchContent,
                                                                    @Param("customerStatusId") String customerStatusId);

    List<CustomerAndContactPerson> findCustomerByUserIdAndCustomerSearchContentAndCustomerStatusId(@Param("userId") String userId,
                                                                                                   @Param("customerSearchContent") String customerSearchContent, @Param("customerStatusId") String customerStatusId);

    int findCustomerCountByUserIdAndCustomerSearchContentAndCustomerStatusId(@Param("userId") String userId,
                                                                             @Param("customerSearchContent") String customerSearchContent,
                                                                             @Param("customerStatusId") String customerStatusId);
}