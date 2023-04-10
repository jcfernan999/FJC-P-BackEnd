package com.portfolio.fjc.Interfas;

import com.portfolio.fjc.Entidad.Persona;
import java.util.List;


public interface IPersonaServicio {
    public List<Persona> getPersona();
    
    public void savePersona(Persona persona);
    public void deletePersona(Long id);
    public Persona findPersona(Long id);
}
