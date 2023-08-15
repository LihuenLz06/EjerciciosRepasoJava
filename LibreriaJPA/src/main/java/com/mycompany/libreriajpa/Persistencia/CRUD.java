package com.mycompany.libreriajpa.Persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class CRUD <T>{

    protected EntityManagerFactory emf;
    protected EntityManager em;

    public CRUD() {
        emf = Persistence.createEntityManagerFactory("LibreriaJPApersist");
        em = emf.createEntityManager();
    }
    
    public void connect() {
        try {
            if (!em.isOpen()) {
                em = emf.createEntityManager();
            }
        }catch (Exception e) {
            System.out.println("ERROR");
        }
    }
    
    public void disconnect() {
        try {
            if (em.isOpen()) {
                em.close();
            }
        }catch (Exception e) {
            System.out.println("ERROR");
        }
    }
    
    public void create(T object) {
        try {
            connect();
        em.getTransaction().begin();
        em.persist(object);
        em.getTransaction().commit();
        } finally {
            disconnect();
        }
    }
    
     public void update(T object) {
        try {
            connect();
        em.getTransaction().begin();
        em.merge(object);
        em.getTransaction().commit();
        } finally {
            disconnect();
        }
    }
     
      public void delete(T object) {
        try {
            connect();
        em.getTransaction().begin();
        em.remove(object);
        em.getTransaction().commit();
        } finally {
            disconnect();
        }
    }
    
}
