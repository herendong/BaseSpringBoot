package com.halous.parentsbase.Iservice;

import com.halous.parentsbase.dtos.req.Student;
import com.halous.parentsbase.dtos.req.UserEntity;

import java.util.List;

public interface UserDao {

    public void saveUser(UserEntity user);

    public UserEntity findUserByUserName(String userName);

    public void updateUser(UserEntity user);

    public void deleteUserById(Long id);

    public void saveUser(Student user);
}
