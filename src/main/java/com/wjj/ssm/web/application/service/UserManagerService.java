package com.wjj.ssm.web.application.service;

import java.util.List;

import com.wjj.ssm.web.application.model.User;

/**
 * 用户管理
 * @author Nevernow
 *
 */
public interface UserManagerService
{
    /**
     * 创建用户
     * @param user 用户实体
     */
    public void addUser(User user);
    
    /**
     * 更新用户
     * @param user 跟新用户信息
     */
    public void updateUser(User user);
    
    /**
     * 根据id查询用户
     * @param id 用户id
     * @return 
     */
    public User getUserById(String id);
    
    /**
     * 根据用户id删除用户
     * @param id 用户id
     */
    public void deleteUser(String id);
    
    /**
     * 根据id查询用户
     * @param id 用户id
     * @return 
     */
    public List<User> queryAllUser();
}
