package com.app.app.serviceImpl;

import com.app.app.entity.Expert;
import com.app.app.repository.SearchRepository;
import com.app.app.repository.UserRepository;
import com.app.app.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private SearchRepository searchRepository ;

    @Override
    public List<Expert> getExpert(String name, String speciality, String school, String position) {
        return searchRepository.findByName(name);
    }
}
