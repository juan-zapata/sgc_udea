package com.proyectointegrador.sgc_udea.controller;


import com.proyectointegrador.sgc_udea.dto.ElementoEvaluadorDTO;
import com.proyectointegrador.sgc_udea.service.ElementoEvaluadorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/elementoevaluador")
public class ElementoEvaluadorController {

    private final ElementoEvaluadorService elementoEvaluadorService;

    public ElementoEvaluadorController(ElementoEvaluadorService elementoEvaluadorService) {
        this.elementoEvaluadorService = elementoEvaluadorService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@Validated @RequestBody ElementoEvaluadorDTO elementoEvaluadorDTO) {
        try{
            return new ResponseEntity(this.elementoEvaluadorService.save(elementoEvaluadorDTO), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody ElementoEvaluadorDTO micro){
        try{
            return new ResponseEntity(this.elementoEvaluadorService.update(micro), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/listar")
    public ResponseEntity<List<?>> listar(){
        try{
            return new ResponseEntity(this.elementoEvaluadorService.listar(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/listarporid/{id}")
    public ResponseEntity<?> listarId(@PathVariable("id") Integer id){
        try{
            return new ResponseEntity(this.elementoEvaluadorService.listarPorId(id), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id){
        try{
            this.elementoEvaluadorService.deleteByid(id);
            return new ResponseEntity( HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



}
