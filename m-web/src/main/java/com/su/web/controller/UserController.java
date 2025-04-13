package com.su.web.controller;

import com.beust.jcommander.Parameter;
import com.su.web.dto.UserQueryDto;
import com.su.web.service.impl.UserSvc;
import com.su.web.utils.Response;
import com.su.web.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserSvc userSvc;

    @GetMapping(path = "/getUserList")
    public <E> E getUserList(@RequestParam String ids) {
        List<Long> idList = Arrays.stream(ids.split(",")).map(item -> Long.parseLong(item.trim())).toList();
        Long[] idArr = idList.toArray(new Long[0]); // `new Long[0]` 部分称为“类型指示器”
        UserQueryDto userQueryDto = UserQueryDto.builder()
                .ids(idArr)
                .name("admin")
                .build();
        List<UserVo> list = this.userSvc.getUserList(userQueryDto);
        return (E) Response.success(list);
    }

    /// createUser updateUser disableUser deleteUser
    // create user todo
    public <E> E createUser(@RequestParam String username, @RequestParam String email, @RequestParam String pwd) {

        return (E) Response.success("");
    }

}
