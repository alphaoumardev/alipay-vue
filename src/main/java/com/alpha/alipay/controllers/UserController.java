package com.alpha.alipay.controllers;

import com.alpha.alipay.mappers.UserMapper;
import com.alpha.alipay.models.User;
import com.alpha.alipay.response.Result;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController
{

    private final UserMapper userMapper;

    @PostMapping("/add")
    public Result saveUser(@RequestBody User user)
    {
        if(user.getPassword()==null)
        {
            user.setPassword("123456");
        }
        userMapper.insert(user);
        return Result.success();
    }
    @PutMapping("/update")
    public Result updateUser(@RequestBody User user)
    {
        userMapper.updateById(user);
        return Result.success();
    }
    @DeleteMapping("/delete/{id}")
    public Result deleteUser(@PathVariable("id")Long id)
    {
        userMapper.deleteById(id);
        return Result.success();
    }

    @GetMapping("/list")
    public Result pagination(@RequestParam(value = "page",defaultValue = "1") Integer page,
                             @RequestParam(value = "size",defaultValue = "10") Integer size,
                             @RequestParam(defaultValue = "") String search)
    {
        Page<User> pageInfo = new Page<>(page, size);
        LambdaQueryWrapper<User> wrapper = Wrappers.lambdaQuery();
        if(StringUtils.isNotBlank(search))
        {
            wrapper.like(User::getNickName, search);
        }
        Page<User> userPage = userMapper.selectPage(pageInfo, wrapper);
        return Result.success(userPage);
    }
    @PostMapping("/login")
    public Result login(@RequestBody User user)
    {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
            wrapper.eq("username", user.getUsername());
            wrapper.eq("password", user.getPassword());

        User result =userMapper.selectOne(wrapper);
        if(result==null)
        {
            return Result.error("-1","The username or the password is not correct");
        }
        return Result.success();
    }
    @PostMapping("/register")
    public Result register(@RequestBody User user)
    {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username", user.getUsername());

        User result =userMapper.selectOne(wrapper);
        if(result!=null)
        {
            return Result.error("-1","This user already exist try again!");
        }
        if(user.getPassword()==null)
        {
            user.setPassword("123456");
        }
        userMapper.insert(user);
        return Result.success();
    }
}
