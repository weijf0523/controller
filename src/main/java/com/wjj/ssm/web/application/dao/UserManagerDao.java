package com.wjj.ssm.web.application.dao;

import java.util.List;

import com.wjj.ssm.web.application.model.User;

public interface UserManagerDao
{
    int deleteByPrimaryKey(String id);
    
    int insert(User record);
    
    int insertSelective(User record);
    
    User selectByPrimaryKey(String id);
    
    List<User> queryAllUsers();
    
    int updateByPrimaryKeySelective(User record);
    
    int updateByPrimaryKey(User record);
}