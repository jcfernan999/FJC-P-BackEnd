package com.portfolio.fjc.Seguridad.Servicio;

import com.portfolio.fjc.Seguridad.Entidad.Rol;
import com.portfolio.fjc.Seguridad.Enumerar.RolNombre;
import com.portfolio.fjc.Seguridad.Repositorio.iRolRepositorio;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolServicio {
    @Autowired
    iRolRepositorio irolRepositorio;
    
    public Optional<Rol>getByRolNombre(RolNombre rolNombre){
        return irolRepositorio.findByRolNombre(rolNombre);
    }
    public void save(Rol rol){
        irolRepositorio.save(rol);
    }
}
