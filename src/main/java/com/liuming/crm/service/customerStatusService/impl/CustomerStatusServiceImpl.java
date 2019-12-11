package com.liuming.crm.service.customerStatusService.impl;

import com.liuming.crm.entity.customerStatusEntity.CustomerStatus;
import com.liuming.crm.mapper.customerStatusMapper.CustomerStatusMapper;
import com.liuming.crm.service.customerStatusService.CustomerStatusService;
import com.liuming.crm.utils.DataResult;
import com.liuming.crm.utils.IDUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Description 
 * @ClassName CustomerStatusServiceImpl
 * @Author 鲸落
 * @date 2019.11.19 11:20
 */
@Service
public class CustomerStatusServiceImpl implements CustomerStatusService {
    @Resource
    private CustomerStatusMapper customerStatusMapper;

    @Override
    public DataResult addCustomerStatus(CustomerStatus customerStatus) {
        try {
            //判断用户名是否存在,判断ID是否存在
            if (customerStatus.getCustomerStatusName() != null){
                CustomerStatus customerStatusName =
                        customerStatusMapper.findCustomerStatusByName(customerStatus.getCustomerStatusName());
                if (customerStatusName == null) {
                    customerStatus.setCustomerStatusId(IDUtils.getID());
                    customerStatus.setCustomerStatusCreatedDate(new Date());
                    customerStatus.setCustomerStatusUpdatedDate(new Date());
                    int i = customerStatusMapper.insertSelective(customerStatus);
                    if (i > 0){
                        return DataResult.build(200,"客户状态新增成功");
                    } else {
                        return DataResult.build(500,"客户状态新增异常");
                    }
                } else {
                    return DataResult.build(500,"客户状态已存在");
                }
            } else {
                return DataResult.build(500,"客户名称不得为空");
            }
        } catch (Exception e) {
            return DataResult.build(500,"系统异常");
        }
    }

    @Override
    public DataResult delCustomerStatus(String customerStatusId) {
        int i = customerStatusMapper.delCustomerStatus(customerStatusId);
        if (i > 0) {
            return DataResult.build(200,"客户状态删除成功");
        } else {
            return DataResult.build(500,"客户状态删除异常");
        }
    }

    @Override
    public DataResult findCustomerStatus() {
        List<CustomerStatus> customerStatusList = customerStatusMapper.findCustomerStatus();
        return DataResult.ok(customerStatusList);
    }
}
