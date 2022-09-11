package com.proyectointegrador.sgc_udea.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "nucleos")
public class Nucleos {

    @Id
    @Column(name = "idNucleos")
    private Integer idNucleos;

    @Column(name = "Nnombre")
    private String nnombre;

    @Column(name = "informacion")
    private String informacion;

}
