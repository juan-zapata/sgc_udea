package com.proyectointegrador.sgc_udea.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
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
}
