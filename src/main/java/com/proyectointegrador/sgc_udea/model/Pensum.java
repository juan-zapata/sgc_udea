package com.proyectointegrador.sgc_udea.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "pensum")
public class Pensum {
    @Id
    @Column(name = "cdpensum")
    private String cdpensum;

    @Column(name = "cohorteinicial")
    private Integer cohorteinicial;

    @Column(name = "cohortefinal")
    private Integer cohortefinal;

    @Column(name = "programa_cdprograma")
    private Integer programaCdprograma;

    public String getCdpensum() {
        return this.cdpensum;
    }

    public void setCdpensum(String cdpensum) {
        this.cdpensum = cdpensum;
    }

    public Integer getCohorteinicial() {
        return this.cohorteinicial;
    }

    public void setCohorteinicial(Integer cohorteinicial) {
        this.cohorteinicial = cohorteinicial;
    }

    public Integer getCohortefinal() {
        return this.cohortefinal;
    }

    public void setCohortefinal(Integer cohortefinal) {
        this.cohortefinal = cohortefinal;
    }

    public Integer getProgramaCdprograma() {
        return this.programaCdprograma;
    }

    public void setProgramaCdprograma(Integer programaCdprograma) {
        this.programaCdprograma = programaCdprograma;
    }
}
