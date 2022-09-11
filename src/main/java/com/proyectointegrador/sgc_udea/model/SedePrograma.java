package com.proyectointegrador.sgc_udea.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
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

}
