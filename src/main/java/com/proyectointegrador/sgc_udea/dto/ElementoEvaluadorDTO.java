package com.proyectointegrador.sgc_udea.dto;

import lombok.Data;

@Data
public class ElementoEvaluadorDTO {
    private Integer idElemento;
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
