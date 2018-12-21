package com.ideal.springbootmybatisdemo.dao;

import com.ideal.springbootmybatisdemo.entity.IUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    IUser findUserByUsername(String userName);

    void updateUserByUsername(IUser user);

    void deleteUserByUsername(String userName);

    void saveUser(IUser user);

    List<IUser> getUserList();
}
