package com.proyectointegrador.sgc_udea.dto;

import lombok.Data;

@Data
public class BibliografiaMateriaDTO {
    private Integer microCurriculoCodMicrocurriculo;
    private Integer bibliografiaIdBibliografia;

    public Integer getMicroCurriculoCodMicrocurriculo() {
        return this.microCurriculoCodMicrocurriculo;
    }

    public void setMicroCurriculoCodMicrocurriculo(Integer microCurriculoCodMicrocurriculo) {
        this.microCurriculoCodMicrocurriculo = microCurriculoCodMicrocurriculo;
    }

    public Integer getBibliografiaIdBibliografia() {
        return this.bibliografiaIdBibliografia;
    }

    public void setBibliografiaIdBibliografia(Integer bibliografiaIdBibliografia) {
        this.bibliografiaIdBibliografia = bibliografiaIdBibliografia;
    }
}
