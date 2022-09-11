package com.proyectointegrador.sgc_udea.service;

import com.proyectointegrador.sgc_udea.dto.ElementoEvaluadorDTO;
import com.proyectointegrador.sgc_udea.dto.ProgramaDTO;
import com.proyectointegrador.sgc_udea.model.ElementoEvaluador;
import com.proyectointegrador.sgc_udea.model.Programa;
import com.proyectointegrador.sgc_udea.repository.ProgramaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProgramaService {

    private final ProgramaRepository programaRepository;

    public ProgramaService(ProgramaRepository programaRepository) {
        this.programaRepository = programaRepository;
    }

    public Programa save(ProgramaDTO elemen){
        ModelMapper mm = new ModelMapper();
        return programaRepository.save(mm.map(elemen, Programa.class));
    }

    public Programa update(ProgramaDTO micro){
        ModelMapper mm = new ModelMapper();
        return programaRepository.save(mm.map(micro, Programa.class));
    }

    public List<Programa> listar(){
        return programaRepository.findAll();
    }

    public Programa listarPorId(Integer id){
        Optional<Programa> elemento = programaRepository.findById(id);
        if(elemento.isPresent()){
            return elemento.get();
        }else{
            return new Programa();
        }
    }

    public void deleteByid(Integer id){
        this.programaRepository.deleteById(id);
    }
}
