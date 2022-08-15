package com.proyectointegrador.sgc_udea.controller;

import com.proyectointegrador.sgc_udea.dto.UsuarioDTO;
import com.proyectointegrador.sgc_udea.model.Usuario;
import com.proyectointegrador.sgc_udea.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {


    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody UsuarioDTO usuarioDTO){
        Usuario usario = new Usuario(usuarioDTO.getIdUsuario());
        usuarioService.save(usario);
        return new ResponseEntity(HttpStatus.CREATED);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Integer id){
        usuarioService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/retornar-usuario/{id}")
    public ResponseEntity<Usuario> getById(@PathVariable(value = "id") Integer id){
        return new ResponseEntity(usuarioService.getById(id),HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Usuario>> getAll(){
        try{
            List<Usuario> usuarios = usuarioService.getAll();
            if(!usuarios.isEmpty()){
                return new ResponseEntity(usuarios, HttpStatus.OK);
            }
        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity(HttpStatus.OK);
    }
}
