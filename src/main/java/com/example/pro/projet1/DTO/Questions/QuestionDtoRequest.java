package com.example.pro.projet1.DTO.Questions;

import com.example.pro.projet1.entities.Category;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionDtoRequest {

    private String description;
    private Category categorie;



}
