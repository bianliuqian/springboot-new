package com.qf.springbootnew.interceptor;

public class UserServiceImpl extends UserAdapter{
    //使用extends Adapter可以部分实现
    @Override
    public void add() {
        super.add();
    }
}
