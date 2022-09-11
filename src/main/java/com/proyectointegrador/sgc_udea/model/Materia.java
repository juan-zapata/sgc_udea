package com.proyectointegrador.sgc_udea.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "materia")
@AllArgsConstructor
@NoArgsConstructor
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
}
