package com.app.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reservation {
    @Id
    @GeneratedValue
    private Integer id;

    //用户ID，预约内容，预约状态
    private String wid;
    private int service_id;
    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWid() {
        return wid;
    }

    public void setWid(String wid) {
        this.wid = wid;
    }

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", wid='" + wid + '\'' +
                ", service_id=" + service_id +
                ", state='" + state + '\'' +
                '}';
    }
}
