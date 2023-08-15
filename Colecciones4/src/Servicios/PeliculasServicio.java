/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.PeliculasEntidad;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class PeliculasServicio {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    List <PeliculasEntidad> peliculas = new ArrayList(); 
     
    public void cargarPeliculas(){
        
     do{
         PeliculasEntidad peli = new PeliculasEntidad();  
     
        System.out.println("Ingrese el Título de la pelicula");
        peli.setTitulo(sc.next());
        
        System.out.println("Ingrese el director de la pelicula");
        peli.setDirector(sc.next());
        
        System.out.println("Indique la duración en minutos");
        peli.setDuracion(sc.nextInt());
        
        peliculas.add(peli);
     }while(agregarOtra());
//        do{
//        System.out.println("Desea agregar otra pelicula? S/N");
//        opcion = sc.next();
//                        if (!"N".equalsIgnoreCase(opcion) && 
                            //!"S".equalsIgnoreCase(opcion))
//                            System.out.println("Ingrese una opción Correcta");      
//                    } while (!"N".equalsIgnoreCase(opcion) && !"S".equalsIgnoreCase(opcion));
//        }while (opcion.equalsIgnoreCase("S"));
    }
    
    public boolean agregarOtra(){
        String opcion;
            System.out.println("Desea cargar otra peli s/n?");
        do{
            opcion = sc.next().toLowerCase();
            if (opcion.equals("s")) {
                return true;
            }else if(opcion.equals("n")){
                return false;
            }else{
                System.out.println("Opción incorrecta");
            }
       
        }while(true);
    }
  
    public void menuPeliculas(){
        
        int opcion;
        do{
            
        System.out.println("Ingrese una opción");
        System.out.println("1.Cargar Película.");
        System.out.println("2.Mostrar peliculas.");
        System.out.println("3.Mostrar Películas de más de una hora.");
        System.out.println("4.Mostrar Películas por duración ascendente.");
        System.out.println("5.Mostrar Películas por duración descendente.");
        System.out.println("5.Mostrar Películas alfabéticamente ascendente.");
        System.out.println("6.Mostrar Películas alfabéticamente descendente.");
        System.out.println("7.Salir.");
        opcion = sc.nextInt();
        switch(opcion){
            case 1: cargarPeliculas();
            break;
            case 2: mostrarPeli();
            break;
            case 3:
        }
 
        }while(opcion != 7);

    }
    public void mostrarPeli(){
        for (PeliculasEntidad todas : peliculas) {
            System.out.println(todas.toString());
        }
    }

    
     /* public double mayor1h(){
        
         for (PeliculasEntidad mayor1 : peliculas) {
             if (mayor1.getDuracion()>1.5) {
                 System.out.println(mayor1);
                 
         }
         }*/
       
  
}
