package com.portfolio.jb.Security.Repository;

import com.portfolio.jb.Security.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface iUsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);

    boolean existByNombreUsuario(String nombreUsuario);
    boolean existByNombreEmail(String email);

}
