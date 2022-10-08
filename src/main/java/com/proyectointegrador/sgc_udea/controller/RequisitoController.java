package com.proyectointegrador.sgc_udea.controller;

import com.proyectointegrador.sgc_udea.dto.BibliografiaDTO;
import com.proyectointegrador.sgc_udea.dto.RequisitoDTO;
import com.proyectointegrador.sgc_udea.service.RequisitoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/requisito")
public class RequisitoController {

    private final RequisitoService requisitoService;

    public RequisitoController(RequisitoService requisitoService) {
        this.requisitoService = requisitoService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@Validated @RequestBody RequisitoDTO bibliografiaDTO) {
        try{
            return new ResponseEntity(this.requisitoService.save(bibliografiaDTO), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody RequisitoDTO micro){
        try{
            return new ResponseEntity(this.requisitoService.update(micro), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/listar")
    public ResponseEntity<List<?>> listar(){
        try{
            return new ResponseEntity(this.requisitoService.listar(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/listarporid/{id}")
    public ResponseEntity<?> listarId(@PathVariable("id") Long id){
        try{
            return new ResponseEntity(this.requisitoService.listarPorId(id), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){
        try{
            this.requisitoService.deleteByid(id);
            return new ResponseEntity( HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
