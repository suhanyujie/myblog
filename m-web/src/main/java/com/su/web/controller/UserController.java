package com.su.web.controller;

import com.su.web.service.impl.UserSvc;
import com.su.web.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "user")
public class UserController {

    @Autowired
    private UserSvc userSvc;

    @GetMapping(path = "/user/hello")
    public <E> E hello() {
        List<UserVo> list = this.userSvc.getUserList();
        return (E) "ok";
    }

    /// createUser updateUser disableUser deleteUser


}
