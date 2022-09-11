package com.proyectointegrador.sgc_udea.dto;

import lombok.*;

import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NucleosDTO {
    private Integer idNucleos;
    private String nnombre;
    private String informacion;
}
