package com.GroupeRepartition.demo.Travaux;

import com.GroupeRepartition.demo.Apprenant.Apprenant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface TravauxService {
    public String ajouterTravaux(Travaux travaux);
    public Travaux modifierTravaux(Travaux travaux,Long idTr);
    public String supprimerTravaux(Long idTr);
    public List<Travaux> listerTravaux();
}
