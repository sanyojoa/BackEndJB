package com.portfolio.jb.Security.Service;

import com.portfolio.jb.Security.Entity.Rol;
import com.portfolio.jb.Security.Enums.RolNombre;
import com.portfolio.jb.Security.Repository.IRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class RolService {
    @Autowired
    IRolRepository irolRepositoy;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepositoy.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        irolRepositoy.save(rol);
    }
}
