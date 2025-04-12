package com.su.web.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@TableName("`user`")
public class UserEntity implements Serializable {

    @Serial
    private static final long serialVersionUid = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String nickname;
    private String email;
    private String password;
    private String avatar;
    @TableField("is_active")
    private int isActive;
    @TableField("created_at")
    private LocalDateTime createdAt;
    @TableField("updated_at")
    private LocalDateTime updatedAt;
    @TableField("deleted_at")
    private LocalDateTime deletedAt;
    @TableField("oauthProvider")
    private String oauth_provider;
    @TableField("oauth_id")
    private String oauthId;
}
