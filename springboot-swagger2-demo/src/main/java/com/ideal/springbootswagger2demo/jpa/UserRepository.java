package com.ideal.springbootswagger2demo.jpa;


import com.ideal.springbootswagger2demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    User findById(int id);
}
