package com.ideal.springbootjpademo.repository;

import com.ideal.springbootjpademo.entity.JpaUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<JpaUser,Integer> {

}
