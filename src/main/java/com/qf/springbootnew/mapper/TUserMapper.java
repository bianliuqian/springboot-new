package com.qf.springbootnew.mapper;

import com.qf.springbootnew.entity.TUser;


public interface TUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert (TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}
