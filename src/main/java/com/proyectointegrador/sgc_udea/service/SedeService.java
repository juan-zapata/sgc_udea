package com.proyectointegrador.sgc_udea.service;

import com.proyectointegrador.sgc_udea.model.Persona;
import com.proyectointegrador.sgc_udea.model.Sede;
import com.proyectointegrador.sgc_udea.repository.SedeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SedeService {

    private final SedeRepository sedeRepository;

    public SedeService(SedeRepository sedeRepository) {
        this.sedeRepository = sedeRepository;
    }

    public Sede save(Sede persona){
        return sedeRepository.save(persona);
    }

    public Sede update(Sede sede){
        Sede sedeUpdate = sedeRepository.findById(sede.getIdSede()).get();
        sedeUpdate.setNombreSede(sede.getNombreSede());
        return sedeRepository.save(sedeUpdate);
    }

    public void delete(Integer sedeId){
        sedeRepository.delete(sedeRepository.getReferenceById(sedeId));
    }

    public Optional<Sede> getById(Integer sedeId){
        return sedeRepository.findById(sedeId);
    }

    public List<Sede> getAll(){
        return sedeRepository.findAll();
    }
}
