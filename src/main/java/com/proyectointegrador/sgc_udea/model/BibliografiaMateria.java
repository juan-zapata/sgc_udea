package com.proyectointegrador.sgc_udea.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "bibliografia_materia")
public class BibliografiaMateria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "micro_curriculo_cod_microcurriculo")
    private Integer microCurriculoCodMicrocurriculo;

    @Column(name = "bibliografia_id_bibliografia")
    private Integer bibliografiaIdBibliografia;

}
