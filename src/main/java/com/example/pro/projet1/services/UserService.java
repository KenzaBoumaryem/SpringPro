package com.example.pro.projet1.services;

import com.example.pro.projet1.DAO.UserDAO;
import com.example.pro.projet1.entities.Choice;
import com.example.pro.projet1.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDAO userDAO;
    public User getUserById(Integer userId) {
        return userDAO.findById(userId).orElse(null);
    }
}
