package com.proyectointegrador.sgc_udea.repository;

import com.proyectointegrador.sgc_udea.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {
}
