package com.example.pro.projet1.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
    @Table
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
@JsonIgnoreProperties ("categorie")
public class Question {

        @Id
        @GeneratedValue
        private int id;
        @Column(nullable = false)
        private String description;
        @ManyToOne
        @JoinColumn(name="category_id")
        private Category categorie;

        @OneToMany(mappedBy = "question",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
        @JsonIgnore
        private List<Reponse>reponses;



//    {
//        "description": "Nouvelle question",
//            "categorie": {
//        "id": 2
//
//    }
//    }


    }
