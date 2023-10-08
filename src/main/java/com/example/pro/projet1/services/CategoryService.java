package com.example.pro.projet1.services;

import com.example.pro.projet1.DTO.CategoryDtoRequest;
import com.example.pro.projet1.DTO.CategoryDtoResponse;

public interface CategoryService {

    CategoryDtoResponse save(CategoryDtoRequest categoryDtoRequest);
    String getCategoryNameById(Integer categoryId);
}
