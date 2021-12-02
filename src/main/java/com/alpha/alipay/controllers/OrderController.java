package com.alpha.alipay.controllers;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;
import com.alpha.alipay.mappers.BookMapper;
import com.alpha.alipay.mappers.OrderMapper;
import com.alpha.alipay.models.Book;
import com.alpha.alipay.models.Order;
import com.alpha.alipay.response.Result;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigDecimal;

@RestController
@AllArgsConstructor
@RequestMapping("/order")
public class OrderController
{
    @Resource
    private OrderMapper rderMapper;

    @Resource
    private BookMapper bookMapper;

    @PostMapping
    public Result save(@RequestBody Order Order)
    {
        rderMapper.insert(Order);
        return Result.success();
    }

    @PutMapping
    public Result update(@RequestBody Order Order)
    {
        rderMapper.updateById(Order);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Long id)
    {
        rderMapper.deleteById(id);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Long id)
    {
        return Result.success(rderMapper.selectById(id));
    }

    @GetMapping("/buy/{bookId}")
    public Result buy(@PathVariable Long bookId)
    {
        Book book = bookMapper.selectById(bookId);
        String orderNo = IdUtil.getSnowflake().nextIdStr();
        String payUrl = "http://localhost:9000/alipay/pay?subject=" + book.getName() + "&traceNo=" + orderNo + "&totalAmount=" + book.getPrice();

//        User user = getUser();
        Order order = new Order();
        order.setOrderNo(orderNo);
        order.setTotalPrice(book.getPrice());
        order.setPayPrice(book.getPrice());
        order.setTransportPrice(BigDecimal.ZERO);
//        order.setUserId(user.getId());
//        order.setUsername(user.getUsername());
        order.setName(book.getName());
        save(order);
        // 新建订单，扣减库存
        return Result.success(payUrl);
    }

    @GetMapping
    public Result findPage(@RequestParam(defaultValue = "1") Integer page,
                           @RequestParam(defaultValue = "10") Integer size,
                           @RequestParam(defaultValue = "") String search)
    {
        LambdaQueryWrapper<Order> wrapper = Wrappers.lambdaQuery();
        if (StrUtil.isNotBlank(search))
        {
            wrapper.like(Order::getOrderNo, search);
        }
        Page<Order> OrderPage = rderMapper.selectPage(new Page<>(page, size), wrapper);
        return Result.success(OrderPage);
    }
}
