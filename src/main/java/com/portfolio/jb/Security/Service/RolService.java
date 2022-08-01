package com.portfolio.jb.Security.Service;

import java.util.Optional;
import javax.transaction.Transactional;

import com.portfolio.jb.Security.Entity.Rol;
import com.portfolio.jb.Security.Enums.RolNombre;
import com.portfolio.jb.Security.Repository.iRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        irolRepository.save(rol);
    }
}

