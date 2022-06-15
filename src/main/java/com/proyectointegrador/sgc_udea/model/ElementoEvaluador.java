package com.proyectointegrador.sgc_udea.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "elemento_evaluador")
public class ElementoEvaluador {
    @Id
    @Column(name = "id_elemento")
    private Integer idElemento;

    @Column(name = "det_elemento")
    private String detElemento;

    public Integer getIdElemento() {
        return this.idElemento;
    }

    public void setIdElemento(Integer idElemento) {
        this.idElemento = idElemento;
    }

    public String getDetElemento() {
        return this.detElemento;
    }

    public void setDetElemento(String detElemento) {
        this.detElemento = detElemento;
    }
}
