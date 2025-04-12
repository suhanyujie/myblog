package com.su.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserQueryDto {
    private Integer[] ids;
    private String name;
    private String orderBy;
    private Integer pageNum;
    private Integer pageSize;
}
