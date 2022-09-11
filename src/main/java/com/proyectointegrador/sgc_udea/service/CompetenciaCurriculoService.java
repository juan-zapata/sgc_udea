package com.proyectointegrador.sgc_udea.service;

import com.proyectointegrador.sgc_udea.dto.CompetenciaCurriculoDTO;
import com.proyectointegrador.sgc_udea.dto.ElementoEvaluadorDTO;
import com.proyectointegrador.sgc_udea.model.CompetenciaCurriculo;
import com.proyectointegrador.sgc_udea.model.ElementoEvaluador;
import com.proyectointegrador.sgc_udea.repository.CompetenciaCurriculoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CompetenciaCurriculoService {

    private final CompetenciaCurriculoRepository competenciaCurriculoRepository;

    public CompetenciaCurriculoService(CompetenciaCurriculoRepository competenciaCurriculoRepository) {
        this.competenciaCurriculoRepository = competenciaCurriculoRepository;
    }

    @Transactional
    public CompetenciaCurriculo save(CompetenciaCurriculoDTO competenciaCurriculo){
        ModelMapper mm = new ModelMapper();
        return this.competenciaCurriculoRepository.saveAndFlush(mm.map(competenciaCurriculo, CompetenciaCurriculo.class));
    }
    public CompetenciaCurriculo update(CompetenciaCurriculoDTO micro){
        ModelMapper mm = new ModelMapper();
        return competenciaCurriculoRepository.save(mm.map(micro, CompetenciaCurriculo.class));
    }

    public List<CompetenciaCurriculo> listar(){
        return competenciaCurriculoRepository.findAll();
    }

    public CompetenciaCurriculo listarPorId(Long id){
        Optional<CompetenciaCurriculo> elemento = competenciaCurriculoRepository.findById(id);
        if(elemento.isPresent()){
            return elemento.get();
        }else{
            return new CompetenciaCurriculo();
        }
    }

    public void deleteByid(Long id){
        this.competenciaCurriculoRepository.deleteById(id);
    }
}
