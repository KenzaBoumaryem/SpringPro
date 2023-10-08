package com.example.pro.projet1.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Choice {
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String Description;
    @Column(nullable = false)
    private int Point;
    @OneToMany(mappedBy = "choice",fetch = FetchType.LAZY,cascade = CascadeType.ALL)

    private Set<Reponse> reponses;

}
