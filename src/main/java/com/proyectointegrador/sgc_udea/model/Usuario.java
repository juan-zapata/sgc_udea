package com.proyectointegrador.sgc_udea.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "usuario")
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    @Column(name = "idUsuario")
    private Integer idUsuario;
}
