package com.proyectointegrador.sgc_udea.repository;

import com.proyectointegrador.sgc_udea.model.Bibliografia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliografiaRepository extends JpaRepository<Bibliografia, Integer> {
}
