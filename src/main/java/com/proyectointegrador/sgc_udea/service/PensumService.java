package com.proyectointegrador.sgc_udea.service;

import com.proyectointegrador.sgc_udea.model.Nucleos;
import com.proyectointegrador.sgc_udea.model.Pensum;
import com.proyectointegrador.sgc_udea.repository.PensumRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PensumService {


    private final PensumRepository pensumRepository;

    public PensumService(PensumRepository pensumRepository) {
        this.pensumRepository = pensumRepository;
    }

    @Transactional
    public void save(Pensum pensum){
        pensumRepository.save(pensum);
    }

    public Pensum update(Pensum pensum){
        Pensum pensumUpdate = pensumRepository.findById(pensum.getCdpensum()).get();
        pensumUpdate.setCohorteinicial(pensum.getCohorteinicial());
        pensumUpdate.setCohortefinal(pensum.getCohortefinal());
        pensumUpdate.setProgramaCdprograma(pensum.getProgramaCdprograma());
        return pensumRepository.save(pensumUpdate);
    }

    public void delete(String cdPensum){
        pensumRepository.delete(pensumRepository.getReferenceById(cdPensum));
    }

    public Optional<Pensum> getById(String cdPensum){
        return pensumRepository.findById(cdPensum);
    }

    public List<Pensum> getAll(){
        return pensumRepository.findAll();
    }
}
