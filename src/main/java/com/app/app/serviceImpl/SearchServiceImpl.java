package com.app.app.serviceImpl;

import com.app.app.entity.Expert_customize;
import com.app.app.entity.Reservation;
import com.app.app.repository.ExpertRepository;
import com.app.app.repository.GeneralRepository;
import com.app.app.repository.ReservationRepository;
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

    @Autowired
    ReservationRepository reservationRepository;

    @Override
    public List<String> getTotal(String field) {
        return generalRepository.findField(field);
    }

    @Override
    public List<Reservation> getReservation(String field, String value) {
        return generalRepository.searchField(field,value);
    }

    @Override
    public List<com.app.app.entity.Service> getService(String title, String specialty, String school, String position) {
        return serviceRepository.findService(title, specialty, school, position);
    }

    @Override
    public List<Expert_customize> getExpert(String name, String specialty, String school, String position) {
        return expertRepository.findExpert_customizeComplex(name, specialty, school, position);
    }

    @Override
    public void saveReservation(String content, String id) {
        Reservation r = new Reservation();
        r.setUserID(id);
        r.setContent(content);
        r.setState("normal");
        reservationRepository.save(r);
    }
}
