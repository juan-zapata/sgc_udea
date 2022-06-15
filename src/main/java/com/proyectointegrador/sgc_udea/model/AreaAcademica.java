package com.proyectointegrador.sgc_udea.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "area_academica")
public class AreaAcademica {
    @Id
    @Column(name = "id_area_academica")
    private Integer idAreaAcademica;

    @Column(name = "nombre_area_academica")
    private String nombreAreaAcademica;

    public Integer getIdAreaAcademica() {
        return this.idAreaAcademica;
    }

    public void setIdAreaAcademica(Integer idAreaAcademica) {
        this.idAreaAcademica = idAreaAcademica;
    }

    public String getNombreAreaAcademica() {
        return this.nombreAreaAcademica;
    }

    public void setNombreAreaAcademica(String nombreAreaAcademica) {
        this.nombreAreaAcademica = nombreAreaAcademica;
    }
}
