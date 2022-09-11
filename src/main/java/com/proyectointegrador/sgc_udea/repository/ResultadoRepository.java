package com.proyectointegrador.sgc_udea.repository;

import com.proyectointegrador.sgc_udea.model.Resultado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultadoRepository extends JpaRepository<Resultado, Integer> {
}
