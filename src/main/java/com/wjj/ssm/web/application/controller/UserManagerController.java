package com.wjj.ssm.web.application.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
        for(User user : userList)
        {
            sb.append(user).append("<br>");
        }
        model.addAttribute("user", sb);
        return "User";

        
    }
}
