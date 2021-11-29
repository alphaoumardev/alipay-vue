package com.alpha.alipay.models;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@TableName("book")
@Data
public class Book
{
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private String author;
    private String cover;
    private String userId;
    private BigDecimal price;
    @TableField(exist = false)
    private String username;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date createTime;
}
