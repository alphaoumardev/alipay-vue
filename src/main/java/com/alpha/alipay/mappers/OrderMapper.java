package com.alpha.alipay.mappers;

import com.alpha.alipay.models.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {

    void updateState(String tradeNo, int i, String gmtPayment);
}
