package com.liuming.crm.controller.followUpRecordController;

import com.liuming.crm.entity.followUpRecordEntity.FollowUpRecordWithBLOBs;
import com.liuming.crm.service.followUpRecordService.FollowUpRecordService;
import com.liuming.crm.utils.DataResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description
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

    @RequestMapping("/findFollowUpRecord")
    public DataResult findFollowUpRecord(String userId){
        if (StringUtils.isNotBlank(userId)){
            return followUpRecordService.findFollowUpRecord(userId);
        } else {
            return DataResult.build(500,"用户ID不能为空");
        }
    }
}
