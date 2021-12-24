package com.GroupeRepartition.demo.Repartition;

import com.GroupeRepartition.demo.Apprenant.Apprenant;
import com.GroupeRepartition.demo.Groupe.Groupe;

import javax.persistence.*;

@Entity
public class Repartition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRep;

    @Enumerated(EnumType.STRING)
    private  type Type;

    private int nbrAppParGr;


    @ManyToOne
    @JoinColumn(name = "idApp")
    private Apprenant apprenant;

    public Apprenant getApprenant() {

        return apprenant;
    }

    public void setApprenant(Apprenant apprenant) {
        this.apprenant = apprenant;
    }

    public Groupe  getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    @ManyToOne
    @JoinColumn(name = "idGr")
    private Groupe groupe;

    public Repartition() {
    }

    public Repartition(type type, int nbrAppParGr, Apprenant apprenant, Groupe groupe) {
        Type = type;
        this.nbrAppParGr = nbrAppParGr;
        this.apprenant = apprenant;
        this.groupe = groupe;
    }

    public Long getIdRep() {
        return idRep;
    }

    public void setIdRep(Long idRep) {
        this.idRep = idRep;
    }

    public type getType() {
        return Type;
    }

    public void setType(type type) {
        Type = type;
    }

    public int getNbrAppParGr() {
        return nbrAppParGr;
    }

    public void setNbrAppParGr(int nbrAppParGr) {
        this.nbrAppParGr = nbrAppParGr;
    }
}
