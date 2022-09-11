package com.proyectointegrador.sgc_udea.controller;

import com.proyectointegrador.sgc_udea.dto.BibliografiaDTO;
import com.proyectointegrador.sgc_udea.service.BibliografiaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bibliografia")
public class BibliografiaController {

    private final BibliografiaService bibliografiaService;

    public BibliografiaController(BibliografiaService bibliografiaService) {
        this.bibliografiaService = bibliografiaService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@Validated @RequestBody BibliografiaDTO bibliografiaDTO) {
        try{
            return new ResponseEntity(this.bibliografiaService.save(bibliografiaDTO), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody BibliografiaDTO micro){
        try{
            return new ResponseEntity(this.bibliografiaService.update(micro), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/listar")
    public ResponseEntity<List<?>> listar(){
        try{
            return new ResponseEntity(this.bibliografiaService.listar(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/listarporid/{id}")
    public ResponseEntity<?> listarId(@PathVariable("id") Integer id){
        try{
            return new ResponseEntity(this.bibliografiaService.listarPorId(id), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id){
        try{
            this.bibliografiaService.deleteByid(id);
            return new ResponseEntity( HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
