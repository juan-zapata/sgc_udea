package com.proyectointegrador.sgc_udea.controller;

import com.proyectointegrador.sgc_udea.dto.AreaConocimientoDTO;
import com.proyectointegrador.sgc_udea.dto.MateriaDTO;
import com.proyectointegrador.sgc_udea.model.AreaConocimiento;
import com.proyectointegrador.sgc_udea.model.Materia;
import com.proyectointegrador.sgc_udea.service.AreaConocimientoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/areaconocimiento")
public class AreaConocimientoController {

    private final AreaConocimientoService areaConocimientoService;

    public AreaConocimientoController(AreaConocimientoService areaConocimientoService) {
        this.areaConocimientoService = areaConocimientoService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody AreaConocimientoDTO areaConocimientoDTO){
        AreaConocimiento areaConocimiento = new AreaConocimiento(areaConocimientoDTO.getIdareaConocimiento(),
                areaConocimientoDTO.getAcnombre(), areaConocimientoDTO.getAreainformacion(),
                areaConocimientoDTO.getNucleosIdNucleos());
        areaConocimientoService.save(areaConocimiento);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
