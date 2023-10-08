package com.example.pro.projet1.services;

import com.example.pro.projet1.DAO.CategoryDAO;
import com.example.pro.projet1.DAO.DiagnoDAO;
import com.example.pro.projet1.entities.Category;
import com.example.pro.projet1.entities.Diagno;
import jdk.jshell.Diag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiagnoServiceImpl implements DiagnoService{
    @Autowired
    DiagnoDAO diagnoDAO;
CategoryDAO categoryDAO;
    @Override
    public List<Diagno> getDiagnoWithCategories() {
        return diagnoDAO.findAll();
    }



}

