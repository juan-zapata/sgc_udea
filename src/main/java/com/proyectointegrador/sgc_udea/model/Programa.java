package com.proyectointegrador.sgc_udea.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "programa")
public class Programa {
    @Id
    @Column(name = "cdprograma")
    private Integer cdprograma;

    @Column(name = "dsnombre")
    private String dsnombre;

    @Column(name = "modalidad")
    private String modalidad;

    @Column(name = "dsdescripcion")
    private String dsdescripcion;

    @Column(name = "area_academica_id_area_academica")
    private Integer areaAcademicaIdAreaAcademica;

    public Integer getCdprograma() {
        return this.cdprograma;
    }

    public void setCdprograma(Integer cdprograma) {
        this.cdprograma = cdprograma;
    }

    public String getDsnombre() {
        return this.dsnombre;
    }

    public void setDsnombre(String dsnombre) {
        this.dsnombre = dsnombre;
    }

    public String getModalidad() {
        return this.modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getDsdescripcion() {
        return this.dsdescripcion;
    }

    public void setDsdescripcion(String dsdescripcion) {
        this.dsdescripcion = dsdescripcion;
    }

    public Integer getAreaAcademicaIdAreaAcademica() {
        return this.areaAcademicaIdAreaAcademica;
    }

    public void setAreaAcademicaIdAreaAcademica(Integer areaAcademicaIdAreaAcademica) {
        this.areaAcademicaIdAreaAcademica = areaAcademicaIdAreaAcademica;
    }
}
