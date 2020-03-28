package com.zq.mybatis.service.impl;

import com.zq.mybatis.entity.User;
import com.zq.mybatis.repository.UserRepository;
import com.zq.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUser() {
        List<User> users = userRepository.getUser();
        return users;
    }
}
