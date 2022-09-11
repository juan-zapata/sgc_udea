package com.proyectointegrador.sgc_udea.controller;

import com.proyectointegrador.sgc_udea.dto.ResultadoCurriculoDTO;
import com.proyectointegrador.sgc_udea.service.ResultadoCurriculoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resultadocurriculo")
public class ResultadoCurriculoController {

    private final ResultadoCurriculoService resultadoCurriculoService;


    public ResultadoCurriculoController(ResultadoCurriculoService resultadoCurriculoService) {
        this.resultadoCurriculoService = resultadoCurriculoService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@Validated @RequestBody ResultadoCurriculoDTO bibliografiaDTO) {
        try{
            return new ResponseEntity(this.resultadoCurriculoService.save(bibliografiaDTO), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody ResultadoCurriculoDTO micro){
        try{
            return new ResponseEntity(this.resultadoCurriculoService.update(micro), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/listar")
    public ResponseEntity<List<?>> listar(){
        try{
            return new ResponseEntity(this.resultadoCurriculoService.listar(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/listarporid/{id}")
    public ResponseEntity<?> listarId(@PathVariable("id") Long id){
        try{
            return new ResponseEntity(this.resultadoCurriculoService.listarPorId(id), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){
        try{
            this.resultadoCurriculoService.deleteByid(id);
            return new ResponseEntity( HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
