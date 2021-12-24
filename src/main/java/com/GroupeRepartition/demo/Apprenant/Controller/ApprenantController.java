package com.GroupeRepartition.demo.Apprenant.Controller;

import com.GroupeRepartition.demo.Apprenant.Apprenant;
import com.GroupeRepartition.demo.Apprenant.ServiceImp.ApprenantServiceImp;
import com.GroupeRepartition.demo.Apprenant.service.ApprenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/apprenant/")

public class ApprenantController {
    @Autowired
    ApprenantService apprenantService;

    @PostMapping("ajoutapprenant")
    public String ajouterApprenant(@RequestBody Apprenant apprenant){
        apprenantService.ajoutApprenant(apprenant) ;
       return "successsssssssss";
    }
    @GetMapping("listerapprenant")
    public List<Apprenant> listerApprenant(){
        return apprenantService.listerApprenant();
    }

    @PutMapping("modifierapprenant/{idApp}")
    public Apprenant modifierapprenant(@RequestBody Apprenant apprenant,@PathVariable Long idApp){
        return  apprenantService.modifierApprenant(apprenant,idApp);
    }

    @DeleteMapping("supprimerapprenant/{idApp}")
    public  String suppApprenant(@PathVariable Long idApp){
        apprenantService.supprimerApprenant(idApp);
        return "successssss";
    }

}
