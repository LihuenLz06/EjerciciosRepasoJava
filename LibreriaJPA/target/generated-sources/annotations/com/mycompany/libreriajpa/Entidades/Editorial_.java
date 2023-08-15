package com.mycompany.libreriajpa.Entidades;

import com.mycompany.libreriajpa.Entidades.Libro;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-04-03T20:28:43", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Editorial.class)
public class Editorial_ { 

    public static volatile ListAttribute<Editorial, Libro> libros;
    public static volatile SingularAttribute<Editorial, Boolean> alta;
    public static volatile SingularAttribute<Editorial, Integer> id;
    public static volatile SingularAttribute<Editorial, String> nombre;

}