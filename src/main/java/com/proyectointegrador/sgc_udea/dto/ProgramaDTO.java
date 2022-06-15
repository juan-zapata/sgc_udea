package com.proyectointegrador.sgc_udea.dto;

import lombok.Data;

@Data
public class ProgramaDTO {
    private Integer cdprograma;
    private String dsnombre;
    private String modalidad;
    private String dsdescripcion;
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
