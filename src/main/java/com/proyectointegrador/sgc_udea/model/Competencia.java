package com.proyectointegrador.sgc_udea.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "competencia")
public class Competencia {
    @Id
    @Column(name = "id_competencia")
    private Integer idCompetencia;

    @Column(name = "det_competencia")
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
