package com.example.service;

import com.example.entity.UserEntity;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dongshanyi
 * @since 2020/2/1
 */

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public UserEntity Sel(int id){
        return userMapper.Sel(id);
    }

    public List<UserEntity> getUserAll(){
        return userMapper.getUserAll();
    }
}
