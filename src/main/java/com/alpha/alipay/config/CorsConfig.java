package com.alpha.alipay.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer
{
    // 当前跨域请求最大有效时长。这里默认1天
    private static final long MAX_AGE = 24 * 60 * 60;

    private CorsConfiguration buildConfig()
    {
        CorsConfiguration cor = new CorsConfiguration();
        cor.addAllowedOrigin("*"); // 1 设置访问源地址
        cor.addAllowedHeader("*"); // 2 设置访问源请求头
        cor.addAllowedMethod("*"); // 3 设置访问源请求方法
        cor.setMaxAge(MAX_AGE);
        return cor;
    }

        @Override
        public void addCorsMappings(CorsRegistry registry)
        {
            registry.addMapping("/**")
                    .allowedOrigins("*")
                    .allowedMethods("GET", "HEAD", "POST", "PUT", "DELETE", "OPTIONS")
//                    .allowCredentials(true)
                    .maxAge(3600)
                    .allowedHeaders("*");
        }

    @Bean
    public CorsFilter corsFilter()
    {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", buildConfig()); // 4 对接口配置跨域设置
        return new CorsFilter(source);
    }
}
