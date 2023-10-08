package com.example.pro.projet1.DAO;


import com.example.pro.projet1.entities.Category;
import com.example.pro.projet1.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionDAO extends JpaRepository<Question,Integer> {


    List<Question> findByCategorieId(int categoryId);

}
