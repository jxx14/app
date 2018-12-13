//package com.app.app.controller;
//
//import com.app.app.entity.Reservation;
//import com.app.app.entity.User;
//import com.app.app.service.UserService;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//import java.util.List;
//
//@Controller
//public class UserController {
//
//
//    private UserService userService;
//
//    @RequestMapping(value="/")
//    public String print(){
//        System.out.print("helloworld");
//        return "helloworld";
//    }
//
//
//    //登陆 微信授权一键登录，微信作为唯一识别ID，手机号需要通过验证后绑定
//    @RequestMapping(value="/login",method= RequestMethod.POST)
//    public void login(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws IOException {
//        String name=request.getParameter("username");
//        String pwd=request.getParameter("pwd");
//        String WeChatID=request.getParameter("WeChat");
//
//        User user=userService.getUserByName(name);
//        if(user!=null){//用户存在的情况
//            if(user.getPwd().equals(pwd)){
//                System.out.print("登陆成功");
//                session.setAttribute("userLogin", user);
//            }else {
//                System.out.print("请重新登陆");
//            }
//        }else {
//            //用户不存在
//            System.out.print("用户不存在");
//        }
//
//
////        String username = request.getParameter("username");
////        String password = request.getParameter("password");
////        response.setCharacterEncoding("UTF-8");
////
////        if (username.equals("Admin") && password.equals("Admin1234")) {
////            response.getWriter().print("success");
////        } else {
////            response.getWriter().print("用户名或密码错误");
////        }
//    }
//
//    //注册
//    @RequestMapping("/regist")
//    public void regist(HttpServletRequest request)throws IOException{
//        String name=request.getParameter("username");
//        String pwd=request.getParameter("pwd");
//        String pwd1=request.getParameter("pwd1");
//        String email=request.getParameter("email");
//        String phone=request.getParameter("phone");
//        String company=request.getParameter("company");
//        String WeChatID=request.getParameter("WeChat");
////        if(pwd.equals(pwd1)) {//输入两次密码相同
////            User user=new User(WeChatID, name, pwd, phone, email, company);
////            userService.addUser(user);
////        }
//    }
//
////    //列出个人基本信息,通过session获得用户id，返回user实体
////    @RequestMapping(value="/getUserInfo",method= RequestMethod.POST)
////    public User getUserInfo(HttpSession httpSession){
////        String WeChatID=httpSession.getId();
////        return userService.getUserByWeChatID(WeChatID);
////    }
////
////    //列出个人基本信息,通过session获得用户id，返回user实体
////    @RequestMapping(value="/getReservationList",method= RequestMethod.POST)
////    public List<Reservation> getReservationList(HttpServletRequest request, HttpServletResponse response,HttpSession httpSession){
////        String userID=httpSession.getId();
////        String state=request.getParameter("state");
////        return userService.getReservationList(userID,state);
////    }
//
//
//}
//
//
