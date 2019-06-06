package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.entity.User;
import com.example.mybatisdemo.entity.UserSexEnum;
import com.example.mybatisdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "insert")
    public List<User> insert(){
        userMapper.insert(new User("aa", "a123456", UserSexEnum.MAN, "zhangsan"));
        return userMapper.getAll();
    }

    @RequestMapping(value = "query/{id}")
    public User getOne(@PathVariable("id")long id){
        return userMapper.getOne(id);
    }

    @RequestMapping(value = "update/{id}/{username}/{nickname}")
    public User update(@PathVariable("id")long id, @PathVariable("username")String username, @PathVariable("nickname")String nickname){
        User u=userMapper.getOne(id);
        u.setUserName(username);
        u.setNickName(nickname);
        userMapper.update(u);
        return userMapper.getOne(id);
    }
    @RequestMapping(value = "delete/{id}")
    public String delete(@PathVariable("id")long id){
        userMapper.delete(id);
        return "Success";
    }
}
