package com.liuming.crm.controller.provinceController;

import com.liuming.crm.service.provinceService.ProvinceService;
import com.liuming.crm.utils.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description 省份
 * @ClassName ProvinceController
 * @Author 鲸落
 * @date 2019.07.29 16:38
 */
@RestController
@RequestMapping("/province")
public class ProvinceController {
    @Resource
    private ProvinceService provinceService;

    /**
     * @Description 查询所有省
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2019.07.29 16:45
     */
    @RequestMapping(value = "/findProvince", method = RequestMethod.POST)
    public DataResult findProvince(){
        return provinceService.findProvince();
    }
}
