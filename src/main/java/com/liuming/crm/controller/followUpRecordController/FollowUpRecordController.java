package com.liuming.crm.controller.followUpRecordController;

import com.liuming.crm.entity.followUpRecordEntity.FollowUpRecordWithBLOBs;
import com.liuming.crm.service.followUpRecordService.FollowUpRecordService;
import com.liuming.crm.utils.DataResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description 跟进记录
 * @ClassName FollowUpRecordController
 * @Author 鲸落
 * @date 2019.11.21 11:02
 */
@RestController
@RequestMapping("/followUpRecord")
public class FollowUpRecordController {
    @Resource
    private FollowUpRecordService followUpRecordService;

    /**
     * @Description 新增跟进记录
     * @param followUpRecordWithBLOBs
     * @return com.liuming.crm.utils.DataResult
     * @Author 鲸落
     * @Date 2019.11.21 14:54
     */
    @RequestMapping("/addFollowUpRecord")
    public DataResult addFollowUpRecord(FollowUpRecordWithBLOBs followUpRecordWithBLOBs) {
        if (StringUtils.isNotBlank(followUpRecordWithBLOBs.getUserId())
                && StringUtils.isNotBlank(followUpRecordWithBLOBs.getUserName())
                && StringUtils.isNotBlank(followUpRecordWithBLOBs.getCustomerId())
                && StringUtils.isNotBlank(followUpRecordWithBLOBs.getCustomerName())
                && followUpRecordWithBLOBs.getFollowUpDate() != null
                && StringUtils.isNotBlank(followUpRecordWithBLOBs.getFollowUpTheme())
                && StringUtils.isNotBlank(followUpRecordWithBLOBs.getFollowUpContent())
                && followUpRecordWithBLOBs.getNextRemindDate() != null
                && StringUtils.isNotBlank(followUpRecordWithBLOBs.getNextFollowUpTheme())
                && StringUtils.isNotBlank(followUpRecordWithBLOBs.getNextFollowUpContent())
                && followUpRecordWithBLOBs.getFollowUpRecordType() != null) {
            return followUpRecordService.addFollowUpRecord(followUpRecordWithBLOBs);
        } else {
            return DataResult.build(500, "用户ID、用户名称、客户ID、客户名称、跟进时间、跟进主题、跟进内容、下次提醒时间、下次跟进主题、下次跟进内容、跟进类型等不得为空");
        }
    }

    /**
     * @Description 查询跟进记录
     * @param userId
     * @return com.liuming.crm.utils.DataResult
     * @Author 鲸落
     * @Date 2019.11.29 09:30
     */
    @RequestMapping("/findFollowUpRecordByUserId")
    public DataResult findFollowUpRecordByUserId(String userId){
        if (StringUtils.isNotBlank(userId)){
            return followUpRecordService.findFollowUpRecordByUserId(userId);
        } else {
            return DataResult.build(500,"用户ID不能为空");
        }
    }

    /**
     * @Description 查询跟进提醒
     * @param userId
     * @return com.liuming.crm.utils.DataResult
     * @Author 鲸落
     * @Date 2019.11.29 09:32
     */
    @RequestMapping("/findFollowUpRecordByRemind")
    public DataResult findFollowUpRecordByRemind(String userId){
        if (StringUtils.isNotBlank(userId)) {
            return followUpRecordService.findFollowUpRecordByRemind(userId);
        } else {
            return DataResult.build(500,"用户ID获取失败");
        }
    }

    /**
     * @Description 根据跟进ID查询跟进详情
     * @param followUpRecordId
     * @return com.liuming.crm.utils.DataResult
     * @Author 鲸落
     * @Date 2019.12.02 10:41
     */
    @RequestMapping("/findFollowUpRecordById")
    public DataResult findFollowUpRecordById(String followUpRecordId){
        if (StringUtils.isNotBlank(followUpRecordId)) {
            return followUpRecordService.findFollowUpRecordById(followUpRecordId);
        } else {
            return DataResult.build(500,"跟进记录ID获取失败");
        }
    }

    /**
     * @Description 根据客户ID查询跟进记录
     * @param customerId
     * @return com.liuming.crm.utils.DataResult
     * @Author 鲸落
     * @Date 2019.12.02 14:17
     */
    @RequestMapping("/findFollowUpRecordByCustomerId")
    public DataResult findFollowUpRecordByCustomerId(String customerId){
        if (StringUtils.isNotBlank(customerId)) {
            return followUpRecordService.findFollowUpRecordByCustomerId(customerId);
        } else {
            return DataResult.build(500,"客户信息获取失败");
        }
    }
}
