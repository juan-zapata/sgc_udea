package com.proyectointegrador.sgc_udea.controller;


import com.proyectointegrador.sgc_udea.dto.MateriaDTO;
import com.proyectointegrador.sgc_udea.model.Materia;
import com.proyectointegrador.sgc_udea.service.MateriaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/materia")
public class MateriaController {

    private final MateriaService materiaService;

    public MateriaController(MateriaService materiaService) {
        this.materiaService = materiaService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody MateriaDTO materiaDTO){
        Materia materia = new Materia(materiaDTO.getCdmateria(),materiaDTO.getDsnombre(), materiaDTO.getTipocurso(),
        materiaDTO.getMicrocurriculom(), materiaDTO.getHorasteoricas(), materiaDTO.getHoraspracticas(),
                materiaDTO.getNivel(), materiaDTO.getClasificable(), materiaDTO.getValidable(), materiaDTO.getHorasteoricopracticas(),
                materiaDTO.getCreditos(), materiaDTO.getResponsable(), materiaDTO.getAreaConocimientoIdareaConocimiento());
        materiaService.save(materia);
        return new ResponseEntity(HttpStatus.CREATED);
    }



    
}
