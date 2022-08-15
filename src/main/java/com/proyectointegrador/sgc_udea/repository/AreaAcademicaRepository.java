package com.proyectointegrador.sgc_udea.repository;

import com.proyectointegrador.sgc_udea.model.AreaAcademica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaAcademicaRepository extends JpaRepository<AreaAcademica,Integer> {
}
