package com.proyectointegrador.sgc_udea.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "requisito")
public class Requisito {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "cod_materia")
    private Integer codMateria;

    @Column(name = "cod_matrequisito")
    private Integer codMatrequisito;

    @Column(name = "tipo")
    private Integer tipo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCodMateria() {
        return this.codMateria;
    }

    public void setCodMateria(Integer codMateria) {
        this.codMateria = codMateria;
    }

    public Integer getCodMatrequisito() {
        return this.codMatrequisito;
    }

    public void setCodMatrequisito(Integer codMatrequisito) {
        this.codMatrequisito = codMatrequisito;
    }

    public Integer getTipo() {
        return this.tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }
}
