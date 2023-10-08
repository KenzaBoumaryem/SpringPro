package com.example.pro.projet1.DTO;

import com.example.pro.projet1.entities.Choice;
import com.example.pro.projet1.entities.Question;
import com.example.pro.projet1.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReponseDetailsDTO {
    private Integer choiceId;
    private Integer questionId;
    private Integer categoryId;

}

