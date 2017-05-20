package com.wjj.ssm.web.application.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wjj.ssm.web.application.dao.UserManagerDao;
import com.wjj.ssm.web.application.model.User;
import com.wjj.ssm.web.application.service.UserManagerService;

@Service("userManagerServiceImpl")
public class UserManagerServiceImpl implements UserManagerService
{
    @Resource
    private UserManagerDao userDao;
    
    @Override
    public void addUser(User user)
    {
        this.userDao.insert(user);
    }
    
    @Override
    public void updateUser(User user)
    {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public User getUserById(String id)
    {
        return userDao.selectByPrimaryKey(id.toString());
    }
    
    @Override
    public void deleteUser(String id)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<User> queryAllUser()
    {
        return userDao.queryAllUsers();
    }
    
}
