//package com.app.app.controller;
//
//import com.app.app.entity.Reservation;
//import com.app.app.entity.User;
//import com.app.app.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//
//@SpringBootApplication
//@Controller
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    //登陆 微信授权一键登录，微信作为唯一识别ID，手机号需要通过验证后绑定
//    @RequestMapping(value="/login",method= RequestMethod.POST)
//    @ResponseBody
//    public void login(HttpServletRequest request){
//        request.getSession().setAttribute("WeChatID", request.getParameter("WeChatID"));
//    }
//
//
//    //修改个人基本信息
//    @RequestMapping(value="/modifyUserInfo",method= RequestMethod.POST)
//    public User modifyUserInfo(HttpServletRequest request, HttpServletResponse response)throws IOException{
//        HttpSession session=request.getSession();
//        String WeChatID=(String) session.getAttribute("WeChatID");
//        User user = userService.getUserByWeChatID(WeChatID);
//
//        System.out.println(WeChatID);
//        System.out.println(user==null);
//        user.setName(request.getParameter("username"));
//        user.setPwd(request.getParameter("pwd"));
//        user.setEmail(request.getParameter("email"));
//        user.setCompany(request.getParameter("company"));
//        user.setPhone(request.getParameter("phone"));
//
//        return userService.modifyUser(user);
//    }
//
//    //列出个人基本信息
//    @RequestMapping(value="/getUserInfo",method= RequestMethod.POST)
//    public User getUserInfo(HttpServletRequest request){
//        HttpSession session=request.getSession();
//        String WeChatID=(String) session.getAttribute("WeChatID");
//        return  userService.getUserByWeChatID(WeChatID);
//
//    }
//
//
////    //列出个人的预约列表
////    @RequestMapping(value="/getReservationList",method= RequestMethod.POST)
////    public List<Reservation> getReservationList(HttpServletRequest request, HttpServletResponse response,HttpSession httpSession){
////        HttpSession session=request.getSession();
////        User user=(User) session.getAttribute("user");
////        String state = request.getParameter("state");
////        return userService.getReservationList(user,state);
////    }
//
//
//}
//
//
