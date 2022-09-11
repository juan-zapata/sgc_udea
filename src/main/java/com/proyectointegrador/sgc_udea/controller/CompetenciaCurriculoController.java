package com.proyectointegrador.sgc_udea.controller;

import com.proyectointegrador.sgc_udea.dto.CompetenciaCurriculoDTO;
import com.proyectointegrador.sgc_udea.dto.ElementoEvaluadorDTO;
import com.proyectointegrador.sgc_udea.dto.NucleosDTO;
import com.proyectointegrador.sgc_udea.model.Nucleos;
import com.proyectointegrador.sgc_udea.service.CompetenciaCurriculoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/competencia-curriculo")
public class CompetenciaCurriculoController {

    private final CompetenciaCurriculoService competenciaCurriculoService;

    public CompetenciaCurriculoController(CompetenciaCurriculoService competenciaCurriculoService) {
        this.competenciaCurriculoService = competenciaCurriculoService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@Validated @RequestBody CompetenciaCurriculoDTO elementoEvaluadorDTO) {
        try{
            return new ResponseEntity(this.competenciaCurriculoService.save(elementoEvaluadorDTO), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody CompetenciaCurriculoDTO micro){
        try{
            return new ResponseEntity(this.competenciaCurriculoService.update(micro), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/listar")
    public ResponseEntity<List<?>> listar(){
        try{
            return new ResponseEntity(this.competenciaCurriculoService.listar(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/listarporid/{id}")
    public ResponseEntity<?> listarId(@PathVariable("id") Long id){
        try{
            return new ResponseEntity(this.competenciaCurriculoService.listarPorId(id), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){
        try{
            this.competenciaCurriculoService.deleteByid(id);
            return new ResponseEntity( HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
