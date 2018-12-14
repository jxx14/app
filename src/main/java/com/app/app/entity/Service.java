package com.app.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class Service implements Serializable {

    @Id
    public Integer id;

    public Date deadline;
    public String expert_name;
    public String professional_type;
    public String service_type;
    public String subscribe_address;
    public Date subscribe_time;
    public String text;
    public String title;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getExpert_name() {
        return expert_name;
    }

    public void setExpert_name(String expert_name) {
        this.expert_name = expert_name;
    }

    public String getProfessional_type() {
        return professional_type;
    }

    public void setProfessional_type(String professional_type) {
        this.professional_type = professional_type;
    }

    public String getService_type() {
        return service_type;
    }

    public void setService_type(String service_type) {
        this.service_type = service_type;
    }

    public String getSubscribe_address() {
        return subscribe_address;
    }

    public void setSubscribe_address(String subscribe_address) {
        this.subscribe_address = subscribe_address;
    }

    public Date getSubscribe_time() {
        return subscribe_time;
    }

    public void setSubscribe_time(Date subscribe_time) {
        this.subscribe_time = subscribe_time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
