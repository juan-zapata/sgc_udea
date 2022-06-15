package com.proyectointegrador.sgc_udea.dto;

import lombok.Data;

@Data
public class PensumDTO {
    private String cdpensum;
    private Integer cohorteinicial;
    private Integer cohortefinal;
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
