package com.su.web.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@TableName("`user`")
public class UserEntity implements Serializable {

    @Serial
    private static final long serialVersionUid = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private int id;
    private int nickname;
    private int email;
    private int password;
    private int avatar;
    @TableField("is_active")
    private int isActive;
    @TableField("created_at")
    private int createdAt;
    @TableField("updated_at")
    private int updatedAt;
    @TableField("deleted_at")
    private int deletedAt;
    @TableField("oauthProvider")
    private int oauth_provider;
    @TableField("oauth_id")
    private int oauthId;
}
