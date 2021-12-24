package com.GroupeRepartition.demo.Apprenant.ServiceImp;

import com.GroupeRepartition.demo.Apprenant.Apprenant;
import com.GroupeRepartition.demo.Apprenant.Etat;
import com.GroupeRepartition.demo.Apprenant.Repositories.ApprenantRepository;
import com.GroupeRepartition.demo.Apprenant.service.ApprenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ApprenantServiceImp implements ApprenantService {
    @Autowired
    ApprenantRepository apprenantRepository;
    @Override
    public String ajoutApprenant(Apprenant apprenant) {
        apprenantRepository.save(apprenant);
        return"Succes Adding";
    }

    @Override
    public Apprenant modifierApprenant(Apprenant apprenant, Long idApp) {
        Apprenant apprenantExistant= apprenantRepository.findById(idApp).get();
        apprenantExistant.setNom(apprenant.getNom());
        apprenantExistant.setPrenom(apprenant.getPrenom());
        apprenantExistant.setEmail(apprenant.getEmail());
        apprenantExistant.setTel(apprenantExistant.getTel());
        return apprenantRepository.save(apprenantExistant);
    }

    @Override
    public List<Apprenant> listerApprenant() {
        return apprenantRepository.findAll();
    }

    @Override
    public String supprimerApprenant(Long idApp) {
        Apprenant apprenant = apprenantRepository.findById(idApp).get();

        apprenant.setSupprimer(true);
        apprenant.setEtat(Etat.Desactiver);
        return "suppression reussie";
    }
}
