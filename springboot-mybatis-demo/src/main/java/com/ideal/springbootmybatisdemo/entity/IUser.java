package com.ideal.springbootmybatisdemo.entity;

import org.apache.ibatis.type.Alias;


@Alias("user")
public class IUser {
    private int id;
    private String userName;
    private String userPassword;

    public IUser() {
    }

    public IUser(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
