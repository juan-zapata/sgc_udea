package com.proyectointegrador.sgc_udea.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "area_conocimiento")
public class AreaConocimiento {
    @Id
    @Column(name = "idarea_conocimiento")
    private Integer idareaConocimiento;

    @Column(name = "acnombre")
    private String acnombre;

    @Column(name = "areainformacion")
    private String areainformacion;

    @Column(name = "nucleos_id_nucleos")
    private Integer nucleosIdNucleos;
}
