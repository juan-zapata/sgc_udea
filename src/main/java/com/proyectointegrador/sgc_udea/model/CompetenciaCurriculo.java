package com.proyectointegrador.sgc_udea.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "competencia_curriculo")
public class CompetenciaCurriculo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "competencia_id_competencia")
    private Integer competenciaIdCompetencia;

    @Column(name = "micro_curriculo_cod_microcurriculo")
    private Integer microCurriculoCodMicrocurriculo;
}
