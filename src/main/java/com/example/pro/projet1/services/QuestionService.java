package com.example.pro.projet1.services;

import com.example.pro.projet1.DTO.Questions.QuestionDtoRequest;
import com.example.pro.projet1.DTO.Questions.QuestionDtoResponse;
import com.example.pro.projet1.entities.Question;

import java.util.List;

public interface QuestionService {


    QuestionDtoResponse save(QuestionDtoRequest questionDtoRequest);
    public List<QuestionDtoResponse> getQuestionsByCategoryId(int categoryId);
    public Question getQuestionById(Integer QuestionId) ;
}
