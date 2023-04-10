package com.portfolio.fjc.Repositorio;

import com.portfolio.fjc.Entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepositorio extends JpaRepository<Persona,Long>{
    
}
