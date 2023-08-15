package com.mycompany.libreriajpa.Persistencia;


import com.mycompany.libreriajpa.Entidades.Editorial;
import java.io.Serializable;



public class EditorialJpaController extends CRUD<Editorial> implements Serializable {

    public EditorialJpaController() {
        super ();
    }

    @Override
    public void delete(Editorial object) {
        super.delete(object); 
    }

    @Override
    public void update(Editorial object) {
        super.update(object); 
    }

    @Override
    public void create(Editorial object) {
        super.create(object); 
    }
    
    
    

   

}
