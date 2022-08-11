package com.example.personalhealthassistant.Service;

import com.example.personalhealthassistant.model.UsersEntity;

import java.util.List;

public interface userService {
    void saveUsers(UsersEntity user);


    //lấy tất cả
    List<UsersEntity> listsUsers();

    //tìm theo id
    UsersEntity findUserById(Long id);

    //delete
    void deleteUser(Long id);

    UsersEntity findByUsername(String name);

    Boolean existsByUsername(String username);
}
