package com.GroupeRepartition.demo.Groupe;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
@Entity

public class Groupe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGr;

    private String nom;

    private LocalDate datecreation=LocalDate.now();

    public Groupe() {
    }

    public Groupe(String nom, LocalDate datecreation) {
        this.nom = nom;
        this.datecreation = datecreation;
    }

    public Long getIdGr() {
        return idGr;
    }

    public void setIdGr(Long idGr) {
        this.idGr = idGr;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(LocalDate datecreation) {
        this.datecreation = datecreation;
    }
}
