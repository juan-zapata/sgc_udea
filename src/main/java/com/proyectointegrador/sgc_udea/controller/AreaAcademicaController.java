package com.proyectointegrador.sgc_udea.controller;


import com.proyectointegrador.sgc_udea.dto.AreaAcademicaDTO;
import com.proyectointegrador.sgc_udea.model.AreaAcademica;
import com.proyectointegrador.sgc_udea.model.AreaConocimiento;
import com.proyectointegrador.sgc_udea.service.AreaAcademicaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/areaacademica")
public class AreaAcademicaController {

    private final AreaAcademicaService areaAcademicaService;

    public AreaAcademicaController(AreaAcademicaService areaAcademicaService) {
        this.areaAcademicaService = areaAcademicaService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody AreaAcademicaDTO areaAcademicaDTO){
        AreaAcademica areaAcademica = new AreaAcademica(areaAcademicaDTO.getIdAreaAcademica(),
                areaAcademicaDTO.getNombreAreaAcademica());
        areaAcademicaService.save(areaAcademica);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody AreaAcademicaDTO areaDto){
        AreaAcademica areaAcademica = new AreaAcademica(areaDto.getIdAreaAcademica(), areaDto.getNombreAreaAcademica());
        return new ResponseEntity(areaAcademicaService.update(areaAcademica),HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Integer id){
        areaAcademicaService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/retornar-areaconocimiento/{id}")
    public ResponseEntity<AreaAcademica> getById(@PathVariable(value = "id") Integer id){
        return new ResponseEntity(areaAcademicaService.getById(id),HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<AreaConocimiento>> getAll(){
        try{
            List<AreaAcademica> areas = areaAcademicaService.getAll();
            if(!areas.isEmpty()){
                return new ResponseEntity(areas, HttpStatus.OK);
            }
        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity(HttpStatus.OK);
    }
}
