package com.proyectointegrador.sgc_udea.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MateriasProgramaVersion {

    private Long programa;
    private String nombrePrograma;
    private Long version;
    private String indicadorVersionActual;
    private Long materia;
    private String nombreMateria;
    private String tipoMateria;
    private Integer consecutivoMateria;
    private String nombreBancoElectivas;
    private Integer nivel;
    private Integer creditos;
    private List<ConsultarRequisitosMateria> requisitos;
}
