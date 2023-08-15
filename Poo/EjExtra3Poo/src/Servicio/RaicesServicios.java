/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class RaicesServicios {
    
    Scanner leer = new Scanner(System.in);
    Raices raiz = new Raices();
    
    public void ingresoDatos(){
        System.out.println("Ingrese el valor de a, b, c");
       raiz.setA(leer.nextDouble());
       raiz.setB(leer.nextDouble());
       raiz.setC(leer.nextDouble());
    }
    
    public double Discriminante(){
       double disc = 0;
        //double disc = Math.pow(raiz.getB());//
        return disc;
    }   
    
    
    public boolean tieneRaices(){
        boolean boo = false;
        if (Discriminante()>0) {
            boo=true;
        }
        return boo;
    }
    
    public boolean tieneR(){
        boolean boo = false;
        if (Discriminante()==0) {
            boo=true;
        }
        return boo;
    }
    
    public void obtenerRaices() {
        double raiz1;
        double raiz2;
        
       if (tieneRaices()==true) {
            raiz1 = -raiz.getB()+(Math.sqrt(Discriminante()))/2*raiz.getA();
            System.out.println("Raiz positiva: " + raiz1);
            raiz2 = -raiz.getB()-(Math.sqrt(Discriminante()))/2*raiz.getA();
            System.out.println("Raiz negativa: " + raiz2);
            
        }else{
            System.out.println("No tiene dos raices");
        }
    }
    
    public void obtenerRaiz(){
        double raiz1;
        if (tieneR()==true) {
            raiz1 = -raiz.getB()/2*raiz.getA();
            System.out.println("La raiz es: " + raiz1);
            
        }else{
            System.out.println("No tiene una raiz");
        }
    }
    
    public void calcular() {
        if (tieneRaices()==true) {
            obtenerRaices();
                      
        }else if (tieneR()==true) {
            obtenerRaiz();
            
        }else{
            System.out.println("No tiene raices reales");
        }
    }
    
    public void Menu(){
        int opcion;
        boolean salir = false;
        
        do{
            System.out.println("Elija una opción: \n "
                    + "1. Discriminante \n "
                    + "2.Tiene Raices \n "
                    + "3.Tiene Raiz \n "
                    + "4.Obtener Raices \n"
                    + "5.Obtener Raiz \n"
                    + "&.Calcular Raices \n"
                    + "7.Salir");
            opcion= leer.nextInt();
                    
                    switch(opcion){
                        case 1: 
                            System.out.println("el discriminante es igual a: " + Discriminante());
                            break;
                            
                        case 2: 
                            System.out.println(tieneRaices());
                            break;
                        case 3: 
                            System.out.println(tieneR());
                            break;
                        case 4:
                            obtenerRaices();
                            break;
                        case 5:
                            obtenerRaiz();
                            break;
                        case 6:
                            calcular();
                            break;
                        case 7:
                           salir = true; 
                                 
        }
        }while(salir = true);
        
    }
}
