package com.proyectointegrador.sgc_udea.dto;

import lombok.Data;

@Data
public class PersonaDTO {
    private Integer numeroId;
    private String nombre;
    private String apellido;

    public Integer getNumeroId() {
        return this.numeroId;
    }

    public void setNumeroId(Integer numeroId) {
        this.numeroId = numeroId;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
