package com.proyectointegrador.sgc_udea.service;

import com.proyectointegrador.sgc_udea.model.AreaAcademica;
import com.proyectointegrador.sgc_udea.repository.AreaAcademicaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class AreaAcademicaService {

    private final AreaAcademicaRepository areaAcademicaRepository;

    public AreaAcademicaService(AreaAcademicaRepository areaAcademicaRepository) {
        this.areaAcademicaRepository = areaAcademicaRepository;
    }


    @Transactional
    public void save(AreaAcademica areaAcademica){
        areaAcademicaRepository.save(areaAcademica);
    }

    public AreaAcademica update(AreaAcademica area){
        AreaAcademica areaUpdate = areaAcademicaRepository.findById(area.getIdAreaAcademica()).get();
        areaUpdate.setNombreAreaAcademica(area.getNombreAreaAcademica());
        return areaAcademicaRepository.save(areaUpdate);
    }

    public void delete(Integer numeroId){
        areaAcademicaRepository.delete(areaAcademicaRepository.getReferenceById(numeroId));
    }

    public Optional<AreaAcademica> getById(Integer numeroId){
        return areaAcademicaRepository.findById(numeroId);
    }

    public List<AreaAcademica> getAll(){
        return areaAcademicaRepository.findAll();
    }

}
