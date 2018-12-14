package com.app.app.repository;


import com.app.app.entity.Expert_customize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface SearchRepository extends JpaRepository<Expert_customize,Integer> {

//      @Query("SELECT expert FROM expert_customize expert WHERE expert.name=name")
      List<Expert_customize> findExpert_customizeByName (String name);

      @Query(value = "SELECT * FROM expert_customize WHERE 1=1 "+
              " AND (name=:n OR :n IS NULL )" +
              " AND (speciality=:speciality OR :speciality IS NULL )" +
              " AND (school=:school OR :school IS NULL )" +
              " AND (position=:position OR :position IS NULL )",
              nativeQuery = true)
      List<Expert_customize> findExpert_customizeComplex(@Param("n") String name,
                                                         @Param("speciality") String speciality,
                                                         @Param("school") String school,
                                                         @Param("position") String position);
}