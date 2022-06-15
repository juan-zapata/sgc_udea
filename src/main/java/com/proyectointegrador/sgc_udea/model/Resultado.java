package com.proyectointegrador.sgc_udea.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "resultado")
public class Resultado {
    @Id
    @Column(name = "id_resultado")
    private Integer idResultado;

    @Column(name = "det_resultado")
    private String detResultado;

    public Integer getIdResultado() {
        return this.idResultado;
    }

    public void setIdResultado(Integer idResultado) {
        this.idResultado = idResultado;
    }

    public String getDetResultado() {
        return this.detResultado;
    }

    public void setDetResultado(String detResultado) {
        this.detResultado = detResultado;
    }
}
