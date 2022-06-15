package com.proyectointegrador.sgc_udea.dto;

import lombok.Data;

@Data
public class SedeProgramaDTO {
    private Integer programaCdprograma;
    private Integer sedeIdSede;

    public Integer getProgramaCdprograma() {
        return this.programaCdprograma;
    }

    public void setProgramaCdprograma(Integer programaCdprograma) {
        this.programaCdprograma = programaCdprograma;
    }

    public Integer getSedeIdSede() {
        return this.sedeIdSede;
    }

    public void setSedeIdSede(Integer sedeIdSede) {
        this.sedeIdSede = sedeIdSede;
    }
}
