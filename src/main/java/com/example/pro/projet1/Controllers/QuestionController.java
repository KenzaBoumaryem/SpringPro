package com.example.pro.projet1.Controllers;

import com.example.pro.projet1.DTO.CategoryDtoRequest;
import com.example.pro.projet1.DTO.CategoryDtoResponse;
import com.example.pro.projet1.DTO.Questions.QuestionDtoRequest;
import com.example.pro.projet1.DTO.Questions.QuestionDtoResponse;
import com.example.pro.projet1.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Questions")
public class QuestionController {

    @Autowired
    QuestionService questionService;
    @PostMapping("")
    public QuestionDtoResponse save(@RequestBody() QuestionDtoRequest questionDtoRequest){
        return questionService.save(questionDtoRequest);
    }
    @GetMapping("/byCategory/{categoryId}")
    public List<QuestionDtoResponse> getQuestionsByCategoryId(@PathVariable int categoryId) {
        return questionService.getQuestionsByCategoryId(categoryId);
    }
}
