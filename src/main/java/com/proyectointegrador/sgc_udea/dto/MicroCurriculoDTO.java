package com.proyectointegrador.sgc_udea.dto;

import lombok.Data;

@Data
public class MicroCurriculoDTO {
    private Integer codMicrocurriculo;
    private Integer idMateria;
    private String campoformacion;
    private String hti;
    private String nroimpartido;
    private String porcdiligenciados;
    private String resultadoaprendizaje;
    private String tipoContenido;
    private String cproposito;
    private String cjustificacion;
    private String cobjetivoGeneral;
    private String csaber;
    private String chacer;
    private String cser;
    private String cContenido;
    private String cUnidadesDetallas;
    private String cMetodologia;
    private String cEvaluacion;
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
