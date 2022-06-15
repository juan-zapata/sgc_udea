package com.proyectointegrador.sgc_udea.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "materia")
public class Materia {
    @Id
    @Column(name = "cdmateria")
    private Integer cdmateria;

    @Column(name = "dsnombre")
    private String dsnombre;

    @Column(name = "tipocurso")
    private String tipocurso;

    @Column(name = "microcurriculom")
    private String microcurriculom;

    @Column(name = "horasteoricas")
    private String horasteoricas;

    @Column(name = "horaspracticas")
    private String horaspracticas;

    @Column(name = "nivel")
    private String nivel;

    @Column(name = "clasificable")
    private Byte clasificable;

    @Column(name = "validable")
    private Byte validable;

    @Column(name = "horasteoricopracticas")
    private String horasteoricopracticas;

    @Column(name = "creditos")
    private String creditos;

    @Column(name = "responsable")
    private String responsable;

    @Column(name = "area_conocimiento_idarea_conocimiento")
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
