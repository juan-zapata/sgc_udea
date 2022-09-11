package com.proyectointegrador.sgc_udea.service;

import com.proyectointegrador.sgc_udea.dto.ElementoEvaluadorDTO;
import com.proyectointegrador.sgc_udea.dto.MicroCurriculoDTO;
import com.proyectointegrador.sgc_udea.model.ElementoEvaluador;
import com.proyectointegrador.sgc_udea.model.MicroCurriculo;
import com.proyectointegrador.sgc_udea.repository.ElementoEvaluadorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.crypto.spec.OAEPParameterSpec;
import java.util.List;
import java.util.Optional;

@Service
public class ElementoEvaluadorService {

    private final ElementoEvaluadorRepository elementoEvaluadorRepository;

    public ElementoEvaluadorService(ElementoEvaluadorRepository elementoEvaluadorRepository) {
        this.elementoEvaluadorRepository = elementoEvaluadorRepository;
    }

    public ElementoEvaluador save(ElementoEvaluadorDTO elemen){
        ModelMapper mm = new ModelMapper();
        return elementoEvaluadorRepository.save(mm.map(elemen, ElementoEvaluador.class));
    }

    public ElementoEvaluador update(ElementoEvaluadorDTO micro){
        ModelMapper mm = new ModelMapper();
        return elementoEvaluadorRepository.save(mm.map(micro, ElementoEvaluador.class));
    }

    public List<ElementoEvaluador> listar(){
        return elementoEvaluadorRepository.findAll();
    }

    public ElementoEvaluador listarPorId(Integer id){
        Optional<ElementoEvaluador> elemento = elementoEvaluadorRepository.findById(id);
        if(elemento.isPresent()){
            return elemento.get();
        }else{
            return new ElementoEvaluador();
        }
    }

    public void deleteByid(Integer id){
        this.elementoEvaluadorRepository.deleteById(id);
    }
}
