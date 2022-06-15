package com.proyectointegrador.sgc_udea.dto;

import lombok.Data;

@Data
public class UsuarioDTO {
    private Integer idUsuario;

    public Integer getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
}
