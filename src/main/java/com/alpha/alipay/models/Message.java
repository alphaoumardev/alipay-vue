package com.alpha.alipay.models;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
@Data
@TableName("message")
public class Message extends Model<Message>
{
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String content;
    private String username;
    private String time;
    private Long parentId;
    @TableField(exist = false)
    private Message parentMessage;
    private Long foreignId;
    @TableField(exist = false)
    private String avatar;
}
