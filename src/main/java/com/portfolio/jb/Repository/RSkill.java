package com.portfolio.jb.Repository;

import com.portfolio.jb.Entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RSkill extends JpaRepository<Skill, Integer> {
    public Optional<Skill> findByNombreS(String nombreS);
    public boolean existsByNombreS(String nombreS);
}
