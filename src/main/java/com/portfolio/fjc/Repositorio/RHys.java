package com.portfolio.fjc.Repositorio;

import com.portfolio.fjc.Entidad.Hys;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RHys extends JpaRepository<Hys, Integer>{
    Optional<Hys> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
