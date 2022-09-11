package com.proyectointegrador.sgc_udea.service;

import com.proyectointegrador.sgc_udea.dto.BibliografiaDTO;
import com.proyectointegrador.sgc_udea.model.Bibliografia;
import com.proyectointegrador.sgc_udea.repository.BibliografiaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BibliografiaService {

    private final BibliografiaRepository bibliografiaRepository;

    public BibliografiaService(BibliografiaRepository bibliografiaRepository) {
        this.bibliografiaRepository = bibliografiaRepository;
    }

    public Bibliografia save(BibliografiaDTO elemen){
        ModelMapper mm = new ModelMapper();
        return bibliografiaRepository.save(mm.map(elemen, Bibliografia.class));
    }

    public Bibliografia update(BibliografiaDTO micro){
        ModelMapper mm = new ModelMapper();
        return bibliografiaRepository.save(mm.map(micro, Bibliografia.class));
    }

    public List<Bibliografia> listar(){
        return bibliografiaRepository.findAll();
    }

    public Bibliografia listarPorId(Integer id){
        Optional<Bibliografia> elemento = bibliografiaRepository.findById(id);
        if(elemento.isPresent()){
            return elemento.get();
        }else{
            return new Bibliografia();
        }
    }

    public void deleteByid(Integer id){
        this.bibliografiaRepository.deleteById(id);
    }
}
