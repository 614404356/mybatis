package com.zq.mybatis;

import com.zq.mybatis.entity.User;
import com.zq.mybatis.service.UserService;
import com.zq.mybatis.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisApplicationTests {


    @Autowired
    private UserService userService;
    @Test
    void contextLoads() {
        List<User> users = userService.getUser();

        for (User user : users){
            System.out.println(user);
        }


    }

}
