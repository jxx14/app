package com.app.app.repository;

import com.app.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,String> {

    User getUserByName(String name);

    User getUserByWid(String wid);

}