package com.GroupeRepartition.demo.Groupe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class GroupeServiceImp implements ServiceGroupe{

    @Autowired
    GroupeRepository groupeRepository;

    @Override
    public String ajouterGroupe(Groupe groupe) {
        groupeRepository.save(groupe);
        return "ajout effectuée avec succès";
    }

    @Override
    public Groupe modifierGroupe(Groupe groupe, Long idGr) {
        Groupe groupeX=groupeRepository.findById(idGr).get();
        groupeX.setNom(groupe.getNom());
        groupeX.setDatecreation(groupe.getDatecreation());
        return groupeRepository.save(groupeX);
    }

    @Override
    public List<Groupe> listeGroupe() {
        return groupeRepository.findAll();
    }

}
