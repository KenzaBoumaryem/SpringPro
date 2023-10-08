package com.example.pro.projet1.services;

import com.example.pro.projet1.DAO.CategoryDAO;
import com.example.pro.projet1.DAO.QuestionDAO;

import com.example.pro.projet1.DTO.Questions.QuestionDtoRequest;
import com.example.pro.projet1.DTO.Questions.QuestionDtoResponse;
import com.example.pro.projet1.entities.Category;
import com.example.pro.projet1.entities.Question;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class QuestionServiceImpl implements QuestionService {
    private ModelMapper modelMapper;
    QuestionDAO questionDAO;

public QuestionServiceImpl(  ModelMapper modelMapper,QuestionDAO questionDAO){
    this.questionDAO=questionDAO;
    this.modelMapper=modelMapper;

}

    @Override
    public QuestionDtoResponse save(QuestionDtoRequest questionDtoRequest){
        Question question = modelMapper.map(questionDtoRequest, Question.class);
        Question saved = questionDAO.save(question);

        return modelMapper.map(saved, QuestionDtoResponse.class);


    }

    @Override
    public List<QuestionDtoResponse> getQuestionsByCategoryId(int categoryId) {
        List<Question> questions = questionDAO.findByCategorieId(categoryId);
        return questions.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public Question getQuestionById(Integer QuestionId) {
        return questionDAO.findById(QuestionId).orElse(null);

    }

    private QuestionDtoResponse convertToDto(Question question) {
        return modelMapper.map(question, QuestionDtoResponse.class);
    }
}
