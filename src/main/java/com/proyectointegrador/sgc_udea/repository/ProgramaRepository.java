package com.proyectointegrador.sgc_udea.repository;

import com.proyectointegrador.sgc_udea.model.Programa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramaRepository extends JpaRepository<Programa, Integer> {
}
