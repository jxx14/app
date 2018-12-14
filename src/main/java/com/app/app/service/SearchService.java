package com.app.app.service;

import com.app.app.entity.Expert;

import java.util.List;

public interface SearchService {

    List<Expert> getExpert(String name, String speciality, String school, String position);
}
