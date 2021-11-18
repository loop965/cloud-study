package com.loop.auth.controller;

import com.loop.common.entiy.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yf
 * @date: 2021/11/17  16:48
 * @desc:
 */
@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("/{id}")
    public User getUser(@PathVariable String id){
        User user = new User();
        user.setId(1);
        return user;

    }
}
