package com.qf.springbootnew.service.impl;

import com.qf.springbootnew.entity.TUser;
import com.qf.springbootnew.mapper.TUserMapper;
import com.qf.springbootnew.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements IUserService {
    @Autowired
    private TUserMapper userMapper;

    @Override
    public TUser getById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
