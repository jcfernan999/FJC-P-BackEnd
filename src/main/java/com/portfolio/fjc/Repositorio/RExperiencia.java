package com.portfolio.fjc.Repositorio;

import com.portfolio.fjc.Entidad.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepository<Experiencia, Integer>{
    public Optional<Experiencia> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
