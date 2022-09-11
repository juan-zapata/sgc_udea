package com.proyectointegrador.sgc_udea.repository;

import com.proyectointegrador.sgc_udea.model.Requisito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequisitoRepository extends JpaRepository<Requisito, Long> {
}
