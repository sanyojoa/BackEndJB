package com.portfolio.jb.Entity;



import lombok.Getter;
import lombok.Setter;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Getter
@Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 45, message = "No cumple con los requisitos")
    private String nombre;

    @NotNull
    @Size(min = 1, max = 45, message = "No cumple con los requisitos")
    private String apellido;

    @NotNull
    @Size(min = 1, max = 500, message = "No cumple con los requisitos")
    private String img;

    @NotNull
    @Size(min = 1, max = 1000, message = "No cumple con los requisitos")
    private String sobremi;

    @NotNull
    @Size(min = 1, max = 45, message = "No cumple con los requisitos")
    private String fechanac;

}
