package com.proyectointegrador.sgc_udea.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "bibliografia_materia")
public class BibliografiaMateria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "micro_curriculo_cod_microcurriculo")
    private Integer microCurriculoCodMicrocurriculo;

    @Column(name = "bibliografia_id_bibliografia")
    private Integer bibliografiaIdBibliografia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
