package com.portfolio.jb.Service;

import com.portfolio.jb.Entity.Educacion;
import com.portfolio.jb.Repository.REducacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SEducacion {
    @Autowired
    REducacion rEducacion;

    public List<Educacion> list(){
        return rEducacion.findAll();
    }

    public Optional<Educacion> getOne(int id){
        return rEducacion.findById(id);
    }

    public Optional<Educacion> getByNombreEd(String nombreEd){
        return rEducacion.findByNombreEd(nombreEd);
    }

    public void save(Educacion educacion){
        rEducacion.save(educacion);
    }

    public void delete(int id){
        rEducacion.deleteById(id);
    }

    public boolean existsById(int id){
        return rEducacion.existsById(id);
    }

    public boolean existsByNombreEd(String nombreEd){
        return rEducacion.existByNombreEd(nombreEd);
    }
}
