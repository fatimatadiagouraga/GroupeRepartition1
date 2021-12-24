package com.GroupeRepartition.demo.Apprenant.Repositories;

import com.GroupeRepartition.demo.Apprenant.Apprenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ApprenantRepository extends JpaRepository<Apprenant,Long> {
}
