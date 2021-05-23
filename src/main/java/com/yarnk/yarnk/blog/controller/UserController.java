package com.yarnk.yarnk.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户
 * </p>
 *
 * @author YarnkHuang
 * @date 2021/5/23
 */

@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping
    public String hi(){
        return "Hi~";
    }
}
