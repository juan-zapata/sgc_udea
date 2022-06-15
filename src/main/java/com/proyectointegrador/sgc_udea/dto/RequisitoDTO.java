package com.proyectointegrador.sgc_udea.dto;

import lombok.Data;

@Data
public class RequisitoDTO {
    private Integer codMateria;
    private Integer codMatrequisito;
    private Integer tipo;

    public Integer getCodMateria() {
        return this.codMateria;
    }

    public void setCodMateria(Integer codMateria) {
        this.codMateria = codMateria;
    }

    public Integer getCodMatrequisito() {
        return this.codMatrequisito;
    }

    public void setCodMatrequisito(Integer codMatrequisito) {
        this.codMatrequisito = codMatrequisito;
    }

    public Integer getTipo() {
        return this.tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }
}
