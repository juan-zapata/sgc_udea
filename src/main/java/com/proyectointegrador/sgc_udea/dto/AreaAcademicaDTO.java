package com.proyectointegrador.sgc_udea.dto;

import lombok.Data;

@Data
public class AreaAcademicaDTO {
    private Integer idAreaAcademica;
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
