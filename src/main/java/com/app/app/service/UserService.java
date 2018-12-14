package com.app.app.service;

import com.app.app.entity.Reservation;
import com.app.app.entity.User;

import java.util.List;

public interface UserService {

    User getUserByWid(String wid);
    User getUserByName(String str);
    void addUser(User user);
    User modifyUser(User user);
//    List<Reservation> getReservationList(User user, String state);//查看用户的预定列表
}
