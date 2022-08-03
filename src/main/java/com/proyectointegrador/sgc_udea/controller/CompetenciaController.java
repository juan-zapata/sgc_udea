package com.proyectointegrador.sgc_udea.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectointegrador.sgc_udea.dto.CompetenciaDTO;
import com.proyectointegrador.sgc_udea.model.Competencia;
import com.proyectointegrador.sgc_udea.service.CompetenciaService;

@RestController
@RequestMapping("/competencia")
public class CompetenciaController {

    private final CompetenciaService competenciaService;

    public CompetenciaController(CompetenciaService competenciaService) {
        this.competenciaService = competenciaService;
    }

    


    @PostMapping("/create")
    public ResponseEntity<?> create(@Validated @RequestBody CompetenciaDTO competenciaDTO){
        try{
            Competencia competencia = new Competencia(competenciaDTO.getIdCompetencia(), competenciaDTO.getDetCompetencia());
            if(competencia.getIdCompetencia() != null && competencia.getDetCompetencia() != null){
                competenciaService.save(competencia);
                return new ResponseEntity(HttpStatus.CREATED);
            }else{
                return new ResponseEntity(HttpStatus.BAD_REQUEST);
            }
        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody CompetenciaDTO competenciaDTO){
        Competencia competencia = new Competencia(competenciaDTO.getIdCompetencia(), competenciaDTO.getDetCompetencia());
        return new ResponseEntity(competenciaService.update(competencia),HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Integer id){
        competenciaService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/retornar-competencia/{id}")
    public ResponseEntity<Competencia> getById(@PathVariable(value = "id") Integer id){
        return new ResponseEntity(competenciaService.getById(id),HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Competencia>> getAll(){
        try{
            List<Competencia> competencias = competenciaService.getAll();
            if(!competencias.isEmpty()){
                return new ResponseEntity(competencias, HttpStatus.OK);
            }
        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity(HttpStatus.OK);
    }
}
