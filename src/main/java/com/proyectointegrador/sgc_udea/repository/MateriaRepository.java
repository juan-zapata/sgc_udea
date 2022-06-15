package com.proyectointegrador.sgc_udea.repository;

import com.proyectointegrador.sgc_udea.dto.MateriaDTO;
import com.proyectointegrador.sgc_udea.model.Materia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MateriaRepository extends JpaRepository<Materia, Integer> {


    List<MateriaDTO> getByNivel(String nivel);

}
