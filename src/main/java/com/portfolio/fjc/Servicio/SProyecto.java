package com.portfolio.fjc.Servicio;

import com.portfolio.fjc.Entidad.Proyecto;
import com.portfolio.fjc.Repositorio.RProyecto;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyecto {
    @Autowired 
    RProyecto rProyecto;
    public List<Proyecto> list(){
         return rProyecto.findAll();
     }
     
     public Optional<Proyecto> getOne(int id){
         return rProyecto.findById(id);
     }
     
     public Optional<Proyecto> getByNombre(String nombre){
         return rProyecto.findByNombre(nombre);
     }
     
     public void save(Proyecto expe){
         rProyecto.save(expe);
     }
     
     public void delete(int id){
         rProyecto.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rProyecto.existsById(id);
     }
     
     public boolean existsByNombre(String nombre){
         return rProyecto.existsByNombre(nombre);
     } 
}
