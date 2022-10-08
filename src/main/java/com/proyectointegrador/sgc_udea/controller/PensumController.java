package com.proyectointegrador.sgc_udea.controller;


import com.proyectointegrador.sgc_udea.dto.PensumDTO;
import com.proyectointegrador.sgc_udea.model.Pensum;
import com.proyectointegrador.sgc_udea.service.PensumService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/pensums")
public class PensumController {


    private final PensumService pensumService;

    public PensumController(PensumService pensumService) {
        this.pensumService = pensumService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@Validated @RequestBody PensumDTO pensumDto) {
        Pensum pensums = new Pensum(pensumDto.getCdpensum(), pensumDto.getCohorteinicial(), pensumDto.getCohortefinal(),pensumDto.getProgramaCdprograma());
        pensumService.save(pensums);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody PensumDTO pensumDto) {
        Pensum pensums = new Pensum(pensumDto.getCdpensum(), pensumDto.getCohorteinicial(), pensumDto.getCohortefinal(),pensumDto.getProgramaCdprograma());
        return new ResponseEntity(pensumService.update(pensums), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") String id) {
        pensumService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/retornar-nucleo/{id}")
    public ResponseEntity<?> retornarNucleo(@PathVariable(value = "id") String id) {
        return new ResponseEntity(pensumService.getById(id), HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll() {
        try{
            List<Pensum> pensums = pensumService.getAll();
            if(pensums.isEmpty()){
                return new ResponseEntity(pensums, HttpStatus.OK);
            }
        }catch(Exception e){
            System.out.println(e);
            return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity(HttpStatus.OK);
    }
}
