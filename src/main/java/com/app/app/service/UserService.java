package com.app.app.service;

import com.app.app.entity.Reservation;
import com.app.app.entity.User;

import java.util.List;

public interface UserService {
//    User getUserByWeChatID(String str);
    User getUserByName(String str);//登陆
    void addUser(User user);//添加用户注册
//    List<Reservation> getReservationList(Integer userID, String state);//查看用户的预定列表
}
