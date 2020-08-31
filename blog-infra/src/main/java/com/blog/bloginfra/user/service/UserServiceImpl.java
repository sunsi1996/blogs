package com.blog.bloginfra.user.service;

import com.blog.bloginfra.user.UserMapper;
import com.blog.domain.test.test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sunsi
 * @version 1.0
 * @date 2020/8/19 14:08
 * @desc
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<test> findAll() {
        return userMapper.findAll();
    }
}
