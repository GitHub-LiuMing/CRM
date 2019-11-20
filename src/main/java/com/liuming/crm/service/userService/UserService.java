package com.liuming.crm.service.userService;

import com.liuming.crm.entity.userEntity.User;
import com.liuming.crm.utils.DataResult;

public interface UserService {
    DataResult addUser(User user);

    DataResult findUser();
}
