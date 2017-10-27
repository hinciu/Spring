package com.jpa.service;

import com.jpa.models.User;

import java.util.List;

public interface UserService {
    void insertUser(User user);

    List<User> findAllUsers();
}
