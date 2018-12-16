package com.app.app.VO;

import com.app.app.entity.Service;

public class ServiceVO {

    Service service;
    ExpertVO expertVO;

    public ServiceVO(Service service, ExpertVO expertVO) {
        this.service = service;
        this.expertVO = expertVO;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public ExpertVO getExpertVO() {
        return expertVO;
    }

    public void setExpertVO(ExpertVO expertVO) {
        this.expertVO = expertVO;
    }
}
