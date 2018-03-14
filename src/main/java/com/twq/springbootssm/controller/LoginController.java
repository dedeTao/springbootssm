package com.twq.springbootssm.controller;

import com.twq.springbootssm.dao.LoginMapper;
import com.twq.springbootssm.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    //依赖注入
    @Autowired
    LoginMapper loginMapper;

    //登录页面
    @RequestMapping("/index")
    public String index() {
        return "login";
    }

    //登录
    @RequestMapping("/login")
    @ResponseBody
    public String login(HttpServletRequest request) {
        System.out.println("请求了");
        String phone = request.getParameter("phone");
        String password = request.getParameter("password");
        User user = loginMapper.findByPhoneAndPassword(phone, password);
        if (user != null) {
            return user.toString();
        } else {
            return "没有这个人";
        }

    }
}
