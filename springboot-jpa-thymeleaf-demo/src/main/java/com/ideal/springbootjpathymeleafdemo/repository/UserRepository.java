package com.ideal.springbootjpathymeleafdemo.repository;

import com.ideal.springbootjpathymeleafdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findById(long id);
    void deleteById(long id);
}
