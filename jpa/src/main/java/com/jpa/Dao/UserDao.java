package com.jpa.Dao;

import com.jpa.models.User;

import java.util.List;

public interface UserDao {
    void insertUser(User user);

    List<User> findAllUsers();
}
