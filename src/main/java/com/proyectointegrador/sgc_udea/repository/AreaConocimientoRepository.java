package com.proyectointegrador.sgc_udea.repository;

import com.proyectointegrador.sgc_udea.model.AreaConocimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaConocimientoRepository extends JpaRepository<AreaConocimiento, Integer> {
}
