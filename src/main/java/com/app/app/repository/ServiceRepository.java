package com.app.app.repository;


import com.app.app.entity.Expert_customize;
import com.app.app.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ServiceRepository extends JpaRepository<Service,Integer> {

      @Query(value = "SELECT service.* FROM expert_customize, service " +
              " WHERE expert_customize.name=service.expert_name "+
              " AND (service.title=:title OR :title IS NULL )" +
              " AND (expert_customize.specialty=:specialty OR :specialty IS NULL )" +
              " AND (expert_customize.school=:school OR :school IS NULL )" +
              " AND (expert_customize.position=:position OR :position IS NULL )",
              nativeQuery = true)
      List<Service> findService(@Param("title") String title,
                                @Param("specialty") String speciality,
                                @Param("school") String school,
                                @Param("position") String position);
}