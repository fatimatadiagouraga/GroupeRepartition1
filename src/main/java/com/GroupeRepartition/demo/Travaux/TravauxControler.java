package com.GroupeRepartition.demo.Travaux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/travaux/")
@CrossOrigin

public class TravauxControler {
    @Autowired
    TravauxService travauxService;

    @PostMapping("ajoutTravaux")
    public String ajouterTravaux(@RequestBody Travaux travaux) {
        travauxService.ajouterTravaux(travaux);
        return "ajout effectuée avec succes";
    }

    @PutMapping("modifierTravaux/{idTr}")
    public Travaux modifierTravaux(@RequestBody Travaux travaux,@PathVariable Long idTr) {
        return travauxService.modifierTravaux(travaux,idTr);
    }

    @DeleteMapping("supprimerTravaux/{idTr}")
    public String supprimerTravaux(@PathVariable Long idTr){
        travauxService.supprimerTravaux(idTr);
        return "suppression effectuée avec succes";
    }

    @GetMapping("listeTravaux")
    public List<Travaux> listerTravaux(){
        return travauxService.listerTravaux();
    }


}
