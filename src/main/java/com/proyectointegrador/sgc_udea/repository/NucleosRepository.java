package com.proyectointegrador.sgc_udea.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectointegrador.sgc_udea.model.Nucleos;

import org.springframework.stereotype.Repository;

@Repository
public interface NucleosRepository extends JpaRepository<Nucleos, Integer> {
    
}
