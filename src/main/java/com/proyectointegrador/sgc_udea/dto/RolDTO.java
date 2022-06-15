package com.proyectointegrador.sgc_udea.dto;

import lombok.Data;

@Data
public class RolDTO {
    private Integer idRol;
    private String nombrerol;

    public Integer getIdRol() {
        return this.idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getNombrerol() {
        return this.nombrerol;
    }

    public void setNombrerol(String nombrerol) {
        this.nombrerol = nombrerol;
    }
}
