package com.proyectointegrador.sgc_udea.repository;

import com.proyectointegrador.sgc_udea.model.MicroCurriculoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MicroCurriculoRepository extends JpaRepository<MicroCurriculoEntity, Integer> {

}
