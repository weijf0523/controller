package com.wjj.ssm.web.application.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wjj.ssm.web.application.model.User;
import com.wjj.ssm.web.application.service.UserManagerService;

@Controller
@RequestMapping("/")
public class UserManagerController
{
    @Resource
    private UserManagerService userService;
    
    UserManagerController()
    {
        System.out.println("start");
    }
    
    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model)
    {
        String id = request.getParameter("id");
        if (null != id)
        {
            User user = this.userService.getUserById(id);
            model.addAttribute("user", user);
            return "User";
        }
        List<User> userList = userService.queryAllUser();
        StringBuffer sb = new StringBuffer();
        System.out.println(userList);
        for (User user : userList)
        {
            sb.append(user).append("<br>");
        }
        model.addAttribute("user", sb);
        return "User";
        
    }
    
    @RequestMapping("/getalluser.action")
    public ModelAndView getAllUser()
    {
        ModelAndView model = new ModelAndView();
        List<User> userList = userService.queryAllUser();
        model.addObject("user", userList);// 表示向页面传递的数据
        model.setViewName("/User");// 表示呈现的页面
        return model;
    }
    
    @RequestMapping("/checkUserLogin")
    public @ResponseBody User checkUserLogin(@RequestBody User user)
    {
        System.out.println("checkuser start"+user);
        if(user.getUsername() == null)
        {
            System.out.println("null!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        System.out.println(user);
        user.setUsername("wjj");
        return user;
    }

}
