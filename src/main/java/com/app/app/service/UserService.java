package com.app.app.service;

import com.app.app.entity.Reservation;
import com.app.app.entity.User;

import java.util.List;

public interface UserService {

    User getUserByWid(String wid);
    User getUserByName(String str);
    void addUser(User user);
    User modifyUser(User user);
    List<Reservation> getReservationList(String state);//根据状态查看预定列表
    List<Reservation> getReservationListByWidAndState(String state,String wid);//根据状态查看用户的预定列表
    List<Object> getReservations(String wid);//查看某人的预定列表

}
