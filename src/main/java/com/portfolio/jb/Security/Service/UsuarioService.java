package com.portfolio.jb.Security.Service;


import com.portfolio.jb.Security.Entity.Usuario;
import com.portfolio.jb.Security.Repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    IUsuarioRepository iusuarioRepository;

    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    }

    public boolean existsByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.existByNombreUsuario(nombreUsuario);
    }

    public boolean existsByEmail(String email){
        return iusuarioRepository.existByEmail(email);
    }

    public void save(Usuario usuario){
        iusuarioRepository.save(usuario);
    }
}