package com.proyectointegrador.sgc_udea.dto;

import lombok.Data;

@Data
public class CompetenciaDTO {
    private Integer idCompetencia;
    private String detCompetencia;

    public Integer getIdCompetencia() {
        return this.idCompetencia;
    }

    public void setIdCompetencia(Integer idCompetencia) {
        this.idCompetencia = idCompetencia;
    }

    public String getDetCompetencia() {
        return this.detCompetencia;
    }

    public void setDetCompetencia(String detCompetencia) {
        this.detCompetencia = detCompetencia;
    }
}
