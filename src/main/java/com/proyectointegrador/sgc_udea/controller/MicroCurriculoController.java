package com.proyectointegrador.sgc_udea.controller;

import com.proyectointegrador.sgc_udea.dto.MicroCurriculoDTO;
import com.proyectointegrador.sgc_udea.service.MicroCurriculoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/microcurriculo")
public class MicroCurriculoController {

    private final MicroCurriculoService microCurriculoService;

    public MicroCurriculoController(MicroCurriculoService microCurriculoService) {
        this.microCurriculoService = microCurriculoService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@Validated @RequestBody MicroCurriculoDTO microCurriculoDTO){
        try{
            if(microCurriculoDTO.getCodMicrocurriculo() != null){
                microCurriculoService.save(microCurriculoDTO);
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
    public ResponseEntity<?> update(@RequestBody MicroCurriculoDTO micro){
        try{
            return new ResponseEntity(this.microCurriculoService.update(micro), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/listar")
    public ResponseEntity<List<?>> listar(){
        try{
            return new ResponseEntity(this.microCurriculoService.listar(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/listarporid/{id}")
    public ResponseEntity<?> listarId(@PathVariable("id") Integer id){
        try{
            return new ResponseEntity(this.microCurriculoService.listarPorId(id), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id){
        try{
            this.microCurriculoService.deleteByid(id);
            return new ResponseEntity( HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity( null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
