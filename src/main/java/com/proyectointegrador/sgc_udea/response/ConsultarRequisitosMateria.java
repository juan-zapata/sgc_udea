package com.proyectointegrador.sgc_udea.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ConsultarRequisitosMateria {

    private Long materia;
    private String nombreMateria;
    private String tipoMateria;
    private Integer consecutivoMateria;
    private String nombreBancoElectivas;
    private String tipoRequisito;
}
