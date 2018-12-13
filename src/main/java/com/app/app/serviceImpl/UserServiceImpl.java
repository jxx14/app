package com.app.app.serviceImpl;

import com.app.app.repository.UserRepository;
import com.app.app.entity.Reservation;
import com.app.app.service.UserService;
import com.app.app.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository ;

//    @Override
//    public User getUserByWeChatID(String str) {
//        return userRepository.getUserByWeChatID(str);
//    }


    @Override
    public User getUserByName(String str) {
        return userRepository.getUserByName(str);
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

//    @Override
//    public List<Reservation> getReservationList(Integer userID, String state) {
//        return userRepository.findReservationByStateAndUserID("state",userID);
//    }
}
