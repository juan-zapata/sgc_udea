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
    @Column(name = "id_nucleos")
    private Integer idNucleos;

    @Column(name = "n_nombre")
    private String nnombre;

    @Column(name = "informacion")
    private String informacion;

}
