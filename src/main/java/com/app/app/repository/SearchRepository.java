package com.app.app.repository;


import com.app.app.entity.Expert_customize;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface SearchRepository extends JpaRepository<Expert_customize,Integer> {

//      @Query("SELECT expert FROM expert_customize expert WHERE expert.name=name")
      List<Expert_customize> findExpert_customizeByName (String name);

}