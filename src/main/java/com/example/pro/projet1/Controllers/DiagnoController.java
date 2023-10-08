package com.example.pro.projet1.Controllers;

import com.example.pro.projet1.entities.Category;
import com.example.pro.projet1.entities.Diagno;
import com.example.pro.projet1.services.DiagnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/diagno")
public class DiagnoController {
    @Autowired
    DiagnoService diagnoService;

    @GetMapping("/")
    public List<Diagno> getDiagnoWithCategories() {
        return diagnoService.getDiagnoWithCategories();
    }


}
