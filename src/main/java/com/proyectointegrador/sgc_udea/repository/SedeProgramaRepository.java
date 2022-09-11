package com.proyectointegrador.sgc_udea.repository;

import com.proyectointegrador.sgc_udea.model.SedePrograma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SedeProgramaRepository extends JpaRepository<SedePrograma, Long> {
}
