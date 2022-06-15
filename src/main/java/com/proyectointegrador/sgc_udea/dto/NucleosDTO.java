package com.proyectointegrador.sgc_udea.dto;

import lombok.Data;

@Data
public class NucleosDTO {
    private Integer idNucleos;
    private String nnombre;
    private String informacion;

    public Integer getIdNucleos() {
        return this.idNucleos;
    }

    public void setIdNucleos(Integer idNucleos) {
        this.idNucleos = idNucleos;
    }

    public String getNnombre() {
        return this.nnombre;
    }

    public void setNnombre(String nnombre) {
        this.nnombre = nnombre;
    }

    public String getInformacion() {
        return this.informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }
}
