package com.jpa.service;

import com.jpa.Dao.UserDao;
import com.jpa.Dao.UserDaoImpl;
import com.jpa.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {
@Autowired
    UserDao userDao;

    @Transactional
    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    public List<User> findAllUsers() {
        return userDao.findAllUsers();
    }
}
