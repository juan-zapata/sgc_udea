package com.proyectointegrador.sgc_udea.service;

import com.proyectointegrador.sgc_udea.dto.RolDTO;
import com.proyectointegrador.sgc_udea.model.Rol;
import com.proyectointegrador.sgc_udea.repository.RolRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolService {

    private final RolRepository rolRepository;

    public RolService(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    public Rol save(RolDTO elemen){
        ModelMapper mm = new ModelMapper();
        return rolRepository.save(mm.map(elemen, Rol.class));
    }

    public Rol update(RolDTO micro){
        ModelMapper mm = new ModelMapper();
        return rolRepository.save(mm.map(micro, Rol.class));
    }

    public List<Rol> listar(){
        return rolRepository.findAll();
    }

    public Rol listarPorId(Integer id){
        Optional<Rol> elemento = rolRepository.findById(id);
        if(elemento.isPresent()){
            return elemento.get();
        }else{
            return new Rol();
        }
    }

    public void deleteByid(Integer id){
        this.rolRepository.deleteById(id);
    }
}
