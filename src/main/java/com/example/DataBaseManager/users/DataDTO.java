package com.example.DataBaseManager.users;

public class DataDTO {
    private String token;
    private String username;
    private String password;
    private String email;
    private String mobile;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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

    public String getTraffic() {
        return traffic;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic;
    }

    public String getTypeTraffic() {
        return typeTraffic;
    }

    public void setTypeTraffic(String typeTraffic) {
        this.typeTraffic = typeTraffic;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getConnectionStart() {
        return connectionStart;
    }

    public void setConnectionStart(String connectionStart) {
        this.connectionStart = connectionStart;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private String multiuser;
    private String traffic;
    private String typeTraffic;
    private String expDate;
    private String connectionStart;
    private String desc;

    public DataDTO(String token, String username, String password, String email, String mobile, String multiuser, String traffic, String typeTraffic, String expDate, String connectionStart, String desc) {

        this.token = token;
        this.username = username;
        this.password = password;
        this.email = email;
        this.mobile = mobile;
        this.multiuser = multiuser;
        this.traffic = traffic;
        this.typeTraffic = typeTraffic;
        this.expDate = expDate;
        this.connectionStart = connectionStart;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
