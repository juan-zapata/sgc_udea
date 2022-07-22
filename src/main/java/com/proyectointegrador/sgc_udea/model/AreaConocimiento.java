package com.proyectointegrador.sgc_udea.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "area_conocimiento")
@AllArgsConstructor
@NoArgsConstructor
public class AreaConocimiento {
    @Id
    @Column(name = "idarea_conocimiento")
    private Integer idareaConocimiento;

    @Column(name = "acnombre")
    private String acnombre;

    @Column(name = "areainformacion")
    private String areainformacion;

    @Column(name = "Nucleos_idNucleos")
    private Integer nucleosIdNucleos;

    public Integer getIdareaConocimiento() {
        return this.idareaConocimiento;
    }

    public void setIdareaConocimiento(Integer idareaConocimiento) {
        this.idareaConocimiento = idareaConocimiento;
    }

    public String getAcnombre() {
        return this.acnombre;
    }

    public void setAcnombre(String acnombre) {
        this.acnombre = acnombre;
    }

    public String getAreainformacion() {
        return this.areainformacion;
    }

    public void setAreainformacion(String areainformacion) {
        this.areainformacion = areainformacion;
    }

    public Integer getNucleosIdNucleos() {
        return this.nucleosIdNucleos;
    }

    public void setNucleosIdNucleos(Integer nucleosIdNucleos) {
        this.nucleosIdNucleos = nucleosIdNucleos;
    }
}
