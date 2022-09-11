package com.proyectointegrador.sgc_udea.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "area_academica")
public class AreaAcademica {

    @Id
    @Column(name = "id_area_academica")
    private Integer idAreaAcademica;

    @Column(name = "nombre_area_academica")
    private String nombreAreaAcademica;

}
