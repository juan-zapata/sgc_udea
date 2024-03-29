package com.proyectointegrador.sgc_udea.controller;

import co.edu.udea.exception.OrgSistemasSecurityException;
import co.edu.udea.wsClient.dto.OrgSistemasWSRequest;
import com.proyectointegrador.sgc_udea.dto.MicroCurriculoDTO;
import com.proyectointegrador.sgc_udea.request.ConsultarMateriasRequisitosRequest;
import com.proyectointegrador.sgc_udea.response.ConsultarRequisitosMateria;
import com.proyectointegrador.sgc_udea.response.MateriasProgramaVersion;
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
            return new ResponseEntity(microCurriculoService.save(microCurriculoDTO),HttpStatus.CREATED);
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

    @ResponseBody
    @PostMapping("/listar/requisitosmateria")
    public ResponseEntity<List<MateriasProgramaVersion>> listarRequisitosMateria(@RequestBody ConsultarMateriasRequisitosRequest consulta){
        try{
            return new ResponseEntity<>(this.microCurriculoService.consultarRequisitosMateria(consulta), HttpStatus.OK);
        }catch (Exception | OrgSistemasSecurityException e){
            return new ResponseEntity<>( null, HttpStatus.INTERNAL_SERVER_ERROR);
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
