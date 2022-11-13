package com.proyectointegrador.sgc_udea.dto;

import lombok.*;

import javax.persistence.Basic;
import javax.persistence.Column;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MicroCurriculoDTO {

    private int codMicrocurriculo;
    private Integer idMateria;
    private String resultadoaprendizaje;
    private String tipoContenido;
    private String cproposito;
    private String cjustificacion;
    private String cobjetivoGeneral;
    private String cContenido;
    private String cMetodologia;
    private int elaboro;
    private String unidadAcademica;
    private String programaAcademico;
    private String vigencia;
    private String codigoCurso;
    private String nombreCurso;
    private String areaUdea;
    private String nucleoPrograma;
    private String areaPrograma;
    private String regimen;
    private String creditos;
    private String horasDocenciaDirecta;
    private String horasTrabajoIndependiente;
    private String caracteristicaCurso;
    private String correo;
    private String objetivoEspecifico;
    private String dependencia;
    private String formacionAcademica;
    private String modalidad;
    private String unidad;
    private String numeroHoras;
    private String fecha;
    private String programaOferta;
    private String profesor;

}
