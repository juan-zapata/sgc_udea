package com.proyectointegrador.sgc_udea.service;

import com.proyectointegrador.sgc_udea.dto.AreaConocimientoDTO;
import com.proyectointegrador.sgc_udea.model.AreaConocimiento;
import com.proyectointegrador.sgc_udea.model.Materia;
import com.proyectointegrador.sgc_udea.model.Persona;
import com.proyectointegrador.sgc_udea.model.Requisito;
import com.proyectointegrador.sgc_udea.repository.AreaConocimientoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class AreaConocimientoService {

    private final AreaConocimientoRepository areaConocimientoRepository;

    public AreaConocimientoService(AreaConocimientoRepository areaConocimientoRepository) {
        this.areaConocimientoRepository = areaConocimientoRepository;
    }
    @Transactional
    public AreaConocimiento save(AreaConocimientoDTO areaConocimiento){
        ModelMapper mm = new ModelMapper();
        return areaConocimientoRepository.saveAndFlush(mm.map(areaConocimiento, AreaConocimiento.class));
    }
    public AreaConocimiento update(AreaConocimiento area){
        AreaConocimiento areaUpdate = areaConocimientoRepository.findById(area.getIdareaConocimiento()).get();
        areaUpdate.setAcnombre(area.getAcnombre());
        areaUpdate.setAreainformacion(area.getAreainformacion());
        areaUpdate.setNucleosIdNucleos(area.getNucleosIdNucleos());
        return areaConocimientoRepository.save(areaUpdate);
    }

    public void delete(Integer numeroId){
        areaConocimientoRepository.delete(areaConocimientoRepository.getReferenceById(numeroId));
    }

    public Optional<AreaConocimiento> getById(Integer numeroId){
        return areaConocimientoRepository.findById(numeroId);
    }

    public List<AreaConocimiento> getAll(){
        return areaConocimientoRepository.findAll();
    }


}
