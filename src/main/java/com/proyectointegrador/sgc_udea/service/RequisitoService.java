package com.proyectointegrador.sgc_udea.service;

import com.proyectointegrador.sgc_udea.dto.ElementoEvaluadorDTO;
import com.proyectointegrador.sgc_udea.dto.RequisitoDTO;
import com.proyectointegrador.sgc_udea.model.ElementoEvaluador;
import com.proyectointegrador.sgc_udea.model.Requisito;
import com.proyectointegrador.sgc_udea.repository.RequisitoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RequisitoService {

    private final RequisitoRepository requisitoRepository;


    public RequisitoService(RequisitoRepository requisitoRepository) {
        this.requisitoRepository = requisitoRepository;
    }
    public Requisito save(RequisitoDTO elemen){
        ModelMapper mm = new ModelMapper();
        return requisitoRepository.save(mm.map(elemen, Requisito.class));
    }

    public Requisito update(RequisitoDTO micro){
        ModelMapper mm = new ModelMapper();
        return requisitoRepository.save(mm.map(micro, Requisito.class));
    }

    public List<Requisito> listar(){
        return requisitoRepository.findAll();
    }

    public Requisito listarPorId(Long id){
        Optional<Requisito> elemento = requisitoRepository.findById(id);
        if(elemento.isPresent()){
            return elemento.get();
        }else{
            return new Requisito();
        }
    }

    public void deleteByid(Long id){
        this.requisitoRepository.deleteById(id);
    }
}
