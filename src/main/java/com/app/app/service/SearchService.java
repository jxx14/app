package com.app.app.service;

import com.app.app.entity.Expert_customize;

import java.util.List;

public interface SearchService {

    List<Expert_customize> getExpert(String name, String speciality, String school, String position);
}
