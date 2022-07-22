package com.proyectointegrador.sgc_udea.service;

import com.proyectointegrador.sgc_udea.model.AreaConocimiento;
import com.proyectointegrador.sgc_udea.model.Materia;
import com.proyectointegrador.sgc_udea.repository.AreaConocimientoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AreaConocimientoService {

    private final AreaConocimientoRepository areaConocimientoRepository;

    public AreaConocimientoService(AreaConocimientoRepository areaConocimientoRepository) {
        this.areaConocimientoRepository = areaConocimientoRepository;
    }
    @Transactional
    public void save(AreaConocimiento areaConocimiento){
        areaConocimientoRepository.save(areaConocimiento);
    }


}
