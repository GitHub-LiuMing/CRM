package com.liuming.crm.service.userService.impl;

import com.liuming.crm.entity.userEntity.User;
import com.liuming.crm.mapper.userMapper.UserMapper;
import com.liuming.crm.service.userService.UserService;
import com.liuming.crm.utils.BCrypt;
import com.liuming.crm.utils.DataResult;
import com.liuming.crm.utils.IDUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Description 
 * @ClassName UserServiceImpl
 * @Author 鲸落
 * @date 2019.11.20 11:22
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public DataResult addUser(User user) {
        User userByUserName = userMapper.findUserByUserName(user.getUserName());
        if (userByUserName == null){
            user.setUserId(IDUtils.getID());
            user.setUserPassword(BCrypt.hashpw(user.getUserPassword(), BCrypt.gensalt()));
            user.setUserCreateDate(new Date());
            user.setUserUpdateDate(new Date());
            int i = userMapper.insertSelective(user);
            if (i > 0){
                return DataResult.build(200,"用户新增成功");
            } else {
                return DataResult.build(500,"用户新增失败");
            }
        } else {
            return DataResult.build(500,"用户名已存在");
        }
    }

    @Override
    public DataResult findUser() {
        List<User> userList = userMapper.findUser();
        return DataResult.ok(userList);
    }
}
