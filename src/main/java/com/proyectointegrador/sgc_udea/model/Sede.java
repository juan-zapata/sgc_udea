package com.proyectointegrador.sgc_udea.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "sede")
public class Sede {
    @Id
    @Column(name = "id_sede")
    private Integer idSede;

    @Column(name = "nombre_sede")
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
