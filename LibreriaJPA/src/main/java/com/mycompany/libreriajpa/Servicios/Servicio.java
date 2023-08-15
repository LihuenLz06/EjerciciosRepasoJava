package com.mycompany.libreriajpa.Servicios;

import com.mycompany.libreriajpa.Entidades.Autor;
import com.mycompany.libreriajpa.Entidades.Editorial;
import com.mycompany.libreriajpa.Entidades.Libro;
import com.mycompany.libreriajpa.Persistencia.AutorJpaController;
import com.mycompany.libreriajpa.Persistencia.EditorialJpaController;
import com.mycompany.libreriajpa.Persistencia.LibroJpaController;
import java.util.ArrayList;
import java.util.List;


public class Servicio {
    
    private AutorJpaController autorCrud = new AutorJpaController();
    private EditorialJpaController editorialCrud = new EditorialJpaController();
    private LibroJpaController libroCrud = new LibroJpaController();
    
    List<Autor> autores = new ArrayList();
    List<Editorial> editoriales = new ArrayList();
    List<Libro> libros = new ArrayList(); 
    
    public void crearAutor(){
        try {
        Autor autor1 = new Autor("Gabriel Garcia Marquez", Boolean.FALSE, libros);
        autorCrud.create(autor1);
        autores.add(autor1);
            System.out.println("CREADO");
        }catch (Exception e){
            System.out.println("ERROR");
        }   
        }
    
    public void crearEditorial(){
        try {
        Editorial editorial1 = new Editorial("Santillana", Boolean.TRUE, libros);
        editorialCrud.create(editorial1);
        editoriales.add(editorial1);
            System.out.println("CREADO");
        }catch (Exception e){
            System.out.println("ERROR");
        }   
        }
    
       public void crearLibro(){
        try {
        Libro libro1 = new Libro("El caballero de la armadura oxidada", 1990, 5, 1, 4, Boolean.TRUE, autores.get(0), editoriales.get(0));
        libroCrud.create(libro1);
        libros.add(libro1);
            System.out.println("CREADO");
        }catch (Exception e){
            System.out.println("ERROR");
        }   
        }

}
