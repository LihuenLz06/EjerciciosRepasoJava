package com.mycompany.libreriajpa.Persistencia;


import com.mycompany.libreriajpa.Entidades.Autor;
import java.io.Serializable;


public class AutorJpaController extends CRUD<Autor> implements Serializable {

    public AutorJpaController() {
        super();
    }

    @Override
    public void delete(Autor object) {
        super.delete(object); 
    }

    @Override
    public void update(Autor object) {
        super.update(object); 
    }

    @Override
    public void create(Autor object) {
        super.create(object); 
    }

    
    
}
