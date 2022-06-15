package com.proyectointegrador.sgc_udea.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "competencia_curriculo")
public class CompetenciaCurriculo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "competencia_id_competencia")
    private Integer competenciaIdCompetencia;

    @Column(name = "micro_curriculo_cod_microcurriculo")
    private Integer microCurriculoCodMicrocurriculo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCompetenciaIdCompetencia() {
        return this.competenciaIdCompetencia;
    }

    public void setCompetenciaIdCompetencia(Integer competenciaIdCompetencia) {
        this.competenciaIdCompetencia = competenciaIdCompetencia;
    }

    public Integer getMicroCurriculoCodMicrocurriculo() {
        return this.microCurriculoCodMicrocurriculo;
    }

    public void setMicroCurriculoCodMicrocurriculo(Integer microCurriculoCodMicrocurriculo) {
        this.microCurriculoCodMicrocurriculo = microCurriculoCodMicrocurriculo;
    }
}
