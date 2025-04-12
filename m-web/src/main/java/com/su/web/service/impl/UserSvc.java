package com.su.web.service.impl;

import com.su.web.dto.UserQueryDto;
import com.su.web.entity.UserEntity;
import com.su.web.mapper.UserMapper;
import com.su.web.service.IUserSvc;
import com.su.web.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserSvc implements IUserSvc {

    @Autowired
    private UserMapper userMapper;

    public List<UserVo> getUserList() {
        UserQueryDto userQueryDto = UserQueryDto.builder().ids(new Integer[]{1, 2, 3}).build();
        List<UserEntity> users = userMapper.getList();
        List<UserVo> voList = users.stream().map(item -> {
            UserVo tmpVo = new UserVo();
            tmpVo.setId(item.getId());
            tmpVo.setNickname(item.getNickname());
            tmpVo.setEmail(item.getEmail());
            tmpVo.setAvatar(item.getAvatar());
            return tmpVo;
        }).collect(Collectors.toList());
        return voList;
    }
}
