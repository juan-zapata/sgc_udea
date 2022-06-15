package com.proyectointegrador.sgc_udea.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "pensum_materia")
public class PensumMateria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "materia_cdmateria")
    private Integer materiaCdmateria;

    @Column(name = "Pensum_cdpensum")
    private String pensumCdpensum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
