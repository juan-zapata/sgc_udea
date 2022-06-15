package com.proyectointegrador.sgc_udea.dto;

import lombok.Data;

@Data
public class MateriaDTO {
    private Integer cdmateria;
    private String dsnombre;
    private String tipocurso;
    private String microcurriculom;
    private String horasteoricas;
    private String horaspracticas;
    private String nivel;
    private Byte clasificable;
    private Byte validable;
    private String horasteoricopracticas;
    private String creditos;
    private String responsable;
    private Integer areaConocimientoIdareaConocimiento;

    public Integer getCdmateria() {
        return this.cdmateria;
    }

    public void setCdmateria(Integer cdmateria) {
        this.cdmateria = cdmateria;
    }

    public String getDsnombre() {
        return this.dsnombre;
    }

    public void setDsnombre(String dsnombre) {
        this.dsnombre = dsnombre;
    }

    public String getTipocurso() {
        return this.tipocurso;
    }

    public void setTipocurso(String tipocurso) {
        this.tipocurso = tipocurso;
    }

    public String getMicrocurriculom() {
        return this.microcurriculom;
    }

    public void setMicrocurriculom(String microcurriculom) {
        this.microcurriculom = microcurriculom;
    }

    public String getHorasteoricas() {
        return this.horasteoricas;
    }

    public void setHorasteoricas(String horasteoricas) {
        this.horasteoricas = horasteoricas;
    }

    public String getHoraspracticas() {
        return this.horaspracticas;
    }

    public void setHoraspracticas(String horaspracticas) {
        this.horaspracticas = horaspracticas;
    }

    public String getNivel() {
        return this.nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Byte getClasificable() {
        return this.clasificable;
    }

    public void setClasificable(Byte clasificable) {
        this.clasificable = clasificable;
    }

    public Byte getValidable() {
        return this.validable;
    }

    public void setValidable(Byte validable) {
        this.validable = validable;
    }

    public String getHorasteoricopracticas() {
        return this.horasteoricopracticas;
    }

    public void setHorasteoricopracticas(String horasteoricopracticas) {
        this.horasteoricopracticas = horasteoricopracticas;
    }

    public String getCreditos() {
        return this.creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getResponsable() {
        return this.responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public Integer getAreaConocimientoIdareaConocimiento() {
        return this.areaConocimientoIdareaConocimiento;
    }

    public void setAreaConocimientoIdareaConocimiento(Integer areaConocimientoIdareaConocimiento) {
        this.areaConocimientoIdareaConocimiento = areaConocimientoIdareaConocimiento;
    }
}
