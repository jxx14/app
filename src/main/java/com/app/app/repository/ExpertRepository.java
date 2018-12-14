package com.app.app.repository;


import com.app.app.entity.Expert_customize;
import com.app.app.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public interface ExpertRepository extends JpaRepository<Expert_customize,Integer> {

      @Query(value = "SELECT * FROM expert_customize WHERE 1=1 "+
              " AND (name=:n OR :n IS NULL )" +
              " AND (specialty=:specialty OR :specialty IS NULL )" +
              " AND (school=:school OR :school IS NULL )" +
              " AND (position=:position OR :position IS NULL )",
              nativeQuery = true)
      List<Expert_customize> findExpert_customizeComplex(@Param("n") String name,
                                                         @Param("specialty") String specialty,
                                                         @Param("school") String school,
                                                         @Param("position") String position);
}