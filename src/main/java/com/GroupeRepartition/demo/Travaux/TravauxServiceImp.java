package com.GroupeRepartition.demo.Travaux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service

public class TravauxServiceImp implements TravauxService{
    @Autowired
    TravauxRepository travauxRepository;

    @Override
    public String ajouterTravaux(@RequestBody Travaux travaux) {
        travauxRepository.save(travaux);
        return "ajout effectuée avec succes";
    }

    @Override
    public Travaux modifierTravaux(Travaux travaux, Long idTr) {
        Travaux travauxexistant=travauxRepository.findById(idTr).get();
        travauxexistant.setTitre(travaux.getTitre());
        travauxexistant.setType(travaux.getType());
        travauxexistant.setDatedebut(travaux.getDatedebut());
        travauxexistant.setDatefin(travaux.getDatefin());
        return travauxRepository.save(travauxexistant);

    }

    @Override
    public String supprimerTravaux(Long idTr) {
        travauxRepository.deleteById(idTr);
        return"suppression effectuée avec succes";
    }

    @Override
    public List<Travaux> listerTravaux() {

        return travauxRepository.findAll();
    }
}
