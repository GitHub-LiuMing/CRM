package com.liuming.crm.controller.cityController;

import com.liuming.crm.service.cityService.CityService;
import com.liuming.crm.utils.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Descripti 市
 * @ClassName CityController
 * @Author 鲸落
 * @date 2019.07.30 14:12
 */
@RestController
@RequestMapping("/city")
public class CityController {
    @Resource
    private CityService cityService;

    /**
     * @Description 查询市
     * @param provinceCode 省份代码
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2019.07.30 15:01
     */
    @RequestMapping("/findCity")
    public DataResult findCity(String provinceCode){
        return cityService.findCity(provinceCode);
    }
}
