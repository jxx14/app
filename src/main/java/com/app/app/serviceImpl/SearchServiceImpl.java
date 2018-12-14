package com.app.app.serviceImpl;

import com.app.app.entity.Expert_customize;
import com.app.app.repository.SearchRepository;
import com.app.app.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private SearchRepository searchRepository ;

    @Override
    public List<Expert_customize> getExpert(String name, String speciality, String school, String position) {
        return searchRepository.findExpert_customizeComplex(name, speciality, school, position);
    }
}
