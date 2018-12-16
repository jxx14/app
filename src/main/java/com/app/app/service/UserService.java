package com.app.app.service;

import com.app.app.entity.Reservation;
import com.app.app.entity.User;

import java.util.List;

public interface UserService {

    User getUserByWid(String wid);
    void addUser(User user);
    User modifyUser(User user);
    List<Object> getReservationList(String wid);//查看某人的预定列表

}
