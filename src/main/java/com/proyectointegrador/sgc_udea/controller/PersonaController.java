package com.proyectointegrador.sgc_udea.controller;


import com.proyectointegrador.sgc_udea.dto.AreaConocimientoDTO;
import com.proyectointegrador.sgc_udea.dto.PersonaDTO;
import com.proyectointegrador.sgc_udea.model.AreaConocimiento;
import com.proyectointegrador.sgc_udea.model.Persona;
import com.proyectointegrador.sgc_udea.service.PersonaService;
import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {


    private final PersonaService personaService;


    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@Validated @RequestBody PersonaDTO personaDTO){
        try{
            Persona persona = new Persona(personaDTO.getNumeroId(), personaDTO.getNombre(), personaDTO.getApellido());
            if(persona.getNumeroId() != null && persona.getNumeroId() != null &&
            persona.getApellido() != null){
                personaService.save(persona);
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
    public ResponseEntity<?> update(@RequestBody PersonaDTO personaDTO){
        Persona persona = new Persona(personaDTO.getNumeroId(), personaDTO.getNombre(), personaDTO.getApellido());
        return new ResponseEntity(personaService.update(persona),HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Integer id){
        personaService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/retornar-persona/{id}")
    public ResponseEntity<Persona> getById(@PathVariable(value = "id") Integer id){
        return new ResponseEntity(personaService.getById(id),HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Persona>> getAll(){
        try{
            List<Persona> personas = personaService.getAll();
            if(!personas.isEmpty()){
                return new ResponseEntity(personas, HttpStatus.OK);
            }
        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity(HttpStatus.OK);
    }


}
