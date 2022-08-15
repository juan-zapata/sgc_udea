package com.proyectointegrador.sgc_udea.service;

import com.proyectointegrador.sgc_udea.dto.MateriaDTO;
import com.proyectointegrador.sgc_udea.model.Materia;
import com.proyectointegrador.sgc_udea.model.Persona;
import com.proyectointegrador.sgc_udea.repository.MateriaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.List;
import java.util.Optional;

@Service
public class MateriaService  {

    private final MateriaRepository materiaRepository;

    public MateriaService(MateriaRepository materiaRepository) {
        this.materiaRepository = materiaRepository;
    }

    @Transactional
    public void save(Materia materia){
        materiaRepository.save(materia);
    }

    public Materia update(Materia materia){
        Materia marteriaUpdate = materiaRepository.findById(materia.getCdmateria()).get();
        marteriaUpdate.setClasificable(marteriaUpdate.getClasificable());
        marteriaUpdate.setCreditos(materia.getCreditos());
        marteriaUpdate.setDsnombre(materia.getDsnombre());
        marteriaUpdate.setHoraspracticas(materia.getHoraspracticas());
        marteriaUpdate.setHorasteoricas(materia.getHorasteoricas());
        marteriaUpdate.setTipocurso(materia.getTipocurso());
        marteriaUpdate.setMicrocurriculom(materia.getMicrocurriculom());
        marteriaUpdate.setNivel(materia.getNivel());
        marteriaUpdate.setValidable(materia.getValidable());
        marteriaUpdate.setHorasteoricopracticas(materia.getHorasteoricopracticas());
        marteriaUpdate.setResponsable(materia.getResponsable());
        marteriaUpdate.setAreaConocimientoIdareaConocimiento(materia.getAreaConocimientoIdareaConocimiento());
        return materiaRepository.save(marteriaUpdate);
    }

    public void delete(Integer numeroId){
        materiaRepository.delete(materiaRepository.getReferenceById(numeroId));
    }

    public Optional<Materia> getById(Integer numeroId){
        return materiaRepository.findById(numeroId);
    }

    public List<Materia> getAll(){
        return materiaRepository.findAll();
    }
}
