package com.portfolio.jb.Repository;

import com.portfolio.jb.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Integer> {
    public Optional<Persona> findByNombre(String nombreE);
    public boolean existsByNombre(String nombreE);
}
