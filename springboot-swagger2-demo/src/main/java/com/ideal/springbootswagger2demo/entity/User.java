package com.ideal.springbootswagger2demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@ApiModel(description = "user")
public class User {
    @ApiModelProperty(value = "主键id",hidden = true)
    @GeneratedValue
    @Id
    int id;

    @ApiModelProperty(value = "用户名称")
    @Column
    String userName;

    @ApiModelProperty(value = "用户密码")
    @Column
    String userPassword;

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

    public User(int id, String userName, String userPassword) {
        this.id=id;
        this.userName = userName;
        this.userPassword = userPassword;
    }
    public User(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public User() {
    }
}
