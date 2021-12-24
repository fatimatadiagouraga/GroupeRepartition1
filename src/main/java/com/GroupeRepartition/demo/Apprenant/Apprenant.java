package com.GroupeRepartition.demo.Apprenant;

import com.GroupeRepartition.demo.Repartition.Repartition;

import javax.persistence.*;

@Entity
public class Apprenant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idApp;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String prenom;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private int tel;

    @Enumerated(EnumType.STRING)
    private Etat etat;

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public Boolean getSupprimer() {
        return supprimer;
    }

    public void setSupprimer(Boolean supprimer) {
        this.supprimer = supprimer;
    }

    private Boolean supprimer =false;


    public Apprenant() {
    }

    public Apprenant(Long idApp, String nom, String prenom, String email, int tel, Etat etat, Boolean supprimer) {
        this.idApp = idApp;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.etat = etat;
        this.supprimer = supprimer;
    }

    public Long getIdApp() {
        return idApp;
    }

    public void setIdApp(Long idApp) {
        this.idApp = idApp;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }


}
