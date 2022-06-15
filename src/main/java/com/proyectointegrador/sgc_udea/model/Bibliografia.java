package com.proyectointegrador.sgc_udea.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "bibliografia")
public class Bibliografia {
    @Id
    @Column(name = "id_bibliografia")
    private Integer idBibliografia;

    @Column(name = "bb_detalle")
    private String bbDetalle;

    @Column(name = "bb_url")
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
