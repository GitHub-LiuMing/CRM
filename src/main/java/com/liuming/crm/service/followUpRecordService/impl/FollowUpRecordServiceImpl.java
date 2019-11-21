package com.liuming.crm.service.followUpRecordService.impl;

import com.liuming.crm.entity.followUpRecordEntity.FollowUpRecord;
import com.liuming.crm.entity.followUpRecordEntity.FollowUpRecordWithBLOBs;
import com.liuming.crm.mapper.followUpRecordMapper.FollowUpRecordMapper;
import com.liuming.crm.service.followUpRecordService.FollowUpRecordService;
import com.liuming.crm.utils.DataResult;
import com.liuming.crm.utils.IDUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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

    @Override
    public DataResult addFollowUpRecord(FollowUpRecordWithBLOBs followUpRecordWithBLOBs) {
        followUpRecordWithBLOBs.setFollowUpRecordId(IDUtils.getID());
        followUpRecordWithBLOBs.setFollowUpRecordCreateDate(new Date());
        followUpRecordWithBLOBs.setFollowUpRecordUpdateDate(new Date());
        int i = followUpRecordMapper.insertSelective(followUpRecordWithBLOBs);
        if (i > 0) {
            return DataResult.build(200,"跟进记录添加成功");
        } else {
            return DataResult.build(500,"跟进记录添加失败");
        }
    }

    @Override
    public DataResult findFollowUpRecord(String userId) {
        // TODO: 2019/11/21 上线前需要完成根据用户表的用户类型分析返回的数据，如果只是普通用户，则返回该用户的跟进记录，如果类型为管理员和超级管理员，则返回所有用户的跟进记录
        List<FollowUpRecordWithBLOBs> followUpRecordWithBLOBsList =
                followUpRecordMapper.findFollowUpRecordByUserId(userId);
        return DataResult.ok(followUpRecordWithBLOBsList);
    }
}
