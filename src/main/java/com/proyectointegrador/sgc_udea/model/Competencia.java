package com.proyectointegrador.sgc_udea.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "competencia")
@AllArgsConstructor
@NoArgsConstructor
public class Competencia {
    @Id
    @Column(name = "id_competencia")
    private Integer idCompetencia;

    @Column(name = "det_competencia")
    private String detCompetencia;

}
