package com.proyectointegrador.sgc_udea.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectointegrador.sgc_udea.model.Competencia;

@Repository
public interface CompetenciaRepository extends JpaRepository<Competencia, Integer> {



}