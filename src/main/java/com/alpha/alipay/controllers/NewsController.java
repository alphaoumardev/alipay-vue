package com.alpha.alipay.controllers;

import com.alpha.alipay.mappers.NewsMapper;
import com.alpha.alipay.models.News;
import com.alpha.alipay.response.Result;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@AllArgsConstructor
@RequestMapping("/news")
public class NewsController
{
    private final NewsMapper newsMapper;
    @PostMapping("/add")
    public Result saveUser(@RequestBody News news)
    {
        news.setTime(new Date());
        newsMapper.insert(news);
        return Result.success();
    }
    @PutMapping("/update")
    public Result updateUser(@RequestBody News news)
    {
        newsMapper.updateById(news);
        return Result.success();
    }
    @PutMapping("/delete/{id}")
    public Result deleteUser(@PathVariable("id")Long id)
    {
        newsMapper.deleteById(id);
        return Result.success();
    }

    @GetMapping("/list")
    public Result pagination(@RequestParam(value = "page",defaultValue = "1") Integer page,
                             @RequestParam(value = "size",defaultValue = "10") Integer size,
                             @RequestParam(defaultValue = "") String search)
    {
        Page<News> pageInfo = new Page<>(page, size);
        LambdaQueryWrapper<News> wrapper = Wrappers.lambdaQuery();
        if(StringUtils.isNotBlank(search))
        {
            wrapper.like(News::getTitle, search);
        }
        Page<News> userPage = newsMapper.selectPage(pageInfo, wrapper);
        return Result.success(userPage);
    }

}
