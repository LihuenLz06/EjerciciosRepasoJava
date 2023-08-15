/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.primerProyectoSpring.primerProyecto.Repositorio;

import com.primerProyectoSpring.primerProyecto.Entidades.Noticias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author usuario
 */
@Repository // Trae todas la querys predefinidas entonces hace que nos ahorremos codigo
public interface INoticiasRepository extends JpaRepository<Noticias,Integer>{ // creamos interfaz con extends de JpaRepostory y como parametro se pasa el objeto que es la Entidad y despues el tipo de dato del ID 
    
    public Noticias findByTitulo(String titulo); //por el atributo título va a buscar un string. De esta manera buscamos el titulo de la noticia en la tabla, como query pero más sencillo, ya no usamos query.
    
    
}