package com.example.mapper;

import com.example.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author dongshanyi
 * @since 2020/2/1
 */

@Repository
public interface UserMapper {

    UserEntity Sel(int id);

    List<UserEntity> getUserAll();
}
