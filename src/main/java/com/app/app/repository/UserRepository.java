package com.app.app.repository;


import com.app.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface UserRepository extends JpaRepository<User,Integer> {

    User getUserByName(String name);

//    User getUserByWeChatID(String WeChatID);

//      @Query("SELECT reservation FROM Reservation reservation , User u WHERE u.id=reservation.userid")
//      List<Reservation> findReservationByStateAndUserID (String state, Integer userID);


}