package com.proyectointegrador.sgc_udea.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "sede")
@AllArgsConstructor
@NoArgsConstructor
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
