package com.example.pro.projet1.DAO;

import com.example.pro.projet1.entities.Reponse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ReponseDAO extends JpaRepository<Reponse,Integer> {

        List<Reponse> findAllByUser_Id(Integer userId);



}
