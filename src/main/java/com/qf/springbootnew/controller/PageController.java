package com.qf.springbootnew.controller;

import com.qf.springbootnew.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("page")
@Slf4j
public class PageController {
    //slf4j+logback
   // private Logger logger = LoggerFactory.getLogger(PageController.class);

    @RequestMapping("hello")
    public String hello(Model model){
        log.debug("debug...");
        //info以上的级别都要输出
        log.info("info...");
        log.warn("warn...");
        log.error("error...");
        //占位符使用
        log.info("你好[{}],你是第[{}]个登录网址的用户","james","1");

        //1.携带数据
        model.addAttribute("username","java1907");
        //2.携带自定义对象
        User user = new User(1L,"james",new Date());
        model.addAttribute("user",user);

        //条件判断
        model.addAttribute("money",10000);

        //保存集合，用于遍历
        List<User> list = new ArrayList<>();
        list.add(new User(1L,"james",new Date()));
        list.add(new User(2L,"bian",new Date()));
        model.addAttribute("list",list);

        model.addAttribute("now",new Date());
        return "hello";


    }
}
