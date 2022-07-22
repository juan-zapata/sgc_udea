package com.proyectointegrador.sgc_udea.service;

import com.proyectointegrador.sgc_udea.model.Materia;
import com.proyectointegrador.sgc_udea.model.Persona;
import com.proyectointegrador.sgc_udea.repository.PersonaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

    private final PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public Persona save(Persona persona){
        return personaRepository.save(persona);
    }

    public Persona update(Persona persona){
        Persona personaUpdate = personaRepository.findById(persona.getNumeroId()).get();
        personaUpdate.setNombre(persona.getNombre());
        personaUpdate.setApellido(persona.getApellido());
        return personaRepository.save(personaUpdate);
    }

    public void delete(Integer numeroId){
        personaRepository.delete(personaRepository.getReferenceById(numeroId));
    }

    public Optional<Persona> getById(Integer numeroId){
        return personaRepository.findById(numeroId);
    }

    public List<Persona> getAll(){
        return personaRepository.findAll();
    }




}
