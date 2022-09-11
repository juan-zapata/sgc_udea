package com.proyectointegrador.sgc_udea.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "bibliografia")
public class Bibliografia {
    @Id
    @Column(name = "id_bibliografia")
    private Integer idBibliografia;

    @Column(name = "bb_detalle")
    private String bbDetalle;

    @Column(name = "bb_url")
    private String bbUrl;

}
