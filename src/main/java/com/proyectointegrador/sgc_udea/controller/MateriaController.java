package com.proyectointegrador.sgc_udea.controller;


import com.proyectointegrador.sgc_udea.dto.MateriaDTO;
import com.proyectointegrador.sgc_udea.dto.PersonaDTO;
import com.proyectointegrador.sgc_udea.model.Materia;
import com.proyectointegrador.sgc_udea.model.Persona;
import com.proyectointegrador.sgc_udea.service.MateriaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
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

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody MateriaDTO ma){
        Materia materia = new Materia(ma.getAreaConocimientoIdareaConocimiento(), ma.getDsnombre(), ma.getTipocurso(),
                ma.getMicrocurriculom(),ma.getHorasteoricas(), ma.getHoraspracticas(), ma.getNivel(),ma.getClasificable(),
                ma.getValidable(), ma.getHorasteoricopracticas(), ma.getCreditos(), ma.getResponsable(), ma.getCdmateria());
        return new ResponseEntity(materiaService.update(materia),HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Integer id){
        materiaService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/retornar-materia/{id}")
    public ResponseEntity<Materia> getById(@PathVariable(value = "id") Integer id){
        return new ResponseEntity(materiaService.getById(id),HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Persona>> getAll(){
        try{
            List<Materia> materias = materiaService.getAll();
            if(!materias.isEmpty()){
                return new ResponseEntity(materias, HttpStatus.OK);
            }
        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity(HttpStatus.OK);
    }



    
}
