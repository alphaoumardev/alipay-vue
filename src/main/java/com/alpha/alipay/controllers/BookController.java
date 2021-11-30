package com.alpha.alipay.controllers;

import com.alpha.alipay.mappers.BookMapper;
import com.alpha.alipay.models.Book;
import com.alpha.alipay.response.Result;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
@AllArgsConstructor
public class BookController
{

    private BookMapper bookMapper;

    @PostMapping("/add")
    public Result<?> saveUser(@RequestBody Book book)
    {

        bookMapper.insert(book);
        return Result.success();
    }
    @PutMapping("/update")
    public Result<?> updateUser(@RequestBody Book book)
    {
        bookMapper.updateById(book);
        return Result.success();
    }
    @PutMapping("/delete/{id}")
    public Result<?> deleteUser(@PathVariable("id")Long id)
    {
        bookMapper.deleteById(id);
        return Result.success();
    }

    @GetMapping("/list")
    public Result<?> pagination(@RequestParam(value = "page",defaultValue = "1") Integer page,
                                @RequestParam(value = "size",defaultValue = "10") Integer size,
                                @RequestParam(defaultValue = "") String search)
    {
        Page<Book> pageInfo = new Page<>(page, size);
        LambdaQueryWrapper<Book> wrapper = Wrappers.lambdaQuery();
        if(StringUtils.isNotBlank(search))
        {
            wrapper.like(Book::getName, search);
        }
        Page<Book> userPage = bookMapper.selectPage(pageInfo, wrapper);
        return Result.success(userPage);
    }
}
