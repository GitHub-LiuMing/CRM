package com.liuming.crm.controller.customerStatusController;

import com.liuming.crm.entity.customerStatusEntity.CustomerStatus;
import com.liuming.crm.service.customerStatusService.CustomerStatusService;
import com.liuming.crm.utils.DataResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description 客户状态
 * @ClassName CustomerStatusController
 * @Author 鲸落
 * @date 2019.11.19 11:20
 */
@RestController
@RequestMapping("/customerStatus")
public class CustomerStatusController {
    @Resource
    private CustomerStatusService customerStatusService;

    /**
     * @Description 增加客户状态
     * @param customerStatus
     * @return com.liuming.crm.utils.DataResult
     * @Author 鲸落
     * @Date 2019.11.19 11:40
     */
    @RequestMapping("/addCustomerStatus")
    public DataResult addCustomerStatus(CustomerStatus customerStatus){
        return customerStatusService.addCustomerStatus(customerStatus);
    }

    /**
     * @Description 逻辑删除客户状态
     * @param customerStatusId
     * @return com.liuming.crm.utils.DataResult
     * @Author 鲸落
     * @Date 2019.11.19 15:48
     */
    @RequestMapping("/delCustomerStatus")
    public DataResult delCustomerStatus(String customerStatusId){
        if (StringUtils.isNotBlank(customerStatusId)) {
            return customerStatusService.delCustomerStatus(customerStatusId);
        } else {
            return DataResult.build(500,"客户状态ID不得为空");
        }
    }

    @RequestMapping("/updateCustomerStatus")
    public DataResult updateCustomerStatus(){
        // TODO: 2019/11/19  更新接口待完成
        return null;
    }

    @RequestMapping("/findCustomerStatus")
    public DataResult findCustomerStatus(){
        return customerStatusService.findCustomerStatus();
    }
}
