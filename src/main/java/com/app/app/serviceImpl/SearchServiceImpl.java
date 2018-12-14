package com.app.app.serviceImpl;

import com.app.app.entity.Expert_customize;
import com.app.app.repository.ExpertRepository;
import com.app.app.repository.GeneralRepository;
import com.app.app.repository.ServiceRepository;
import com.app.app.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    ExpertRepository expertRepository;

    @Autowired
    ServiceRepository serviceRepository ;

    @Autowired
    GeneralRepository generalRepository;

    @Override
    public List<String> getTotal(String field) {
        return generalRepository.findField(field);
    }

    @Override
    public List<com.app.app.entity.Service> getService(String title, String specialty, String school, String position) {
        return serviceRepository.findService(title, specialty, school, position);
    }

    @Override
    public List<Expert_customize> getExpert(String name, String specialty, String school, String position) {
        return expertRepository.findExpert_customizeComplex(name, specialty, school, position);
    }
}
