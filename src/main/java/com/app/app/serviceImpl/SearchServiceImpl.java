package com.app.app.serviceImpl;

import com.app.app.VO.ExpertVO;
import com.app.app.VO.ServiceVO;
import com.app.app.entity.Expert_customize;
import com.app.app.entity.Reservation;
import com.app.app.repository.ExpertRepository;
import com.app.app.repository.GeneralRepository;
import com.app.app.repository.ReservationRepository;
import com.app.app.repository.ServiceRepository;
import com.app.app.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<ServiceVO> getService(String title, String specialty, String school, String position) {
        List<com.app.app.entity.Service> serviceList = serviceRepository.findService(title, specialty, school, position);
        List<ServiceVO> serviceVOList = new ArrayList<>();
        for(com.app.app.entity.Service singleService : serviceList){
            ExpertVO expertVO = getExpert(singleService.getExpert_name(),null,null,null).get(0);
            ServiceVO serviceVO = new ServiceVO(singleService,expertVO);
            serviceVOList.add(serviceVO);
        }
        return serviceVOList;
    }

    @Override
    public List<ExpertVO> getExpert(String name, String specialty, String school, String position) {
        List<Expert_customize> expertList = expertRepository.findExpert_customizeComplex(name, specialty, school, position);
        List<ExpertVO> expertVOList = new ArrayList<>();
        for(Expert_customize singleExpert : expertList){
            expertVOList.add(convertExpertToVO(singleExpert));
        }
        return expertVOList;
    }

    @Override
    public void saveReservation(String wid, int service_id, String status) {
        Reservation r = new Reservation();
        r.setWid(wid);
        r.setService_id(service_id);
        r.setState(status);
        reservationRepository.save(r);
    }

    private ExpertVO convertExpertToVO(Expert_customize e){
        List<com.app.app.entity.Service> serviceList = serviceRepository.findByExpert_name(e.getName());
        return new ExpertVO(e,serviceList);
    }

}
