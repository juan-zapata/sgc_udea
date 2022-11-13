package com.proyectointegrador.sgc_udea.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "micro_curriculo")
public class MicroCurriculoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "cod_microcurriculo")
    private int codMicrocurriculo;
    @Basic
    @Column(name = "id_materia")
    private Integer idMateria;
    @Basic
    @Column(name = "resultadoaprendizaje")
    private String resultadoaprendizaje;
    @Basic
    @Column(name = "tipoContenido")
    private String tipoContenido;
    @Basic
    @Column(name = "cproposito")
    private String cproposito;
    @Basic
    @Column(name = "cjustificacion")
    private String cjustificacion;
    @Basic
    @Column(name = "cobjetivoGeneral")
    private String cobjetivoGeneral;
    @Basic
    @Column(name = "cContenido")
    private String cContenido;
    @Basic
    @Column(name = "cMetodologia")
    private String cMetodologia;
    @Basic
    @Column(name = "elaboro")
    private int elaboro;
    @Basic
    @Column(name = "unidad_academica")
    private String unidadAcademica;
    @Basic
    @Column(name = "programa_academico")
    private String programaAcademico;
    @Basic
    @Column(name = "vigencia")
    private String vigencia;
    @Basic
    @Column(name = "codigo_curso")
    private String codigoCurso;
    @Basic
    @Column(name = "nombre_curso")
    private String nombreCurso;
    @Basic
    @Column(name = "area_udea")
    private String areaUdea;
    @Basic
    @Column(name = "nucleo_programa")
    private String nucleoPrograma;
    @Basic
    @Column(name = "area_programa")
    private String areaPrograma;
    @Basic
    @Column(name = "regimen")
    private String regimen;
    @Basic
    @Column(name = "creditos")
    private String creditos;
    @Basic
    @Column(name = "horas_docencia_directa")
    private String horasDocenciaDirecta;
    @Basic
    @Column(name = "horas_trabajo_independiente")
    private String horasTrabajoIndependiente;
    @Basic
    @Column(name = "caracteristica_curso")
    private String caracteristicaCurso;
    @Basic
    @Column(name = "correo")
    private String correo;
    @Basic
    @Column(name = "objetivo_especifico")
    private String objetivoEspecifico;
    @Column(name = "dependencia")
    private String dependencia;
    @Column(name = "formacion_academica")
    private String formacionAcademica;
    @Column(name = "modalidad")
    private String modalidad;
    @Column(name = "unidad")
    private String unidad;
    @Column(name = "numero_horas")
    private String numeroHoras;
    @Column(name = "fecha")
    private String fecha;
    @Column(name = "programa_oferta")
    private String programaOferta;
    @Column(name = "profesor")
    private String profesor;


}
