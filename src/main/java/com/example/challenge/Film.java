package com.example.challenge;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class Film
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
    String titre;
    String acteur;
    Date dateSortie;

    public Film(){}

    public Film(String titre, String acteur, Date dateSortie) {
        this.titre = titre;
        this.acteur = acteur;
        this.dateSortie = dateSortie;
    }

}