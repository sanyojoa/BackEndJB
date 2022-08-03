package com.portfolio.jb.Controller;

import com.portfolio.jb.Dto.dtoEducacion;
import com.portfolio.jb.Entity.Educacion;
import com.portfolio.jb.Security.Controller.Mensaje;
import com.portfolio.jb.Service.SEducacion;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/educacion")
@CrossOrigin(origins = "http://localhost:4200")
public class CEducacion {
    @Autowired
    SEducacion sEducacion;

    @GetMapping("/lista")
    public ResponseEntity<List<Educacion>> list(){
        List<Educacion> list = sEducacion.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> getById(@PathVariable("id") int id){
        if (!sEducacion.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el id"), HttpStatus.BAD_REQUEST);
        }

        Educacion educacion = sEducacion.getOne(id).get();
        return new ResponseEntity(educacion, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        if (!sEducacion.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el id"), HttpStatus.NOT_FOUND);
        }
        sEducacion.delete(id);
        return new ResponseEntity(new Mensaje("Educacion eliminada"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoEducacion dtoeducacion){
        if (StringUtils.isBlank(dtoeducacion.getNombreEd())){
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (sEducacion.existsByNombreEd(dtoeducacion.getNombreEd())){
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }

        Educacion educacion = new Educacion(dtoeducacion.getNombreEd(), dtoeducacion.getDescripcionEd());
        sEducacion.save(educacion);
        return new ResponseEntity(new Mensaje("Educacion creada"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoEducacion dtoeducacion){
        if (!sEducacion.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el id"), HttpStatus.NOT_FOUND);
        }
        if (sEducacion.existsByNombreEd(dtoeducacion.getNombreEd()) && sEducacion.getByNombreEd(dtoeducacion.getNombreEd()).get().getId() != id){
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(dtoeducacion.getNombreEd())){
            return new ResponseEntity(new Mensaje("El campo no puede estar vacio"), HttpStatus.BAD_REQUEST);
        }

        Educacion educacion = sEducacion.getOne(id).get();

        educacion.setNombreEd(dtoeducacion.getNombreEd());
        educacion.setDescripcionEd(dtoeducacion.getDescripcionEd());

        sEducacion.save(educacion);

        return new ResponseEntity(new Mensaje("Educacion actualizada"), HttpStatus.OK);

    }
}
