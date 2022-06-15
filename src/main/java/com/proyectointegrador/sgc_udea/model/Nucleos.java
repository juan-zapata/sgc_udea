package com.proyectointegrador.sgc_udea.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "nucleos")
public class Nucleos {
    @Id
    @Column(name = "idNucleos")
    private Integer idNucleos;

    @Column(name = "Nnombre")
    private String nnombre;

    @Column(name = "informacion")
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
