package com.liuming.crm.service.followUpRecordService.impl;

import com.liuming.crm.entity.customerEntity.Customer;
import com.liuming.crm.entity.followUpRecordEntity.FollowUpRecordWithBLOBs;
import com.liuming.crm.entity.userEntity.User;
import com.liuming.crm.mapper.customerMapper.CustomerMapper;
import com.liuming.crm.mapper.followUpRecordMapper.FollowUpRecordMapper;
import com.liuming.crm.mapper.userMapper.UserMapper;
import com.liuming.crm.service.followUpRecordService.FollowUpRecordService;
import com.liuming.crm.utils.DataResult;
import com.liuming.crm.utils.IDUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Description
 * @ClassName FollowUpRecordServiceImpl
 * @Author 鲸落
 * @date 2019.11.21 10:56
 */
@Service
public class FollowUpRecordServiceImpl implements FollowUpRecordService {
    @Resource
    private FollowUpRecordMapper followUpRecordMapper;

    @Resource
    private UserMapper userMapper;

    @Resource
    private CustomerMapper customerMapper;

    @Override
    public DataResult addFollowUpRecord(FollowUpRecordWithBLOBs followUpRecordWithBLOBs) {
        followUpRecordWithBLOBs.setFollowUpRecordId(IDUtils.getID());
        followUpRecordWithBLOBs.setFollowUpRecordCreateDate(new Date());
        followUpRecordWithBLOBs.setFollowUpRecordUpdateDate(new Date());
        int i = followUpRecordMapper.insertSelective(followUpRecordWithBLOBs);
        if (i > 0) {
            Customer customer = new Customer();
            customer.setCustomerId(followUpRecordWithBLOBs.getCustomerId());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String format = simpleDateFormat.format(new Date());
            try {
                Date date = simpleDateFormat.parse(format);
                customer.setLastFollowUpDate(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            customer.setCustomerUpdatedDate(new Date());
            int i1 = customerMapper.updateByPrimaryKeySelective(customer);
            if (i1 > 0){
                return DataResult.build(200,"跟进记录添加成功");
            }
            return DataResult.build(500,"客户更新时间更新失败，请联系管理员手动修改");
        } else {
            return DataResult.build(500,"跟进记录添加失败");
        }
    }

    @Override
    public DataResult findFollowUpRecordByUserId(String userId) {
        User user = userMapper.selectByPrimaryKey(userId);
        List<FollowUpRecordWithBLOBs> followUpRecordWithBLOBsList;
        if (user != null){
            if (user.getUserType() == 0 || user.getUserType() == 1){
                followUpRecordWithBLOBsList = followUpRecordMapper.findFollowUpRecord();
                return DataResult.ok(followUpRecordWithBLOBsList);
            } else {
                followUpRecordWithBLOBsList =
                        followUpRecordMapper.findFollowUpRecordByUserId(userId);
                return DataResult.ok(followUpRecordWithBLOBsList);
            }
        } else {
            return DataResult.build(500,"用户不存在");
        }
    }

    @Override
    public DataResult findFollowUpRecordByRemind(String userId) {
        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        List<FollowUpRecordWithBLOBs> followUpRecordByUserId =
                followUpRecordMapper.findFollowUpRecordByUserIdAndDate(userId, date);
        return DataResult.ok(followUpRecordByUserId);
    }

    @Override
    public DataResult findFollowUpRecordById(String followUpRecordId) {
        FollowUpRecordWithBLOBs followUpRecordWithBLOBs = followUpRecordMapper.selectByPrimaryKey(followUpRecordId);
        return DataResult.ok(followUpRecordWithBLOBs);
    }

    @Override
    public DataResult findFollowUpRecordByCustomerId(String customerId) {
        List<FollowUpRecordWithBLOBs> followUpRecordByCustomerId = followUpRecordMapper.findFollowUpRecordByCustomerId(customerId);
        return DataResult.ok(followUpRecordByCustomerId);
    }
}
