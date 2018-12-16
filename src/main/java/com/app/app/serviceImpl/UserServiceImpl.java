package com.app.app.serviceImpl;

import com.app.app.repository.ReservationRepository;
import com.app.app.repository.UserRepository;
import com.app.app.service.UserService;
import com.app.app.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository ;
    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public User getUserByWid(String wid) {
        return userRepository.getUserByWid(wid);
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User modifyUser(User user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    public List<Object> getReservationList(String wid) {
        return reservationRepository.getReservationLists(wid);
    }
}
