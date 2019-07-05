package com.demo.model;

public class UserInfo {
    private Integer id;

    private String userName;

    private String password;

    private String creatTime;

    private String lstUpdateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime == null ? null : creatTime.trim();
    }

    public String getLstUpdateTime() {
        return lstUpdateTime;
    }

    public void setLstUpdateTime(String lstUpdateTime) {
        this.lstUpdateTime = lstUpdateTime == null ? null : lstUpdateTime.trim();
    }
}