package com.primerProyectoSpring.primerProyecto.Servicios;

import com.primerProyectoSpring.primerProyecto.Entidades.Noticias;
import java.util.List;
import java.util.Optional;


public interface INoticiaServicios {
    public List<Noticias> findAll();
    public Optional<Noticias> getById(Integer id);//Optional: hace que la busqueda sea más selectiva
    public void update(Noticias noticia);//metodo para actualizar
    public void delete(Integer id);//metodo para borran
    public Noticias save(Noticias noticia);//metodo para guardar
    
    
}
