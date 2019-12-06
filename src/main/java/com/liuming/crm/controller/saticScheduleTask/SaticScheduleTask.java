package com.liuming.crm.controller.saticScheduleTask;

import com.liuming.crm.entity.customerEntity.Customer;
import com.liuming.crm.entity.followUpRecordEntity.FollowUpRecordWithBLOBs;
import com.liuming.crm.mapper.customerMapper.CustomerMapper;
import com.liuming.crm.mapper.followUpRecordMapper.FollowUpRecordMapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Description 定时任务
 * @ClassName SaticScheduleTask
 * @Author 鲸落
 * @date 2019.12.06 14:15
 */

/**
 * Cron表达式参数分别表示：
 *
 * 秒（0~59） 例如0/5表示每5秒
 * 分（0~59）
 * 时（0~23）
 * 日（0~31）的某天，需计算
 * 月（0~11）
 * 周几（ 可填1-7 或 SUN/MON/TUE/WED/THU/FRI/SAT）
 */
@Component
@Configuration //1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling // 2.开启定时任务
public class SaticScheduleTask {
    @Resource
    private FollowUpRecordMapper followUpRecordMapper;

    @Resource
    private CustomerMapper customerMapper;
    //3.添加定时任务
    @Scheduled(cron = "0 0 0 1/1 * ?")
    //或直接指定时间间隔，例如：5秒
    //@Scheduled(fixedRate=5000)
    private void configureTasks() {
        //当前系统的毫秒值
        long l = System.currentTimeMillis();

        long s = 604800000;

        boolean b = false;

        //配置转换为毫秒值的时间格式
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = null;
        try {
            //查询客户ID状态为1，并且7天内没有跟进的客户，修改其客户状态到公海
            List<FollowUpRecordWithBLOBs> followUpRecordWithBLOBs = followUpRecordMapper.findFollowUpRecordByFollowUpDate();
            for (FollowUpRecordWithBLOBs followUpRecordWithBLOB : followUpRecordWithBLOBs) {
                long timestamp = followUpRecordWithBLOB.getFollowUpDate().getTime();
                b = s < l - timestamp;
                //当时间超出7天的时候，更改当前客户的状态
                if (b){
                    Customer customer1 = customerMapper.selectByPrimaryKey(followUpRecordWithBLOB.getCustomerId());
                    if (customer1.getCustomerPublicAreaStatus() == 1){
                        Customer customer = new Customer();
                        customer.setCustomerId(followUpRecordWithBLOB.getCustomerId());
                        customer.setCustomerPublicAreaStatus(0);
                        customer.setCustomerUpdatedDate(new Date());
                        customerMapper.updateByPrimaryKeySelective(customer);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
