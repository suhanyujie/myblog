package com.su.web.dto;

import lombok.*;
import org.apache.catalina.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class UserQueryDto {
    /// 查询条件相关的参数
    private Long[] ids;
    private Long id;
    private String name;
    private String orderBy;
    private Integer pageNum;
    private Integer pageSize;

    /// 查询条件无关的参数

}
