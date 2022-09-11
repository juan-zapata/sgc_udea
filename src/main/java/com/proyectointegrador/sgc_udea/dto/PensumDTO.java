package com.proyectointegrador.sgc_udea.dto;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PensumDTO {
    private String cdpensum;
    private Integer cohorteinicial;
    private Integer cohortefinal;
    private Integer programaCdprograma;

}
