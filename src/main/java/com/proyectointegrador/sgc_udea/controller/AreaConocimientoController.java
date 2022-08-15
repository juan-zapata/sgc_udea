package com.proyectointegrador.sgc_udea.controller;

import com.proyectointegrador.sgc_udea.dto.AreaConocimientoDTO;
import com.proyectointegrador.sgc_udea.dto.MateriaDTO;
import com.proyectointegrador.sgc_udea.dto.PersonaDTO;
import com.proyectointegrador.sgc_udea.model.AreaConocimiento;
import com.proyectointegrador.sgc_udea.model.Materia;
import com.proyectointegrador.sgc_udea.model.Persona;
import com.proyectointegrador.sgc_udea.service.AreaConocimientoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/areaconocimiento")
public class AreaConocimientoController {

    private final AreaConocimientoService areaConocimientoService;

    public AreaConocimientoController(AreaConocimientoService areaConocimientoService) {
        this.areaConocimientoService = areaConocimientoService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody AreaConocimientoDTO areaConocimientoDTO){
        AreaConocimiento areaConocimiento = new AreaConocimiento(areaConocimientoDTO.getIdareaConocimiento(),
                areaConocimientoDTO.getAcnombre(), areaConocimientoDTO.getAreainformacion(),
                areaConocimientoDTO.getNucleosIdNucleos());
        areaConocimientoService.save(areaConocimiento);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody AreaConocimientoDTO areaDto){
        AreaConocimiento areaConocimiento = new AreaConocimiento(areaDto.getIdareaConocimiento(), areaDto.getAcnombre(), areaDto.getAreainformacion(),
                areaDto.getNucleosIdNucleos());
        return new ResponseEntity(areaConocimientoService.update(areaConocimiento),HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Integer id){
        areaConocimientoService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/retornar-areaconocimiento/{id}")
    public ResponseEntity<AreaConocimiento> getById(@PathVariable(value = "id") Integer id){
        return new ResponseEntity(areaConocimientoService.getById(id),HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<AreaConocimiento>> getAll(){
        try{
            List<AreaConocimiento> areas = areaConocimientoService.getAll();
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
