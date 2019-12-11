package com.liuming.crm.service.userService.impl;

import com.github.pagehelper.PageHelper;
import com.liuming.crm.entity.userEntity.User;
import com.liuming.crm.mapper.userMapper.UserMapper;
import com.liuming.crm.service.userService.UserService;
import com.liuming.crm.utils.BCrypt;
import com.liuming.crm.utils.DataResult;
import com.liuming.crm.utils.IDUtils;
import com.liuming.crm.utils.PageBean;
import org.apache.commons.lang3.StringUtils;
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
        User selectByPrimaryKey = userMapper.selectByPrimaryKey(user.getUserId());
        if (selectByPrimaryKey != null ){
            if (selectByPrimaryKey.getUserType() == 0 || selectByPrimaryKey.getUserType() == 1) {
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
            } else {
                return DataResult.build(500,"您没有权限添加用户，请联系您的上级领导或管理员");
            }
        } else {
            return DataResult.build(500,"该用户不存在");
        }
    }

    @Override
    public DataResult findUser(int pageNum, int pageSize, User user) {
        if (StringUtils.isNotBlank(user.getUserId())) {
            User selectByPrimaryKey = userMapper.selectByPrimaryKey(user.getUserId());
            return DataResult.ok(selectByPrimaryKey);
        } else {
            if (pageNum > 0 && pageSize >= 1){
                PageHelper.startPage(pageNum, pageSize);
                List<User> userList = userMapper.findUser();
                int userCount = userMapper.findUserCount();
                PageBean<User> userPageBean = new PageBean<>(pageNum, pageSize, userCount);
                userPageBean.setItems(userList);
                return DataResult.ok(userPageBean);
            } else {
                List<User> userList = userMapper.findUser();
                return DataResult.ok(userList);
            }
        }
    }

    @Override
    public DataResult findUserLogin(String username, String password) {
        User userByUserName = userMapper.findUserByUserName(username);
        if (userByUserName != null){
            boolean checkpw = BCrypt.checkpw(password, userByUserName.getUserPassword());
            if (checkpw == true){
                return DataResult.ok(userByUserName);
            } else {
                return DataResult.build(500,"核验失败");
            }
        } else {
            return DataResult.build(500,"用户名不存在");
        }
    }

    @Override
    public DataResult updateUser(User user) {
        if (StringUtils.isNotBlank(user.getUserPassword())){
            user.setUserPassword(BCrypt.hashpw(user.getUserPassword(), BCrypt.gensalt()));
        }
        user.setUserUpdateDate(new Date());
        int i = userMapper.updateByPrimaryKeySelective(user);
        if (i > 0) {
            return DataResult.build(200,"用户信息更新成功");
        } else{
            return DataResult.build(500,"用户信息更新失败");
        }
    }
}
