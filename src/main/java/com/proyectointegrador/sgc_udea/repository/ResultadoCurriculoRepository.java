package com.proyectointegrador.sgc_udea.repository;

import com.proyectointegrador.sgc_udea.model.ResultadoCurriculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultadoCurriculoRepository extends JpaRepository<ResultadoCurriculo, Long> {
}
