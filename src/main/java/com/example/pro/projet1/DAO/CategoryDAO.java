package com.example.pro.projet1.DAO;

import com.example.pro.projet1.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CategoryDAO extends JpaRepository <Category,Integer>{

}
