package com.alpha.alipay.mappers;

import com.alpha.alipay.models.User;
import com.alpha.alipay.models.UserAddressCountVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User>
{
    @Select("select count(*) count, address from user group by address ")
    List<UserAddressCountVo> countAddress();
}
