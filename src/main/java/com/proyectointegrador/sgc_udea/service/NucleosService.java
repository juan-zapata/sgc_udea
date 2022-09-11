package com.proyectointegrador.sgc_udea.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectointegrador.sgc_udea.model.Nucleos;
import com.proyectointegrador.sgc_udea.repository.NucleosRepository;

@Service
public class NucleosService {
    
    private final NucleosRepository nucleosRepository;

    public NucleosService(NucleosRepository nucleosRepository) {
        this.nucleosRepository = nucleosRepository;
    }

    @Transactional
    public void save(Nucleos nucleos){
        this.nucleosRepository.saveAndFlush(nucleos);
    }

    public Nucleos update(Nucleos nucleos){
        Nucleos nucleosUpdate = nucleosRepository.findById(nucleos.getIdNucleos()).get();
        nucleosUpdate.setNnombre(nucleos.getNnombre());
        nucleosUpdate.setInformacion(nucleos.getInformacion());
        return nucleosRepository.save(nucleosUpdate);
    }

    public void delete(Integer numeroId){
        nucleosRepository.delete(nucleosRepository.getReferenceById(numeroId));
    }

    public Optional<Nucleos> getById(Integer numeroId){
        return nucleosRepository.findById(numeroId);
    }

    public List<Nucleos> getAll(){
        return nucleosRepository.findAll();
    }

}
