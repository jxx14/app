package com.app.app.service;

import com.app.app.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void getUserByName() {
        System.out.println(userService.getUserByName("zhangsan").toString());
    }

//    @Test
//    public void getReservationList() {
//        System.out.println(userService.getReservationList(1,"未开始").toString());
//    }

//    @Test
//    public void getUserByWeChatID() {
//        System.out.println(userService.getUserByWeChatID("001").toString());
//    }


//    @Test
//    public void getUserByWeChatID() {
//        System.out.println(userService.getUserByWeChatID("001").toString());
//    }

    @Test
    public void addUser() {
        User user =new User();
        user.setWeChatID("008");
        user.setCompany("京东");
        user.setEmail("11@qq.com");
        user.setName("gaoqiang");
        user.setPhone("1233");
        user.setPwd("123456");
        System.out.print(user.getEmail());
        userService.addUser(user);
    }
}