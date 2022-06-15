package com.proyectointegrador.sgc_udea.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "sede_programa")
public class SedePrograma {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "programa_cdprograma")
    private Integer programaCdprograma;

    @Column(name = "sede_id_sede")
    private Integer sedeIdSede;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
