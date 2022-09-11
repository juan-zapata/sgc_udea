package com.proyectointegrador.sgc_udea.controller;

import com.proyectointegrador.sgc_udea.dto.BibliografiaDTO;
import com.proyectointegrador.sgc_udea.dto.SedeProgramaDTO;
import com.proyectointegrador.sgc_udea.service.SedeProgramaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class SedeProgramaController {

    private final SedeProgramaService sedeProgramaService;

    public SedeProgramaController(SedeProgramaService sedeProgramaService) {
        this.sedeProgramaService = sedeProgramaService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@Validated @RequestBody SedeProgramaDTO bibliografiaDTO) {
        try{
            return new ResponseEntity(this.sedeProgramaService.save(bibliografiaDTO), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody SedeProgramaDTO micro){
        try{
            return new ResponseEntity(this.sedeProgramaService.update(micro), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/listar")
    public ResponseEntity<List<?>> listar(){
        try{
            return new ResponseEntity(this.sedeProgramaService.listar(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/listarporid/{id}")
    public ResponseEntity<?> listarId(@PathVariable("id") Long id){
        try{
            return new ResponseEntity(this.sedeProgramaService.listarPorId(id), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){
        try{
            this.sedeProgramaService.deleteByid(id);
            return new ResponseEntity( HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
