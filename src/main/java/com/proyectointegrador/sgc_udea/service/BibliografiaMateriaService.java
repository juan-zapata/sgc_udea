package com.proyectointegrador.sgc_udea.service;


import com.proyectointegrador.sgc_udea.dto.BibliografiaMateriaDTO;
import com.proyectointegrador.sgc_udea.model.BibliografiaMateria;
import com.proyectointegrador.sgc_udea.repository.BibliografiaMateriaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BibliografiaMateriaService {

    private final BibliografiaMateriaRepository bibliografiaRepository;

    public BibliografiaMateriaService(BibliografiaMateriaRepository bibliografiaRepository) {
        this.bibliografiaRepository = bibliografiaRepository;
    }


    public BibliografiaMateria save(BibliografiaMateriaDTO elemen){
        ModelMapper mm = new ModelMapper();
        return bibliografiaRepository.save(mm.map(elemen, BibliografiaMateria.class));
    }

    public BibliografiaMateria update(BibliografiaMateriaDTO micro){
        ModelMapper mm = new ModelMapper();
        return bibliografiaRepository.save(mm.map(micro, BibliografiaMateria.class));
    }

    public List<BibliografiaMateria> listar(){
        return bibliografiaRepository.findAll();
    }

    public BibliografiaMateria listarPorId(Long id){
        Optional<BibliografiaMateria> elemento = bibliografiaRepository.findById(id);
        if(elemento.isPresent()){
            return elemento.get();
        }else{
            return new BibliografiaMateria();
        }
    }

    public void deleteByid(Long id){
        this.bibliografiaRepository.deleteById(id);
    }
}
