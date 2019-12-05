package com.liuming.crm.controller.userController;

import com.liuming.crm.entity.userEntity.User;
import com.liuming.crm.service.userService.UserService;
import com.liuming.crm.utils.DataResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    /**
     * @Description 新增用户
     * @param user
     * @return com.liuming.crm.utils.DataResult
     * @Author 鲸落
     * @Date 2019.11.20 14:19
     */
    @RequestMapping("/addUser")
    public DataResult addUser(User user){
        if(StringUtils.isNotBlank(user.getUserId())){
            if (StringUtils.isNotBlank(user.getUserName()) && StringUtils.isNotBlank(user.getUserPassword()) && user.getUserType() != null){
                return userService.addUser(user);
            } else {
                return DataResult.build(500,"用户名、密码、用户类型不得为空");
            }
        } else {
            return DataResult.build(500,"无法判断您的身份");
        }
    }

    /**
     * @Description 查询用户
     * @param pageNum
     * @param pageSize
     * @param user
     * @return com.liuming.crm.utils.DataResult
     * @Author 鲸落
     * @Date 2019.11.20 14:19
     */
    @RequestMapping("/findUser")
    public DataResult findUser(@RequestParam(defaultValue = "1") int pageNum,
                               @RequestParam(defaultValue = "10") int pageSize,
                               User user){
        return userService.findUser(pageNum, pageSize, user);
    }

    /**
     * @Description 判断用户名密码实现登录
     * @param username
     * @param password
     * @return com.liuming.crm.utils.DataResult
     * @Author 鲸落
     * @Date 2019.11.26 14:46
     */
    @RequestMapping("/findUserLogin")
    public DataResult findUserLogin(String username, String password){
        if (StringUtils.isNotBlank(username) && StringUtils.isNotBlank(password)) {
            return userService.findUserLogin(username, password);
        } else {
            return DataResult.build(500,"用户名、密码不得为空");
        }
    }

    /**
     * @Description 更新用户信息
     * @param user
     * @return com.liuming.crm.utils.DataResult
     * @Author 鲸落
     * @Date 2019.11.29 10:09
     */
    @RequestMapping("/updateUser")
    public DataResult updateUser(User user){
        if (StringUtils.isNotBlank(user.getUserId())){
            return userService.updateUser(user);
        } else {
            return DataResult.build(500,"用户信息获取失败");
        }
    }
}
