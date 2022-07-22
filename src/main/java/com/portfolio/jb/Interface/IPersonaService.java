package com.portfolio.jb.Interface;


import com.portfolio.jb.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer lista de personas
    public List<Persona> getPersona();

    //Guardar objeto de tipo persona
    public void savePersona(Persona persona);

    //Eliminar usuario por ID
    public void deletePersona(Long id);

    //Buscar persona por ID
    public Persona findPersona(Long id);
}
