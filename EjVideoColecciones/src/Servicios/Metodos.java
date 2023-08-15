/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;


import Entidades.Mascota;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Metodos {
    private Scanner sc = new Scanner(System.in);
    private List <Mascota> mascotas; 

    public Metodos() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }
    
    
    
    public Mascota crearMascota(){
        
        
        System.out.println("Indique los datos personales de la Mascota: ");
        System.out.println("Nombre");
        String nombre = sc.next();
        
        System.out.println("Apodo");
        String apodo = sc.next();
        
        System.out.println("Raza");
        String raza = sc.next();
        
        Mascota m = new Mascota(nombre, apodo, raza);
        mascotas.add(m);
        
       return m;
       
    }
    
    public void mostrarMascota(){
        
        System.out.println("Las mascotas registradas hasta el momento son: ");
        
        for (Mascota aux : mascotas) {
            System.out.println(aux.toString());
            
        }
        System.out.println("Cantidad total: " + mascotas.size());
    }
    
    // "fabricaLuz", "fabricaMilanga". Es para fabricar muchas mascotas del mismo tipo en simultaneo, 
    // para no tener que introducir manualmente por teclado y ver como funciona el ejercicio.
    //Cant: equivale a la cantidad de mascotas creadas.
    
    public void fabricaLuz(int cant){
        
        for (int i = 0; i < cant; i++) {
            
            mascotas.add(new Mascota ("Luz", "Goarda", "MedioObejera"));
        }
    }
   public void fabricaMilanga(int cantMilanga){
        
        for (int i = 0; i < cantMilanga; i++) {
            
            mascotas.add(new Mascota ("Milanga", "Cabo", "BorderColli"));
        }
    }
    
    //FabricaMascotas va a crear las mascotas introducidas por teclado.
    
    public void fabricaMascotas (int cant){
        
        for (int i = 0; i < cant; i++) {
            
            crearMascota();
           
        }
        
        
    }
}

