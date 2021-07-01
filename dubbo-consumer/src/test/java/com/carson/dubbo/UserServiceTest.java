package com.carson.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.carsonlius.dubbo.poj.User;
import com.carsonlius.dubbo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@SpringBootApplication
@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Reference(version = "1.0.0")
    private UserService userService;

    @Test
    public void tetQueryAll(){
        List<User> userList = userService.queryAll();
        System.out.println(userList);
    }
}
