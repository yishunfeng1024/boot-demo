package com.ysf.bootdemo.controller;

import com.ysf.bootdemo.entity.User;
import com.ysf.bootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author YiShunFeng
 * @version 1.0
 * @description com.ysf.bootdemo.controller
 * @data 2020/4/25
 */
@Controller//@RestController=@Controller+@ResponseBody
public class UserController {
    @Autowired
    private UserService service;
    //表示当浏览器发出/toregister跳转到注册页面
    @RequestMapping("/toregister")
    public String toregister(){

        return "register";//然后去resources/templates下去建立register页面
    }
    @RequestMapping("register")
    @ResponseBody
    public ModelAndView register(String name,String password){
        ModelAndView mav = new ModelAndView();
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        //将user放入数据库，所以此时我们去编写Mapper和Service
        int row = service.addOneUser(user);
        if (row==1){
            //表示注册成功，然后可以跳转到登陆页面
            mav.setViewName("login");//在resources/templates下建立一个登陆页面login
            return mav;
        }else{
            //表示注册失败，可以在register页面取一个msg
            mav.getModel().put("msg","注册失败，用户名已经存在....");
            //注册失败继续注册，返回注册页面 携带注册失败原因msg
            mav.setViewName("register");
            return mav;
        }
    }
}
