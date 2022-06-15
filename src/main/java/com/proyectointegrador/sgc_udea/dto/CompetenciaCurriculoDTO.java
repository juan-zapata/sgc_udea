package com.proyectointegrador.sgc_udea.dto;

import lombok.Data;

@Data
public class CompetenciaCurriculoDTO {
    private Integer competenciaIdCompetencia;
    private Integer microCurriculoCodMicrocurriculo;

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
