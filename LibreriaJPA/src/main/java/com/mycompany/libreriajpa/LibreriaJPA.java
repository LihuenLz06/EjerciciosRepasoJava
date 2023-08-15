/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.libreriajpa;

import com.mycompany.libreriajpa.Servicios.Servicio;



/**
 *
 * @author usuario
 */
public class LibreriaJPA {

    public static void main(String[] args) {
      
        
       Servicio serv = new Servicio();
       
       serv.crearLibro();
       serv.crearAutor();
       serv.crearEditorial();
        
        
    }
}
