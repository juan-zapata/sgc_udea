package com.proyectointegrador.sgc_udea.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
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

}
