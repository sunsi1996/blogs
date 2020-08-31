package com.blog.controller;

import com.blog.bloginfra.user.service.UserService;
import com.blog.domain.test.test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author sunsi
 * @version 1.0
 * @date 2020/8/18 8:46
 * @desc
 */
@RequestMapping("hello")
@RestController
public class HelloWorld {
    @Autowired
    private UserService userService;

    @GetMapping("test")
    public String hello(){

        System.out.println("dffd");
        List<test> all = userService.findAll();
        return "测试";
    }
}
