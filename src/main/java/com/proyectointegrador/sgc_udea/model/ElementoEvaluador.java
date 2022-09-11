package com.proyectointegrador.sgc_udea.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "elemento_evaluador")
public class ElementoEvaluador {
    @Id
    @Column(name = "id_elemento")
    private Integer idElemento;

    @Column(name = "det_elemento")
    private String detElemento;

}
