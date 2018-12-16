package com.app.app.VO;

import com.app.app.entity.Expert_customize;
import com.app.app.entity.Service;

import java.util.List;

public class ExpertVO {

    Expert_customize expert;
    List<Service> serviceList;

    public ExpertVO(Expert_customize expert, List<Service> serviceList) {
        this.expert = expert;
        this.serviceList = serviceList;
    }

    public Expert_customize getExpert() {
        return expert;
    }

    public void setExpert(Expert_customize expert) {
        this.expert = expert;
    }

    public List<Service> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<Service> serviceList) {
        this.serviceList = serviceList;
    }
}
