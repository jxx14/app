package com.app.app.service;

import com.app.app.VO.ExpertVO;
import com.app.app.VO.ServiceVO;
import com.app.app.entity.Reservation;
import com.app.app.entity.Service;

import java.util.List;

public interface SearchService {

    List<ExpertVO> getExpert(String name, String specialty, String school, String position, String expertID);

    List<ServiceVO> getService(String title, String specialty, String school, String position);

    List<String> getTotal(String field);

    void saveReservation(String wid, int service_id, String status);

    List<Reservation> getReservation(String field, String value);
}
