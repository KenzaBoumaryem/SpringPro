package com.example.pro.projet1.DTO.Questions;

import com.example.pro.projet1.entities.Category;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionDtoResponse {
    private String description;
    @JsonIgnore
    private Category categorie;
}
