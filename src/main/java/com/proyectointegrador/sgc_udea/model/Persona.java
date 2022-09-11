package com.proyectointegrador.sgc_udea.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "persona")
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
    @Id
    @Column(name = "numero_id")
    private Integer numeroId;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

}
