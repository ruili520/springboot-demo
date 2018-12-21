package com.ideal.springbootjpademo.service;

import com.ideal.springbootjpademo.entity.JpaUser;
import com.ideal.springbootjpademo.repository.JpaUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class JpaUserService {

    @Autowired
    private JpaUserRepository jpaUserRepository;

    public JpaUser save(String name,Integer age){
        JpaUser jpaUser = new JpaUser();
        jpaUser.setName(name);
        jpaUser.setAge(age);
        return jpaUserRepository.save(jpaUser);
    }

    public String deleteUser(Integer id){
        jpaUserRepository.deleteById(id);
        return "已成功删除id为"+id+"的用户信息";
    }

    public List<JpaUser> getAll(){
        return jpaUserRepository.findAll();
    }

    public String updataUser(Integer id,String name,Integer age){
        JpaUser jpaUser = new JpaUser(id);
        jpaUser.setName(name);
        jpaUser.setAge(age);
        jpaUserRepository.save(jpaUser);
        return "已成功更改id为"+id+"的用户信息";
    }


}
