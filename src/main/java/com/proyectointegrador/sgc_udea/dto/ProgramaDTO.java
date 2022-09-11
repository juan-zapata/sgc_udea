package com.proyectointegrador.sgc_udea.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProgramaDTO {
    private Integer cdprograma;
    private String dsnombre;
    private String modalidad;
    private String dsdescripcion;
    private Integer areaAcademicaIdAreaAcademica;

}
