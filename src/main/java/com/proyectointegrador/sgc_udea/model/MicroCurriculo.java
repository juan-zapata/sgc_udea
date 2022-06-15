package com.proyectointegrador.sgc_udea.model;

import lombok.Data;

import javax.persistence.*;

@Data
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

    public Integer getCodMicrocurriculo() {
        return this.codMicrocurriculo;
    }

    public void setCodMicrocurriculo(Integer codMicrocurriculo) {
        this.codMicrocurriculo = codMicrocurriculo;
    }

    public Integer getIdMateria() {
        return this.idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public String getCampoformacion() {
        return this.campoformacion;
    }

    public void setCampoformacion(String campoformacion) {
        this.campoformacion = campoformacion;
    }

    public String getHti() {
        return this.hti;
    }

    public void setHti(String hti) {
        this.hti = hti;
    }

    public String getNroimpartido() {
        return this.nroimpartido;
    }

    public void setNroimpartido(String nroimpartido) {
        this.nroimpartido = nroimpartido;
    }

    public String getPorcdiligenciados() {
        return this.porcdiligenciados;
    }

    public void setPorcdiligenciados(String porcdiligenciados) {
        this.porcdiligenciados = porcdiligenciados;
    }

    public String getResultadoaprendizaje() {
        return this.resultadoaprendizaje;
    }

    public void setResultadoaprendizaje(String resultadoaprendizaje) {
        this.resultadoaprendizaje = resultadoaprendizaje;
    }

    public String getTipoContenido() {
        return this.tipoContenido;
    }

    public void setTipoContenido(String tipoContenido) {
        this.tipoContenido = tipoContenido;
    }

    public String getCproposito() {
        return this.cproposito;
    }

    public void setCproposito(String cproposito) {
        this.cproposito = cproposito;
    }

    public String getCjustificacion() {
        return this.cjustificacion;
    }

    public void setCjustificacion(String cjustificacion) {
        this.cjustificacion = cjustificacion;
    }

    public String getCobjetivoGeneral() {
        return this.cobjetivoGeneral;
    }

    public void setCobjetivoGeneral(String cobjetivoGeneral) {
        this.cobjetivoGeneral = cobjetivoGeneral;
    }

    public String getCsaber() {
        return this.csaber;
    }

    public void setCsaber(String csaber) {
        this.csaber = csaber;
    }

    public String getChacer() {
        return this.chacer;
    }

    public void setChacer(String chacer) {
        this.chacer = chacer;
    }

    public String getCser() {
        return this.cser;
    }

    public void setCser(String cser) {
        this.cser = cser;
    }

    public String getCContenido() {
        return this.cContenido;
    }

    public void setCContenido(String cContenido) {
        this.cContenido = cContenido;
    }

    public String getCUnidadesDetallas() {
        return this.cUnidadesDetallas;
    }

    public void setCUnidadesDetallas(String cUnidadesDetallas) {
        this.cUnidadesDetallas = cUnidadesDetallas;
    }

    public String getCMetodologia() {
        return this.cMetodologia;
    }

    public void setCMetodologia(String cMetodologia) {
        this.cMetodologia = cMetodologia;
    }

    public String getCEvaluacion() {
        return this.cEvaluacion;
    }

    public void setCEvaluacion(String cEvaluacion) {
        this.cEvaluacion = cEvaluacion;
    }

    public Integer getElaboro() {
        return this.elaboro;
    }

    public void setElaboro(Integer elaboro) {
        this.elaboro = elaboro;
    }
}
