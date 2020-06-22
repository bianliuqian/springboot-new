package com.qf.springbootnew.config;

import com.qf.springbootnew.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class MyWebMVCConfig implements WebMvcConfigurer {
    @Autowired
    private MyInterceptor myInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {


        //添加拦截器配置
        //如果new MyInterceptor() 他不属于Spring管理
        registry.addInterceptor(myInterceptor).addPathPatterns("/**");
    }
}
