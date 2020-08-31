package com.blog.bloginfra.user;

import com.blog.domain.test.test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author sunsi
 * @version 1.0
 * @date 2020/8/19 10:38
 * @desc
 */
@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<test> {
    List<test> findAll();
}
