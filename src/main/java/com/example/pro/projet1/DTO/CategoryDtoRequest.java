package com.example.pro.projet1.DTO;

import com.example.pro.projet1.entities.Diagno;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDtoRequest {

    private String libelle;
    private Diagno diagno;

}
