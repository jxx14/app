package com.app.app.repository;


import com.app.app.entity.Expert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface SearchRepository extends JpaRepository<Expert,Integer> {

//      @Query("SELECT expert FROM expert_customize expert WHERE expert.name=name")
      List<Expert> findByName (String name);

}