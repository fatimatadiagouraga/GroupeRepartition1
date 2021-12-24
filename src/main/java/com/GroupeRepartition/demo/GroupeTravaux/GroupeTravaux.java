package com.GroupeRepartition.demo.GroupeTravaux;

import com.GroupeRepartition.demo.Groupe.Groupe;
import com.GroupeRepartition.demo.Travaux.Travaux;

import javax.persistence.*;

@Entity
public class GroupeTravaux {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int nbTrGr;

    @ManyToOne
    @JoinColumn(name = "idGr")
    private Groupe groupe;

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    @ManyToOne
    @JoinColumn(name = "idTr")
    private Travaux travaux;

    public Travaux getTravaux() {
        return travaux;
    }

    public void setTravaux(Travaux travaux) {
        this.travaux = travaux;
    }

    public GroupeTravaux() {
    }

    public GroupeTravaux(int nbTrGr) {
        this.nbTrGr = nbTrGr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNbTrGr() {
        return nbTrGr;
    }

    public void setNbTrGr(int nbTrGr) {
        this.nbTrGr = nbTrGr;
    }
}
