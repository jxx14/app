package com.app.app.entity;

import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
@Proxy(lazy = false)    //关闭延迟加载，不然测试单元总是报错
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    private String WeChatID;
    private String name;
    private String pwd;
    private String phone;
    private String email;
    private String company;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", WeChatID='" + WeChatID + '\'' +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", company='" + company + '\'' +
                '}';
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWeChatID() {
        return WeChatID;
    }

    public void setWeChatID(String weChatID) {
        WeChatID = weChatID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }



}
