package com.proyectointegrador.sgc_udea.controller;


import com.proyectointegrador.sgc_udea.dto.PersonaDTO;
import com.proyectointegrador.sgc_udea.dto.SedeDTO;
import com.proyectointegrador.sgc_udea.model.Persona;
import com.proyectointegrador.sgc_udea.model.Sede;
import com.proyectointegrador.sgc_udea.service.SedeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/sedes")
public class SedeController {


    private final SedeService sedeService;

    public SedeController(SedeService sedeService) {
        this.sedeService = sedeService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@Validated @RequestBody SedeDTO sedeDTO){
        try{
            Sede sede = new Sede(sedeDTO.getIdSede(), sedeDTO.getNombreSede());
            if(sede.getIdSede() != null  &&
                    sede.getNombreSede() != null){
                sedeService.save(sede);
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
    public ResponseEntity<?> update(@RequestBody SedeDTO sedeDTO){
        Sede sede = new Sede(sedeDTO.getIdSede(), sedeDTO.getNombreSede());
        return new ResponseEntity(sedeService.update(sede),HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Integer id){
        sedeService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/retornar-persona/{id}")
    public ResponseEntity<Persona> getById(@PathVariable(value = "id") Integer id){
        return new ResponseEntity(sedeService.getById(id),HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Persona>> getAll(){
        try{
            List<Sede> sedes = sedeService.getAll();
            if(!sedes.isEmpty()){
                return new ResponseEntity(sedes, HttpStatus.OK);
            }
        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity(HttpStatus.OK);
    }
}
