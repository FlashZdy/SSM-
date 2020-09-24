package com.flash.controller;

import com.flash.pojo.User;
import com.flash.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    @Qualifier("userServiceImpl")
    private UserServiceImpl userService;

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "/login";
    }

    @RequestMapping("/queryUser")
    public String queryUser(String userName,String password, HttpSession session,Model model){
        //model和session都是存放信息的地方，但他们的生命周期不同，model是request级别的。
        // 所以用model保存“一次性”的登陆错误信息，用session保存user属性
        User user = userService.queryUserByName(userName);
        System.out.println(user);
        if (user != null && user.getPassword().equals(password)) {
            session.setAttribute("user",user);
            return "redirect:/book/allbook";
        }else {
            model.addAttribute("noUser","用户名或密码错误，请重试");
            return "/login";
        }
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return "/login";
    }

    @RequestMapping("/toRegistration")
    public String toRegistrat(){
        return "/registration";
    }
    @RequestMapping("/registrated")
    public String registrated(User user,Model model){
        int i = userService.addUser(user);
        if(i != 0){
            model.addAttribute("msg","注册成功");
            return "/registratedSuccess";
        }
        else {
            return "/registration";
        }
    }

}
