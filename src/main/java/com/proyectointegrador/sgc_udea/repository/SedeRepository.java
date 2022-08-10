package com.proyectointegrador.sgc_udea.repository;

import com.proyectointegrador.sgc_udea.model.Sede;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SedeRepository extends JpaRepository<Sede, Integer> {
}
