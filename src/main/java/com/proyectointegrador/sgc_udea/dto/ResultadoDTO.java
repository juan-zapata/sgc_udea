package com.proyectointegrador.sgc_udea.dto;

import lombok.Data;

@Data
public class ResultadoDTO {
    private Integer idResultado;
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
