package com.example.pro.projet1.DAO;

import com.example.pro.projet1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User,Integer> {
}
