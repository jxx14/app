package com.app.app.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
//
//
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
//
    @Autowired
    private UserService userService;
//
//    @Test
//    public void getReservationList() {
//        userService.getReservationList("normal").toString();
//    }

//    @Test
//    public void getReservationListByWidAndState() {
//        System.out.println(userService.getReservationListByWidAndState("normal","001").toString());
//    }
//
//
//
//    @Test
//    public void getUserByName() {
//        System.out.println(userService.getUserByName("gaoqiang").toString());
//    }

////    @Test
////    public void getReservationList() {
////        System.out.println(userService.getReservationList(1,"未开始").toString());
////    }
////
////    @Test
////    public void getUserByWeChatID() {
////        System.out.println(userService.getUserByWeChatID("001").toString());
////    }
//
////    @Test
////    public void modifyUser() {
////        User user = userService.getUserByName("zhangsan");
////        user.setCompany("alibaba");
////        userService.modifyUser(user);
////    }
//
//
////    @Test
////    public void addUser() {
////        User user =new User();
////        user.setWid("002");
////        user.setCompany("阿里");
////        user.setEmail("123@qq.com");
////        user.setName("lisi");
////        user.setPhone("1234567989");
////        user.setPwd("123456");
////        userService.addUser(user);
////    }
}