package com.su.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.su.web.dto.UserQueryDto;
import com.su.web.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
    List<UserEntity> getList(UserQueryDto userQueryDto);

    UserEntity getUserByEmail(String email);
}
