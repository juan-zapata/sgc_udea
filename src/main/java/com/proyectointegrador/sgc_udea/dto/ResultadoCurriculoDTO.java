package com.proyectointegrador.sgc_udea.dto;

import lombok.Data;

@Data
public class ResultadoCurriculoDTO {
    private Integer resultadoIdResultado;
    private Integer elementoEvaluadorIdElemento;
    private Integer microCurriculoCodMicrocurriculo;

    public Integer getResultadoIdResultado() {
        return this.resultadoIdResultado;
    }

    public void setResultadoIdResultado(Integer resultadoIdResultado) {
        this.resultadoIdResultado = resultadoIdResultado;
    }

    public Integer getElementoEvaluadorIdElemento() {
        return this.elementoEvaluadorIdElemento;
    }

    public void setElementoEvaluadorIdElemento(Integer elementoEvaluadorIdElemento) {
        this.elementoEvaluadorIdElemento = elementoEvaluadorIdElemento;
    }

    public Integer getMicroCurriculoCodMicrocurriculo() {
        return this.microCurriculoCodMicrocurriculo;
    }

    public void setMicroCurriculoCodMicrocurriculo(Integer microCurriculoCodMicrocurriculo) {
        this.microCurriculoCodMicrocurriculo = microCurriculoCodMicrocurriculo;
    }
}
