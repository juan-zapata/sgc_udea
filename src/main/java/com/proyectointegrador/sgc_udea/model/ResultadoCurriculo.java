package com.proyectointegrador.sgc_udea.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "resultado_curriculo")
public class ResultadoCurriculo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "resultado_id_resultado")
    private Integer resultadoIdResultado;

    @Column(name = "elemento_evaluador_id_elemento")
    private Integer elementoEvaluadorIdElemento;

    @Column(name = "micro_curriculo_cod_microcurriculo")
    private Integer microCurriculoCodMicrocurriculo;

}
