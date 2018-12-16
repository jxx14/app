package com.app.app.repository;


import com.app.app.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation,Integer> {
    List<Reservation> getAllByState(String state);
    List<Reservation> getAllByStateAndWid(String state,String wid);


    @Query(value = "SELECT s.title,s.expert_name,s.subscribe_address,s.text,r.state,s.subscribe_time FROM  reservation r join service s WHERE r.service_id=s.id and r.wid=?1",
            nativeQuery = true)
    List<Object> getReservations (String wid);
}