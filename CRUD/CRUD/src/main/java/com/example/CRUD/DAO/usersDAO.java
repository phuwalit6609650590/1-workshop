package com.example.CRUD.DAO;

import com.example.CRUD.entity.Users;

import java.util.List;


public interface usersDAO {

    Users save(Users user);
    void delete(Integer id);
    Users get(Integer id);
    List<Users> getAll();
    void update(Users user);
}
