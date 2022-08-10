package com.portfolio.jb.Service;

import com.portfolio.jb.Entity.Persona;
import com.portfolio.jb.Repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ImpPersonaService{
    @Autowired
    IPersonaRepository ipersonaRepository;


    public List<Persona> list(){
        return ipersonaRepository.findAll();
    }

    public Optional<Persona> getOne(int id){
        return ipersonaRepository.findById(id);
    }

    public Optional<Persona> getByNombre(String nombre){
        return ipersonaRepository.findByNombre(nombre);
    }

    public void save(Persona persona){
        ipersonaRepository.save(persona);
    }

    public void delete(int id){
        ipersonaRepository.deleteById(id);
    }

    public boolean existsById(int id){
        return ipersonaRepository.existsById(id);
    }

    public boolean existsByNombre(String nombre){
        return ipersonaRepository.existsByNombre(nombre);
    }
}
