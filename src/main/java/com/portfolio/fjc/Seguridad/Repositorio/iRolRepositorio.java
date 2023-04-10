
package com.portfolio.fjc.Seguridad.Repositorio;

import com.portfolio.fjc.Seguridad.Entidad.Rol;
import com.portfolio.fjc.Seguridad.Enumerar.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepositorio extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
