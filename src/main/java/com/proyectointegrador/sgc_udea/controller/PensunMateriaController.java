package com.proyectointegrador.sgc_udea.controller;


import com.proyectointegrador.sgc_udea.dto.PensumMateriaDTO;
import com.proyectointegrador.sgc_udea.service.PensumMateriaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/pensummateria")
public class PensunMateriaController {

    private final PensumMateriaService pensumMateriaService;

    public PensunMateriaController(PensumMateriaService pensumMateriaService) {
        this.pensumMateriaService = pensumMateriaService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@Validated @RequestBody PensumMateriaDTO elementoEvaluadorDTO) {
        try{
            return new ResponseEntity(this.pensumMateriaService.save(elementoEvaluadorDTO), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody PensumMateriaDTO micro){
        try{
            return new ResponseEntity(this.pensumMateriaService.update(micro), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/listar")
    public ResponseEntity<List<?>> listar(){
        try{
            return new ResponseEntity(this.pensumMateriaService.listar(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/listarporid/{id}")
    public ResponseEntity<?> listarId(@PathVariable("id") Long id){
        try{
            return new ResponseEntity(this.pensumMateriaService.listarPorId(id), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){
        try{
            this.pensumMateriaService.deleteByid(id);
            return new ResponseEntity( HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
