package com.app.app.repository;


import com.app.app.entity.Expert_customize;
import com.app.app.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation,Integer> {
    List<Reservation> getAllByState(String state);
    List<Reservation> getAllByStateAndWid(String state,String wid);

}