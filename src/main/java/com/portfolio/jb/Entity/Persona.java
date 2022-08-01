package com.portfolio.jb.Entity;






import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getSobremi() {
        return sobremi;
    }

    public void setSobremi(String sobremi) {
        this.sobremi = sobremi;
    }

    public String getFechanac() {
        return fechanac;
    }

    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }
}
