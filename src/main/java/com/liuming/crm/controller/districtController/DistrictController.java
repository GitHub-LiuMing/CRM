package com.liuming.crm.controller.districtController;

import com.liuming.crm.service.districtService.DistrictService;
import com.liuming.crm.utils.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description 区
 * @ClassName DistrictController
 * @Author 鲸落
 * @date 2019.07.31 19:17
 */
@RestController
@RequestMapping("/district")
public class DistrictController {
    @Resource
    private DistrictService districtService;

    /**
     * @Description 查询区
     * @param cityCode 城市代码
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2019.07.31 15:46
     */
    @RequestMapping("/findDistrict")
    public DataResult findDistrict(String cityCode){
        return districtService.findDistrict(cityCode);
    }
}
