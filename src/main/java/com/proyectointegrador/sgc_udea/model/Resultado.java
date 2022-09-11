package com.proyectointegrador.sgc_udea.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "resultado")
public class Resultado {
    @Id
    @Column(name = "id_resultado")
    private Integer idResultado;

    @Column(name = "det_resultado")
    private String detResultado;

}
