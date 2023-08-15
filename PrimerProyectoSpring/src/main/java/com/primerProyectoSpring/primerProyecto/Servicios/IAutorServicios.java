/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.primerProyectoSpring.primerProyecto.Servicios;

import com.primerProyectoSpring.primerProyecto.Entidades.Autor;

import java.util.List;
import java.util.Optional;

public interface IAutorServicios {
    
    public List<Autor> findAll();
    public Optional<Autor> getById(Integer id);//Optional: hace que la busqueda sea más selectiva
    public void update(Autor autor);//metodo para actualizar
    public void delete(Integer id);//metodo para borran
    public Autor save(Autor autor);//metodo para guardar
    
}
