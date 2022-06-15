package com.proyectointegrador.sgc_udea.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "resultado_curriculo")
public class ResultadoCurriculo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "resultado_id_resultado")
    private Integer resultadoIdResultado;

    @Column(name = "elemento_evaluador_id_elemento")
    private Integer elementoEvaluadorIdElemento;

    @Column(name = "micro_curriculo_cod_microcurriculo")
    private Integer microCurriculoCodMicrocurriculo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
