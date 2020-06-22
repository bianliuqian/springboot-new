package com.qf.springbootnew;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//Field userMapper in com.qf.springbootnew.service.impl.UserServiceImpl required a bean of type 'com.qf.springbootnew.mapper.TUserMapper' that could not be found.
@SpringBootApplication
@MapperScan("com.qf.springbootnew.mapper")//将mapper管理起来
public class SpringbootNewApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootNewApplication.class, args);
    }

}
