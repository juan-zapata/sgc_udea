package com.proyectointegrador.sgc_udea.repository;

import com.proyectointegrador.sgc_udea.model.ElementoEvaluador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementoEvaluadorRepository extends JpaRepository<ElementoEvaluador, Integer> {
}
