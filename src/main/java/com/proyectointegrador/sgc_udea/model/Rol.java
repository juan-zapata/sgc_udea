package com.proyectointegrador.sgc_udea.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "rol")
public class Rol {
    @Id
    @Column(name = "idRol")
    private Integer idRol;

    @Column(name = "nombrerol")
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
