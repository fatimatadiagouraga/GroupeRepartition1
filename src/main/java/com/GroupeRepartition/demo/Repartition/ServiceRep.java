package com.GroupeRepartition.demo.Repartition;

import com.GroupeRepartition.demo.Apprenant.Apprenant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface ServiceRep {

    public List<Apprenant> ordre() ;
    public  List<Apprenant> aleatoire();
}
