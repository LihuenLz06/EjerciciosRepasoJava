package com.mycompany.libreriajpa.Persistencia;

import com.mycompany.libreriajpa.Entidades.Libro;
import java.io.Serializable;



public class LibroJpaController extends CRUD<Libro> implements Serializable {

    public LibroJpaController() {
        super();
    }

    @Override
    public void delete(Libro object) {
        super.delete(object); 
    }

    @Override
    public void update(Libro object) {
        super.update(object); 
    }

    @Override
    public void create(Libro object) {
        super.create(object); 
    }

    
   

}
