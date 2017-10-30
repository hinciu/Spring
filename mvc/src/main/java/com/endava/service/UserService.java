package com.endava.service;

import com.endava.model.User;

import java.util.List;

/**
 * Created by Hinciu on 29.10.2017.
 */
public interface UserService {
    User findById(long id);

    User findByName(String name);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(long id);

    List<User> findAllUsers();

    void deleteAllUsers();

    public boolean isUserExists(User user);


}
