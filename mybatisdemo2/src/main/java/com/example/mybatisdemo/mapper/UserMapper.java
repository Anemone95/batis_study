package com.example.mybatisdemo.mapper;

import com.example.mybatisdemo.entity.User;
import com.example.mybatisdemo.entity.UserSexEnum;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    List<User> getAll();

    User getOne(Long id);

    void insert(User user);

    void update(User user);

    void delete(Long id);
}
