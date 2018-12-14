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

    @Override
    public User getUserByWeChatID(String we_chatid) {
        return userRepository.getUserByWid(we_chatid);
    }

    @Override
    public User getUserByName(String str) {
        return userRepository.getUserByName(str);
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User modifyUser(User user) {
        return userRepository.saveAndFlush(user);
    }

//    @Override
//    public List<Reservation> getReservationList(User user, String state) {
//        return userRepository.findReservationByState(user,state);
//    }
}
