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
public class MicroCurriculo {
    @Id
    @Column(name = "cod_microcurriculo")
    private Integer codMicrocurriculo;

    @Column(name = "id_materia")
    private Integer idMateria;

    @Column(name = "campoformacion")
    private String campoformacion;

    @Column(name = "hti")
    private String hti;

    @Column(name = "nroimpartido")
    private String nroimpartido;

    @Column(name = "porcdiligenciados")
    private String porcdiligenciados;

    @Column(name = "resultadoaprendizaje")
    private String resultadoaprendizaje;

    @Column(name = "tipoContenido")
    private String tipoContenido;

    @Column(name = "cproposito")
    private String cproposito;

    @Column(name = "cjustificacion")
    private String cjustificacion;

    @Column(name = "cobjetivoGeneral")
    private String cobjetivoGeneral;

    @Column(name = "csaber")
    private String csaber;

    @Column(name = "chacer")
    private String chacer;

    @Column(name = "cser")
    private String cser;

    @Column(name = "cContenido")
    private String cContenido;

    @Column(name = "cUnidadesDetallas")
    private String cUnidadesDetallas;

    @Column(name = "cMetodologia")
    private String cMetodologia;

    @Column(name = "cEvaluacion")
    private String cEvaluacion;

    @Column(name = "elaboro")
    private Integer elaboro;

}
