package com.example.DataBaseManager.users;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class User {
     User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private int id;
    private String username;
    private String password;
    private String email;
    private String mobile;
    private String multiuser;
    private String startDate;
    private String endDate;
    private String date_one_connect;
    @JsonProperty("customerUser")
    private String customerUser;
    private String status;
    private String traffic;
    private String referral;
    private String desc;

    private String createdAt;
    private String updatedAt;
    private List<SPECEFICUSERSELECTIONDataDTO.Traffic> traffics;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMultiuser() {
        return multiuser;
    }

    public void setMultiuser(String multiuser) {
        this.multiuser = multiuser;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDate_one_connect() {
        return date_one_connect;
    }

    public void setDate_one_connect(String date_one_connect) {
        this.date_one_connect = date_one_connect;
    }

    public String getCustomerUser() {
        return customerUser;
    }

    public void setCustomerUser(String customerUser) {
        this.customerUser = customerUser;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTraffic() {
        return traffic;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic;
    }

    public String getReferral() {
        return referral;
    }

    public void setReferral(String referral) {
        this.referral = referral;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<SPECEFICUSERSELECTIONDataDTO.Traffic> getTraffics() {
        return traffics;
    }

    public void setTraffics(List<SPECEFICUSERSELECTIONDataDTO.Traffic> traffics) {
        this.traffics = traffics;
    }
    
    
}

