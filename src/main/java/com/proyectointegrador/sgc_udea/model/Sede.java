package com.proyectointegrador.sgc_udea.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "sede")
@AllArgsConstructor
@NoArgsConstructor
public class Sede {
    @Id
    @Column(name = "id_sede")
    private Integer idSede;

    @Column(name = "nombre_sede")
    private String nombreSede;

}
