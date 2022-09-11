package com.proyectointegrador.sgc_udea.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "requisito")
public class Requisito {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "cod_materia")
    private Integer codMateria;

    @Column(name = "cod_matrequisito")
    private Integer codMatrequisito;

    @Column(name = "tipo")
    private Integer tipo;

}
