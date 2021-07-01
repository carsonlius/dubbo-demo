package com.carsonlius.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.carsonlius.dubbo.poj.User;
import com.carsonlius.dubbo.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Service(version = "${dubbo.server.version}")
public class UserServiceImpl implements UserService {
    @Override
    public List<User> queryAll() {
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId((long)(i+1));
            user.setUsername("username_" + i);
            user.setAge(i+10);
            user.setPassword("123456");

            userList.add(user);
        }

        return  userList;
    }
}
