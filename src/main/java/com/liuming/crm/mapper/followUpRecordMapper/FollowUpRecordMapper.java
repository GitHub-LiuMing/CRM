package com.liuming.crm.mapper.followUpRecordMapper;

import com.liuming.crm.entity.followUpRecordEntity.FollowUpRecord;
import com.liuming.crm.entity.followUpRecordEntity.FollowUpRecordExample;
import com.liuming.crm.entity.followUpRecordEntity.FollowUpRecordWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FollowUpRecordMapper {
    int countByExample(FollowUpRecordExample example);

    int deleteByExample(FollowUpRecordExample example);

    int deleteByPrimaryKey(String followUpRecordId);

    int insert(FollowUpRecordWithBLOBs record);

    int insertSelective(FollowUpRecordWithBLOBs record);

    List<FollowUpRecordWithBLOBs> selectByExampleWithBLOBs(FollowUpRecordExample example);

    List<FollowUpRecord> selectByExample(FollowUpRecordExample example);

    FollowUpRecordWithBLOBs selectByPrimaryKey(String followUpRecordId);

    int updateByExampleSelective(@Param("record") FollowUpRecordWithBLOBs record, @Param("example") FollowUpRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") FollowUpRecordWithBLOBs record, @Param("example") FollowUpRecordExample example);

    int updateByExample(@Param("record") FollowUpRecord record, @Param("example") FollowUpRecordExample example);

    int updateByPrimaryKeySelective(FollowUpRecordWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(FollowUpRecordWithBLOBs record);

    int updateByPrimaryKey(FollowUpRecord record);

    List<FollowUpRecordWithBLOBs> findFollowUpRecordByUserId(@Param("userId") String userId);
}