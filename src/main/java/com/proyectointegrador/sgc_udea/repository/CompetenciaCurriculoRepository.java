package com.proyectointegrador.sgc_udea.repository;

import com.proyectointegrador.sgc_udea.model.CompetenciaCurriculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetenciaCurriculoRepository extends JpaRepository<CompetenciaCurriculo, Long> {
}
