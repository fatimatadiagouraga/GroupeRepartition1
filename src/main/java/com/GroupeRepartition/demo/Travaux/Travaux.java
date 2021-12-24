package com.GroupeRepartition.demo.Travaux;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
@Entity
public class Travaux {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTr;

    @Column(nullable = false)
    private String titre;

    @Column(nullable = false)
    private String type;

    private LocalDate datedebut=LocalDate.now();

    private Date datefin;

    public Travaux() {
    }

    public Travaux(String titre, String type, LocalDate datedebut, Date datefin) {
        this.titre = titre;
        this.type = type;
        this.datedebut = datedebut;
        this.datefin = datefin;
    }

    public Long getIdTr() {
        return idTr;
    }

    public void setIdTr(Long idTr) {
        this.idTr = idTr;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDatedebut() {
        return datedebut;
    }

    public void setDatedebut(LocalDate datedebut) {
        this.datedebut = datedebut;
    }

    public Date getDatefin() {
        return datefin;
    }

    public void setDatefin(Date datefin) {
        this.datefin = datefin;
    }
}
