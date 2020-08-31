package com.blog.domain.test;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author sunsi
 * @version 1.0
 * @date 2020/8/19 11:33
 * @desc
 */
@Data
@NoArgsConstructor
@Table(name = "assign_config")
public class test implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer age;
}
