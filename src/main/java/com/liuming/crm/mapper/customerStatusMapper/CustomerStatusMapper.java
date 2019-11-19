package com.liuming.crm.mapper.customerStatusMapper;

import com.liuming.crm.entity.customerStatusEntity.CustomerStatus;
import com.liuming.crm.entity.customerStatusEntity.CustomerStatusExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CustomerStatusMapper {
    int countByExample(CustomerStatusExample example);

    int deleteByExample(CustomerStatusExample example);

    int deleteByPrimaryKey(String customerStatusId);

    int insert(CustomerStatus record);

    int insertSelective(CustomerStatus record);

    List<CustomerStatus> selectByExample(CustomerStatusExample example);

    CustomerStatus selectByPrimaryKey(String customerStatusId);

    int updateByExampleSelective(@Param("record") CustomerStatus record, @Param("example") CustomerStatusExample example);

    int updateByExample(@Param("record") CustomerStatus record, @Param("example") CustomerStatusExample example);

    int updateByPrimaryKeySelective(CustomerStatus record);

    int updateByPrimaryKey(CustomerStatus record);

    CustomerStatus findCustomerStatusByName(@Param("customerStatusName") Integer customerStatusName);

    int delCustomerStatus(@Param("customerStatusId") String customerStatusId);

    List<CustomerStatus> findCustomerStatus();
}