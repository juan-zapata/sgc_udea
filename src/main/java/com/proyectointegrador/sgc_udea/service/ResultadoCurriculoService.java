package com.proyectointegrador.sgc_udea.service;

import com.proyectointegrador.sgc_udea.dto.BibliografiaDTO;
import com.proyectointegrador.sgc_udea.dto.ResultadoCurriculoDTO;
import com.proyectointegrador.sgc_udea.model.Bibliografia;
import com.proyectointegrador.sgc_udea.model.ResultadoCurriculo;
import com.proyectointegrador.sgc_udea.repository.ResultadoCurriculoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResultadoCurriculoService {

    private final ResultadoCurriculoRepository resultadoCurriculoRepository;

    public ResultadoCurriculoService(ResultadoCurriculoRepository resultadoCurriculoRepository) {
        this.resultadoCurriculoRepository = resultadoCurriculoRepository;
    }

    public ResultadoCurriculo save(ResultadoCurriculoDTO elemen){
        ModelMapper mm = new ModelMapper();
        return resultadoCurriculoRepository.save(mm.map(elemen, ResultadoCurriculo.class));
    }

    public ResultadoCurriculo update(ResultadoCurriculoDTO micro){
        ModelMapper mm = new ModelMapper();
        return resultadoCurriculoRepository.save(mm.map(micro, ResultadoCurriculo.class));
    }

    public List<ResultadoCurriculo> listar(){
        return resultadoCurriculoRepository.findAll();
    }

    public ResultadoCurriculo listarPorId(Long id){
        Optional<ResultadoCurriculo> elemento = resultadoCurriculoRepository.findById(id);
        if(elemento.isPresent()){
            return elemento.get();
        }else{
            return new ResultadoCurriculo();
        }
    }

    public void deleteByid(Long id){
        this.resultadoCurriculoRepository.deleteById(id);
    }
}
