package com.proyectointegrador.sgc_udea.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.proyectointegrador.sgc_udea.dto.NucleosDTO;
import com.proyectointegrador.sgc_udea.model.Nucleos;
import com.proyectointegrador.sgc_udea.service.NucleosService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/nucleos")
public class NucleosController {

    private final NucleosService nucleosService;

    public NucleosController(NucleosService nucleosService) {
        this.nucleosService = nucleosService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@Validated @RequestBody NucleosDTO nucleosDTO) {
        Nucleos nucleos = new Nucleos(nucleosDTO.getIdNucleos(), nucleosDTO.getNnombre(), nucleosDTO.getInformacion());
        nucleosService.save(nucleos);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody NucleosDTO nu) {
        Nucleos nucleos = new Nucleos(nu.getIdNucleos(), nu.getNnombre(), nu.getInformacion());
        return new ResponseEntity(nucleosService.update(nucleos), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Integer id) {
        nucleosService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/retornar-nucleo/{id}")
    public ResponseEntity<?> retornarNucleo(@PathVariable(value = "id") Integer id) {
        return new ResponseEntity(nucleosService.getById(id), HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll() {
        try{
            List<Nucleos> nucleos = nucleosService.getAll();
            if(nucleos.isEmpty()){
                return new ResponseEntity(nucleos, HttpStatus.OK);
            }
        }catch(Exception e){
            System.out.println(e);
            return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity(HttpStatus.OK);
    }

}
