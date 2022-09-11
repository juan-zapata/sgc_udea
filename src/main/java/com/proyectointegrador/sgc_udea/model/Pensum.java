package com.proyectointegrador.sgc_udea.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "pensum")
public class Pensum {
    @Id
    @Column(name = "cdpensum")
    private String cdpensum;

    @Column(name = "cohorteinicial")
    private Integer cohorteinicial;

    @Column(name = "cohortefinal")
    private Integer cohortefinal;

    @Column(name = "programa_cdprograma")
    private Integer programaCdprograma;
}
