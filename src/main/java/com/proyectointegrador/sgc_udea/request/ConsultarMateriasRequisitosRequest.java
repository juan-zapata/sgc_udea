package com.proyectointegrador.sgc_udea.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ConsultarMateriasRequisitosRequest {

    private String facultad;
    private String version;
    private String programa;
}
