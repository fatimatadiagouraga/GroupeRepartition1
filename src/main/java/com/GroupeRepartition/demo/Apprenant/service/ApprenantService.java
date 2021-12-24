package com.GroupeRepartition.demo.Apprenant.service;

import com.GroupeRepartition.demo.Apprenant.Apprenant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface ApprenantService {
    public String ajoutApprenant(Apprenant apprenant);
    public Apprenant modifierApprenant(Apprenant apprenant,Long idApp);
    public List<Apprenant> listerApprenant();
    public String supprimerApprenant(Long idApp);

}
