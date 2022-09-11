package com.proyectointegrador.sgc_udea.service;

import com.proyectointegrador.sgc_udea.dto.ElementoEvaluadorDTO;
import com.proyectointegrador.sgc_udea.dto.ResultadoDTO;
import com.proyectointegrador.sgc_udea.model.ElementoEvaluador;
import com.proyectointegrador.sgc_udea.model.Resultado;
import com.proyectointegrador.sgc_udea.repository.ResultadoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResultadoService {

    private final ResultadoRepository resultadoRepository;


    public ResultadoService(ResultadoRepository resultadoRepository) {
        this.resultadoRepository = resultadoRepository;
    }

    public Resultado save(ResultadoDTO elemen){
        ModelMapper mm = new ModelMapper();
        return resultadoRepository.save(mm.map(elemen, Resultado.class));
    }

    public Resultado update(ResultadoDTO micro){
        ModelMapper mm = new ModelMapper();
        return resultadoRepository.save(mm.map(micro, Resultado.class));
    }

    public List<Resultado> listar(){
        return resultadoRepository.findAll();
    }

    public Resultado listarPorId(Integer id){
        Optional<Resultado> elemento = resultadoRepository.findById(id);
        if(elemento.isPresent()){
            return elemento.get();
        }else{
            return new Resultado();
        }
    }

    public void deleteByid(Integer id){
        this.resultadoRepository.deleteById(id);
    }
}
