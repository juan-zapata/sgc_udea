package com.proyectointegrador.sgc_udea.controller;

import com.proyectointegrador.sgc_udea.dto.BibliografiaDTO;
import com.proyectointegrador.sgc_udea.dto.BibliografiaMateriaDTO;
import com.proyectointegrador.sgc_udea.service.BibliografiaMateriaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bibliografiamateria")
public class BibliografiaMateriaController {

    private final BibliografiaMateriaService bibliografiaMateriaService;

    public BibliografiaMateriaController(BibliografiaMateriaService bibliografiaMateriaService) {
        this.bibliografiaMateriaService = bibliografiaMateriaService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@Validated @RequestBody BibliografiaMateriaDTO bibliografiaDTO) {
        try{
            return new ResponseEntity(this.bibliografiaMateriaService.save(bibliografiaDTO), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody BibliografiaMateriaDTO micro){
        try{
            return new ResponseEntity(this.bibliografiaMateriaService.update(micro), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/listar")
    public ResponseEntity<List<?>> listar(){
        try{
            return new ResponseEntity(this.bibliografiaMateriaService.listar(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/listarporid/{id}")
    public ResponseEntity<?> listarId(@PathVariable("id") Long id){
        try{
            return new ResponseEntity(this.bibliografiaMateriaService.listarPorId(id), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){
        try{
            this.bibliografiaMateriaService.deleteByid(id);
            return new ResponseEntity( HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
