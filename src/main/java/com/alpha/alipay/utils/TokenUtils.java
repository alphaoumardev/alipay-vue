package com.alpha.alipay.utils;

import cn.hutool.core.date.DateUtil;
import com.alpha.alipay.mappers.UserMapper;
import com.alpha.alipay.models.User;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Objects;

@Slf4j
@Component
@AllArgsConstructor
public class TokenUtils
{
    private UserMapper userMapper;
    private static UserMapper staticUserMapper;

    @PostConstruct
    public void init() {
        staticUserMapper = userMapper;
    }

    public static String getToken(User user)
    {
        return JWT.create().withExpiresAt(DateUtil.offsetDay(new Date(), 1)).withAudience(user.getId().toString())
                .sign(Algorithm.HMAC256(user.getPassword()));
    }

    public static User getUser()
    {
        try
        {
            HttpServletRequest request = ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
            String token = request.getHeader("token");
            String aud = JWT.decode(token).getAudience().get(0);
            Integer userId = Integer.valueOf(aud);
            return staticUserMapper.selectById(userId);
        }
        catch (Exception e)
        {
            log.error("解析token失败", e);
            return null;
        }
    }
}
