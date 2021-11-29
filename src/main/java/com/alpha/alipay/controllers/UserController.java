package com.alpha.alipay.controllers;

import com.alpha.alipay.mappers.UserMapper;
import com.alpha.alipay.models.User;
import com.alpha.alipay.response.Result;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController
{
    @Resource
    private final UserMapper userMapper;

    @PostMapping("/save")
    public Result saveUser(User user)
    {
        userMapper.insert(user);
        return Result.success();
    }
}
