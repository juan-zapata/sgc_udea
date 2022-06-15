package com.proyectointegrador.sgc_udea.dto;

import lombok.Data;

@Data
public class BibliografiaDTO {
    private Integer idBibliografia;
    private String bbDetalle;
    private String bbUrl;

    public Integer getIdBibliografia() {
        return this.idBibliografia;
    }

    public void setIdBibliografia(Integer idBibliografia) {
        this.idBibliografia = idBibliografia;
    }

    public String getBbDetalle() {
        return this.bbDetalle;
    }

    public void setBbDetalle(String bbDetalle) {
        this.bbDetalle = bbDetalle;
    }

    public String getBbUrl() {
        return this.bbUrl;
    }

    public void setBbUrl(String bbUrl) {
        this.bbUrl = bbUrl;
    }
}
