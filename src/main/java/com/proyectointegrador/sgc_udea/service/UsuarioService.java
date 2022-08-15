package com.proyectointegrador.sgc_udea.service;

import com.proyectointegrador.sgc_udea.model.AreaAcademica;
import com.proyectointegrador.sgc_udea.model.Usuario;
import com.proyectointegrador.sgc_udea.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Transactional
    public void save(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public void delete(Integer numeroId){
        usuarioRepository.delete(usuarioRepository.getReferenceById(numeroId));
    }

    public Optional<Usuario> getById(Integer numeroId){
        return usuarioRepository.findById(numeroId);
    }

    public List<Usuario> getAll(){
        return usuarioRepository.findAll();
    }
}
