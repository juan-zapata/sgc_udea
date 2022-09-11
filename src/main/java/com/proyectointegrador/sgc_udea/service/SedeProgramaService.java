package com.proyectointegrador.sgc_udea.service;

import com.proyectointegrador.sgc_udea.dto.BibliografiaDTO;
import com.proyectointegrador.sgc_udea.dto.SedeProgramaDTO;
import com.proyectointegrador.sgc_udea.model.Bibliografia;
import com.proyectointegrador.sgc_udea.model.SedePrograma;
import com.proyectointegrador.sgc_udea.repository.SedeProgramaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SedeProgramaService {

    private final SedeProgramaRepository sedeProgramaRepository;

    public SedeProgramaService(SedeProgramaRepository sedeProgramaRepository) {
        this.sedeProgramaRepository = sedeProgramaRepository;
    }

    public SedePrograma save(SedeProgramaDTO elemen){
        ModelMapper mm = new ModelMapper();
        return sedeProgramaRepository.save(mm.map(elemen, SedePrograma.class));
    }

    public SedePrograma update(SedeProgramaDTO micro){
        ModelMapper mm = new ModelMapper();
        return sedeProgramaRepository.save(mm.map(micro, SedePrograma.class));
    }

    public List<SedePrograma> listar(){
        return sedeProgramaRepository.findAll();
    }

    public SedePrograma listarPorId(Long id){
        Optional<SedePrograma> elemento = sedeProgramaRepository.findById(id);
        if(elemento.isPresent()){
            return elemento.get();
        }else{
            return new SedePrograma();
        }
    }

    public void deleteByid(Long id){
        this.sedeProgramaRepository.deleteById(id);
    }
}
