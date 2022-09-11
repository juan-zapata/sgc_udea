package com.proyectointegrador.sgc_udea.repository;

import com.proyectointegrador.sgc_udea.model.PensumMateria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PensumMateriaRepository extends JpaRepository<PensumMateria, Long> {
}
