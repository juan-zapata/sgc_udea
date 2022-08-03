package com.proyectointegrador.sgc_udea.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.proyectointegrador.sgc_udea.model.Competencia;
import com.proyectointegrador.sgc_udea.repository.CompetenciaRepository;

@Service
public class CompetenciaService {

    private final CompetenciaRepository competenciaRepository;

    public CompetenciaService(CompetenciaRepository competenciaRepository) {
        this.competenciaRepository = competenciaRepository;
    }

    public Competencia save(Competencia competencia) {
        return competenciaRepository.save(competencia);
    }

    public Competencia update(Competencia competencia) {
        Competencia competenciaUpdate = competenciaRepository.findById(competencia.getIdCompetencia()).get();
        competenciaUpdate.setIdCompetencia(competencia.getIdCompetencia());
        competenciaUpdate.setDetCompetencia(competencia.getDetCompetencia());
        return competenciaRepository.save(competenciaUpdate);
    }

    public void delete(Integer numeroId) {
        competenciaRepository.delete(competenciaRepository.getReferenceById(numeroId));
    }

    public Optional<Competencia> getById(Integer numeroId) {
        return competenciaRepository.findById(numeroId);
    }

    public List<Competencia> getAll() {
        return competenciaRepository.findAll();
    }

}
