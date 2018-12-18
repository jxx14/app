package com.app.app.repository;


import com.app.app.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

public interface ReservationRepository extends JpaRepository<Reservation,Integer> {

     @Query(value = "SELECT s.title,s.expert_name,s.subscribe_address,s.text,r.state,s.subscribe_time ,e.`name`,e.position,e.school,e.specialty FROM  reservation r join service s JOIN expert_customize e WHERE r.service_id=s.id and r.wid=1 AND s.expert_name=e.`name`",
            nativeQuery = true)
     List<Object> getReservationLists (String wid);



}