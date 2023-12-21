package com.example.DataBaseManager.api;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Users {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String mobile;
    private String multiuser;

    public Users(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
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

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public List<Traffic> getTraffics() {
        return traffics;
    }

    public void setTraffics(List<Traffic> traffics) {
        this.traffics = traffics;
    }

    public Users(Long id, String username, String password, String email, String mobile, String multiuser, String startDate, String end_date, String date_one_connect, String customerUser, String status, String traffic, String referral, String desc, String created_at, String updated_at, List<Traffic> traffics) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.mobile = mobile;
        this.multiuser = multiuser;
        this.startDate = startDate;
        this.end_date = end_date;
        this.date_one_connect = date_one_connect;
        this.customerUser = customerUser;
        this.status = status;
        this.traffic = traffic;
        this.referral = referral;
        this.desc = desc;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.traffics = traffics;
    }

    @JsonProperty("start_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private String startDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private String end_date;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private String date_one_connect;

    @JsonProperty("customer_user")
    private String customerUser;

    private String status;
    private String traffic;
    private String referral;
    private String desc;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private String created_at;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private String updated_at;

    private List<Traffic> traffics;

    // Constructors, getters, setters...

    @Override
    public String toString() {
        return "UserDataModelFromApi{" + "id=" + id + ", username='" + username + '\'' + ", password='" + password + '\'' + ", email='" + email + '\'' + ", mobile='" + mobile + '\'' + ", multiuser='" + multiuser + '\'' + ", startDate='" + startDate + '\'' + ", end_date='" + end_date + '\'' + ", date_one_connect='" + date_one_connect + '\'' + ", customerUser='" + customerUser + '\'' + ", status='" + status + '\'' + ", traffic='" + traffic + '\'' + ", referral='" + referral + '\'' + ", desc='" + desc + '\'' + ", created_at='" + created_at + '\'' + ", updated_at='" + updated_at + '\'' + ", traffics=" + traffics + '}';
    }

    public static class Traffic {
        private Long id;
        private String username;
        private String download;
        private String upload;
        private String total;

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
        private String created_at;

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
        private String updated_at;

        private List<Traffic> traffics;


        @Override
        public String toString() {
            return "Traffic{" + "id=" + id + ", username='" + username + '\'' + ", download='" + download + '\'' + ", upload='" + upload + '\'' + ", total='" + total + '\'' + ", created_at='" + created_at + '\'' + ", updated_at='" + updated_at + '\'' + '}';
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public List<Traffic> getTraffics() {
            return traffics;
        }

        public void setTraffics(List<Traffic> traffics) {
            this.traffics = traffics;
        }

        public String getDownload() {
            return download;
        }

        public void setDownload(String download) {
            this.download = download;
        }

        public String getUpload() {
            return upload;
        }

        public void setUpload(String upload) {
            this.upload = upload;
        }

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public Traffic(Long id, String username, String download, String upload, String total, String created_at, String updated_at) {
            this.id = id;
            this.username = username;
            this.download = download;
            this.upload = upload;
            this.total = total;
            this.created_at = created_at;
            this.updated_at = updated_at;
        }
    }
}
