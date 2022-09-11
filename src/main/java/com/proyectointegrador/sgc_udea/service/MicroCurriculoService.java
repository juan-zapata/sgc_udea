package com.proyectointegrador.sgc_udea.service;

import com.proyectointegrador.sgc_udea.dto.MicroCurriculoDTO;
import com.proyectointegrador.sgc_udea.model.MicroCurriculo;
import com.proyectointegrador.sgc_udea.repository.MicroCurriculoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MicroCurriculoService {

    private final MicroCurriculoRepository microCurriculoRepository;

    public MicroCurriculoService(MicroCurriculoRepository microCurriculoRepository) {
        this.microCurriculoRepository = microCurriculoRepository;
    }

    public MicroCurriculo save(MicroCurriculoDTO micro){
        ModelMapper mm = new ModelMapper();
        return microCurriculoRepository.save(mm.map(micro, MicroCurriculo.class));
    }

    public MicroCurriculo update(MicroCurriculoDTO micro){
        ModelMapper mm = new ModelMapper();
        return microCurriculoRepository.save(mm.map(micro, MicroCurriculo.class));
    }

    public List<MicroCurriculo> listar(){
        return microCurriculoRepository.findAll();
    }

    public MicroCurriculo listarPorId(Integer id){
        Optional<MicroCurriculo> elemento = microCurriculoRepository.findById(id);
        return elemento.orElseGet(MicroCurriculo::new);
    }

    public void deleteByid(Integer id){
        this.microCurriculoRepository.deleteById(id);
    }
}
