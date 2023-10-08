package com.example.pro.projet1.services;

import com.example.pro.projet1.DAO.ChoiceDAO;
import com.example.pro.projet1.entities.Choice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ChoiceService {
    @Autowired
    ChoiceDAO choiceDAO;
    public Choice getChoiceById(Integer choiceId) {
        return choiceDAO.findById(choiceId).orElse(null);
    }
    public Integer getChoicePointsById(Integer choiceId) {
        Optional<Choice> choiceOptional = choiceDAO.findById(choiceId);
        return choiceOptional.map(Choice::getPoint).orElse(0);
    }

}
