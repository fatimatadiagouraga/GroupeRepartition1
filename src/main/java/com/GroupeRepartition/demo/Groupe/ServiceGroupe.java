package com.GroupeRepartition.demo.Groupe;

import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface ServiceGroupe {

    public String ajouterGroupe(Groupe groupe);
    public Groupe modifierGroupe(Groupe groupe,Long idGr);
    public List<Groupe> listeGroupe();
}
