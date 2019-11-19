package com.liuming.crm.service.cityService.impl;

import com.liuming.crm.entity.cityEntity.City;
import com.liuming.crm.mapper.cityMapper.CityMapper;
import com.liuming.crm.service.cityService.CityService;
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
 * @ClassName CityServiceImpl
 * @Author 鲸落
 * @date 2019.07.30 14:14
 */
@Service
public class CityServiceImpl implements CityService {
    @Resource
    private CityMapper cityMapper;

    @Override
    public DataResult findCity(String provinceCode) {
        Map map = new HashMap();
        if (StringUtils.isNotBlank(provinceCode)){
            map.put("provinceCode", provinceCode);
        }
        List<City> cityList = cityMapper.findCity(map);
        return DataResult.ok(cityList);
    }
}
