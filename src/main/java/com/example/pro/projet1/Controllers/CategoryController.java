package com.example.pro.projet1.Controllers;


import com.example.pro.projet1.DTO.CategoryDtoRequest;
import com.example.pro.projet1.DTO.CategoryDtoResponse;
import com.example.pro.projet1.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping("")
    public CategoryDtoResponse save(@RequestBody()CategoryDtoRequest categoryDtoRequest){
        return categoryService.save(categoryDtoRequest);
    }
}
