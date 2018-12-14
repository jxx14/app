package com.app.app.service;

import com.app.app.entity.Expert_customize;
import com.app.app.entity.Service;

import java.util.List;

public interface SearchService {

    List<Expert_customize> getExpert(String name, String specialty, String school, String position);

    List<Service> getService(String title, String specialty, String school, String position);

    List<String> getTotal(String field);
}