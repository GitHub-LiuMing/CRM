package com.liuming.crm.service.provinceService.impl;

import com.liuming.crm.entity.provinceEntity.Province;
import com.liuming.crm.mapper.provinceMapper.ProvinceMapper;
import com.liuming.crm.service.provinceService.ProvinceService;
import com.liuming.crm.utils.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description 
 * @ClassName ProvinceServiceImpl
 * @Author 鲸落
 * @date 2019.07.29 16:10
 */
@Service
public class ProvinceServiceImpl implements ProvinceService {
    @Resource
    private ProvinceMapper provinceMapper;

    @Override
    public DataResult findProvince() {
        List<Province> provinceList = provinceMapper.findProvince();
        return DataResult.ok(provinceList);
    }
}
