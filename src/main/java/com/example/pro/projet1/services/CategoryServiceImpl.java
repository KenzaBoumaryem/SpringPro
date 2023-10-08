package com.example.pro.projet1.services;

import com.example.pro.projet1.DAO.CategoryDAO;
import com.example.pro.projet1.DTO.CategoryDtoRequest;
import com.example.pro.projet1.DTO.CategoryDtoResponse;
import com.example.pro.projet1.entities.Category;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
private CategoryDAO categoryDAO;
private ModelMapper modelMapper;
    public CategoryServiceImpl(CategoryDAO categoryDAO, ModelMapper modelMapper) {
        this.categoryDAO = categoryDAO;
        this.modelMapper = modelMapper;
    }

    @Override
    public CategoryDtoResponse save(CategoryDtoRequest categoryDtoRequest) {
        Category category=modelMapper.map(categoryDtoRequest,Category.class);
        Category saved=categoryDAO.save(category);
        return modelMapper.map(saved,CategoryDtoResponse.class);
    }
    @Override
    public String getCategoryNameById(Integer categoryId) {
        Optional<Category> categoryOptional = categoryDAO.findById(categoryId);
        return categoryOptional.map(Category::getLibelle).orElse(null);
    }
}
