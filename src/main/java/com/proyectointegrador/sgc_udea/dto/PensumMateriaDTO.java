package com.proyectointegrador.sgc_udea.dto;

import lombok.Data;

@Data
public class PensumMateriaDTO {
    private Integer materiaCdmateria;
    private String pensumCdpensum;

    public Integer getMateriaCdmateria() {
        return this.materiaCdmateria;
    }

    public void setMateriaCdmateria(Integer materiaCdmateria) {
        this.materiaCdmateria = materiaCdmateria;
    }

    public String getPensumCdpensum() {
        return this.pensumCdpensum;
    }

    public void setPensumCdpensum(String pensumCdpensum) {
        this.pensumCdpensum = pensumCdpensum;
    }
}
