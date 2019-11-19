package com.liuming.crm.service.districtService.impl;

import com.liuming.crm.entity.districtEntity.District;
import com.liuming.crm.mapper.districtMapper.DistrictMapper;
import com.liuming.crm.service.districtService.DistrictService;
import com.liuming.crm.utils.DataResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description 
 * @ClassName DistrictServiceImpl
 * @Author 鲸落
 * @date 2019.07.31 19:14
 */
@Service
public class DistrictServiceImpl implements DistrictService {
    @Resource
    private DistrictMapper districtMapper;

    @Override
    public DataResult findDistrict(String cityCode) {
        Map map = new HashMap();
        if (StringUtils.isNotBlank(cityCode)){
            map.put("cityCode",cityCode);
        }
        List<District> districtList = districtMapper.findDistrict(map);
        return DataResult.ok(districtList);
    }
}
