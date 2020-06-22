package com.qf.springbootnew.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qf.springbootnew.config.Resource;
import com.qf.springbootnew.entity.TUser;
import com.qf.springbootnew.entity.User;
import com.qf.springbootnew.pojo.ResultBean;
import com.qf.springbootnew.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController //@Controller+@ResponseBody
@RequestMapping("user")
@Slf4j
public class UserController {

    //在application.properties配置自己的东西
//    @Value("${image.server}")
//    private String imageServer;
    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private Resource resource;

    //restful架构风格
    //url requestMethod

    //@RequestMapping(value = "hello",method = RequestMethod.GET)
    @GetMapping("hello")
    public String hello(){
        return "Hello,springboot!!!";
    }

    //localhost:8080/user/1 由请求方式决定是get还是delete
    @GetMapping("{id}")
    public TUser getById(@PathVariable("id") Integer id){
        System.out.println("id:"+id);
        System.out.println("查询操作");
        return userService.getById(id);
    }

    @GetMapping("getImageServer")
    public String getImageServer(){
        //return imageServer;
        return resource.getEmailServer();
    }

    @DeleteMapping("{id}")
    public String delById(@PathVariable("id") Long id){
        System.out.println("id:"+id);
        System.out.println("删除操作");
        return "ok";
    }

    /*@PostMapping("add")
    //@Valid表示要校验 除了在bean上配置 还有在这边配置
    public ResultBean add(@Valid User user, BindingResult bindingResult) throws JsonProcessingException {
        //判断数据校验是否通过
        if (bindingResult.hasErrors()){
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            Map<String,String> result = new HashMap<>();
            for (FieldError fieldError : fieldErrors) {
                String field = fieldError.getField();
                String message = fieldError.getDefaultMessage();
                log.error("[{}]:[{}]",field,message);
                result.put(field,message);
            }
                ObjectMapper objectMapper =new ObjectMapper();
                //讲对象转成json
            String json = objectMapper.writeValueAsString(result);
            return new ResultBean("fail",json);

        }

        //System.out.println(user.getEntryDate());
        return new ResultBean("success","ok");
    }*/

    @PostMapping("add")
    //@Valid表示要校验 除了在bean上配置 还有在这边配置
    public ResultBean add(@Valid User user)  {
        //AOP将核心业务逻辑和非核心业务逻辑作分离
        //核心业务逻辑：做用户数据的添加
        //非核心：数据校验
        //面试：aop使用场景 事务 日志 数据校验

        //事物的控制
        //核心业务：数据的添加工作
        //非核心工作：事务控制
        //System.out.println(user.getEntryDate());
        return new ResultBean("success","ok");
    }
}
