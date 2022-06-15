package com.proyectointegrador.sgc_udea.dto;

import lombok.Data;

@Data
public class SedeDTO {
    private Integer idSede;
    private String nombreSede;

    public Integer getIdSede() {
        return this.idSede;
    }

    public void setIdSede(Integer idSede) {
        this.idSede = idSede;
    }

    public String getNombreSede() {
        return this.nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }
}
