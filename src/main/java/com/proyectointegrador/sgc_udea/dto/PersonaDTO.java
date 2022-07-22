package com.proyectointegrador.sgc_udea.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class PersonaDTO {
    @NotBlank(message = "el numeroId es obligatorio")
    private Integer numeroId;
    @NotBlank(message = "el nombre es obligatorio")
    private String nombre;
    @NotBlank(message = "el apellido es obligatorio")
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
