package com.liuming.crm.controller.userController;

import com.liuming.crm.entity.userEntity.User;
import com.liuming.crm.service.userService.UserService;
import com.liuming.crm.utils.DataResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description 用户
 * @ClassName UserController
 * @Author 鲸落
 * @date 2019.11.20 11:19
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/addUser")
    public DataResult addUser(User user){
        if (StringUtils.isNotBlank(user.getUserName()) && StringUtils.isNotBlank(user.getUserPassword()) && user.getUserType() != null){
            return userService.addUser(user);
        } else {
            return DataResult.build(500,"用户名、密码、用户类型不得为空");
        }
    }

    @RequestMapping("/findUser")
    public DataResult findUser(){
        return userService.findUser();
    }
}
