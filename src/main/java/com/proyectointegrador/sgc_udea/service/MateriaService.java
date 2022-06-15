package com.proyectointegrador.sgc_udea.service;

import com.proyectointegrador.sgc_udea.dto.MateriaDTO;
import com.proyectointegrador.sgc_udea.repository.MateriaRepository;

public class MateriaService  {

    private final MateriaRepository materiaRepository;

    public MateriaService(MateriaRepository materiaRepository) {
        this.materiaRepository = materiaRepository;
    }

    public void save(MateriaDTO materia){

    }
}
