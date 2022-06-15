package com.proyectointegrador.sgc_udea.dto;

import lombok.Data;

@Data
public class AreaConocimientoDTO {
    private Integer idareaConocimiento;
    private String acnombre;
    private String areainformacion;
    private Integer nucleosIdNucleos;

    public Integer getIdareaConocimiento() {
        return this.idareaConocimiento;
    }

    public void setIdareaConocimiento(Integer idareaConocimiento) {
        this.idareaConocimiento = idareaConocimiento;
    }

    public String getAcnombre() {
        return this.acnombre;
    }

    public void setAcnombre(String acnombre) {
        this.acnombre = acnombre;
    }

    public String getAreainformacion() {
        return this.areainformacion;
    }

    public void setAreainformacion(String areainformacion) {
        this.areainformacion = areainformacion;
    }

    public Integer getNucleosIdNucleos() {
        return this.nucleosIdNucleos;
    }

    public void setNucleosIdNucleos(Integer nucleosIdNucleos) {
        this.nucleosIdNucleos = nucleosIdNucleos;
    }
}
