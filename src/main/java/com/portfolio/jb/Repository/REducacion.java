package com.portfolio.jb.Repository;

import com.portfolio.jb.Entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface REducacion  extends JpaRepository<Educacion, Integer> {
    public Optional<Educacion> findByNombreEd(String nombreEd);
    public boolean existByNombreEd(String nombreEd);
}
