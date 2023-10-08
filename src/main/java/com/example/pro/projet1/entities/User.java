package com.example.pro.projet1.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class User {
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private String Email;
    @Column(nullable = false)
    private int Telephone;
    @Column(nullable = false)
    private int type;
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)

    private List<Reponse> reponses;


//    @ManyToOne
//    private  User user;


}
