package com.proyectointegrador.sgc_udea.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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

}
