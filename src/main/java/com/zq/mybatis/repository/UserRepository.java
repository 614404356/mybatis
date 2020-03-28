package com.zq.mybatis.repository;

import com.zq.mybatis.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserRepository {

   public List<User> getUser();
}
