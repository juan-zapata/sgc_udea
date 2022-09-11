package com.proyectointegrador.sgc_udea.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PersonaDTO {
    @NotBlank(message = "el numeroId es obligatorio")
    private Integer numeroId;
    @NotBlank(message = "el nombre es obligatorio")
    private String nombre;
    @NotBlank(message = "el apellido es obligatorio")
    private String apellido;

}
