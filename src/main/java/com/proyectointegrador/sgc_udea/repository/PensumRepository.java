package com.proyectointegrador.sgc_udea.repository;

import com.proyectointegrador.sgc_udea.model.Pensum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PensumRepository extends JpaRepository<Pensum, String> {
}
