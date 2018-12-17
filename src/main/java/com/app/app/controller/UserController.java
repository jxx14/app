package com.app.app.controller;

import com.app.app.entity.User;
import com.app.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

//   用户授权后我可以传给你一个微信id 和头像的url  用你的增加用户接口。
    @RequestMapping(value="/login")
    @ResponseBody
    public String login(HttpServletRequest request){
        String wid=request.getParameter("wid");
        if(userService.getUserByWid(wid)==null){
            User user=new User();
            user.setWid(wid);
            user.setAvatar(request.getParameter("avatar"));
            userService.addUser(user);
            return "新用户";
        }
        System.out.println(userService.getUserByWid(wid).toString());
        return "用户已存在";

    }


//  然后进去小程序后我还要用到一个查看用户接口，我传给你一个微信id,  查看用户信息
    @RequestMapping(value="/listUserInfo")
    @ResponseBody
    public User listUserInfo(HttpServletRequest request){
        String wid=request.getParameter("wid");
        System.out.println(userService.getUserByWid(wid).toString());
        return userService.getUserByWid(wid);
    }

    // 修改个人基本信息,需要一个修改用户接口，传给你id
    @RequestMapping(value="/modifyUserInfo")
    @ResponseBody
    public User modifyUserInfo(HttpServletRequest request){
        String wid=request.getParameter("wid");
        User user = userService.getUserByWid(wid);
        System.out.println(user.toString());
        user.setName(request.getParameter("name"));
        user.setEmail(request.getParameter("email"));
        user.setCompany(request.getParameter("company"));
        user.setPhone(request.getParameter("phone"));

        System.out.println(userService.modifyUser(user).toString());
        return userService.modifyUser(user);
    }


    //列出个人的预约列表
      @RequestMapping(value="/getReservationList")
    @ResponseBody
    public List<Object> getReservationList(HttpServletRequest request){
        String wid=request.getParameter("wid");
        return userService.getReservationList(wid);
    }


}


