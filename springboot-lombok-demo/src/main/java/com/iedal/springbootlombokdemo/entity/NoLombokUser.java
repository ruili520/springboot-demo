package com.iedal.springbootlombokdemo.entity;

import java.util.Objects;

//这是一个没有引用lombok的实体类
public class NoLombokUser {
    private Integer id;
    private String name;
    private String password;

    public NoLombokUser() {
    }

    public NoLombokUser(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public NoLombokUser(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoLombokUser that = (NoLombokUser) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(password, that.password);
    }

    @Override
    public String toString() {
        return "NoLombokUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password);
    }
}
