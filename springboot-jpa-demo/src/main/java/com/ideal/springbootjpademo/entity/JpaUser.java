package com.ideal.springbootjpademo.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "i_jpa_user")
public class JpaUser implements Serializable {
    private static final long serialVersionUID = 4628466944459883435L;

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String name;
    private Integer age;

    public JpaUser() {
    }

    public JpaUser(Integer id) {
        this.id = id;
    }

    public JpaUser(String name, Integer age) {
        this.name = name;
        this.age = age;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
