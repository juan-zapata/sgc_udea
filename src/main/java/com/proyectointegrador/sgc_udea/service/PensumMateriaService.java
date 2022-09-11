package com.proyectointegrador.sgc_udea.service;

import com.proyectointegrador.sgc_udea.dto.PensumMateriaDTO;
import com.proyectointegrador.sgc_udea.model.PensumMateria;
import com.proyectointegrador.sgc_udea.repository.PensumMateriaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PensumMateriaService {

    private final PensumMateriaRepository pensumMateriaRepository;

    public PensumMateriaService(PensumMateriaRepository pensumMateriaRepository) {
        this.pensumMateriaRepository = pensumMateriaRepository;
    }

    public PensumMateria save(PensumMateriaDTO elemen){
        ModelMapper mm = new ModelMapper();
        return pensumMateriaRepository.save(mm.map(elemen, PensumMateria.class));
    }

    public PensumMateria update(PensumMateriaDTO micro){
        ModelMapper mm = new ModelMapper();
        return pensumMateriaRepository.save(mm.map(micro, PensumMateria.class));
    }

    public List<PensumMateria> listar(){
        return pensumMateriaRepository.findAll();
    }

    public PensumMateria listarPorId(Long id){
        Optional<PensumMateria> elemento = pensumMateriaRepository.findById(id);
        if(elemento.isPresent()){
            return elemento.get();
        }else{
            return new PensumMateria();
        }
    }

    public void deleteByid(Long id){
        this.pensumMateriaRepository.deleteById(id);
    }
}
