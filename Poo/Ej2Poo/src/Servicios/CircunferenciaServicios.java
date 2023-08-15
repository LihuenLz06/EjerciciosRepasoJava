/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Circunferencia;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class CircunferenciaServicios {
    Scanner sc = new Scanner (System.in).useDelimiter("\n");

    DecimalFormat decimales = new DecimalFormat("#,###.##");

    public Circunferencia crearCircunferencia() {
        
        Circunferencia c1 = new Circunferencia();
        
        System.out.println("Ingrese el radio de la circunferencia");
        c1.setRadio(sc.nextDouble());
        
       while (c1.getRadio() <= 0 ){
           System.out.println("Error!! Usted me está tomando el pelo, introduzca un numero entero positivo, ¡POSIBLE DE CALCULAR!");
            c1.setRadio(sc.nextDouble());
       }
        
        System.out.println("Invente un nombre para su circunferencia");
        c1.setNombre(sc.next());
        
        return c1;              
    }
    
    public void area(Circunferencia c1){
        
       double area = Math.PI * Math.pow(c1.getRadio(), 2);
        System.out.println("El area de la circunferencia: " + c1.getNombre() + " es: " + (decimales.format(area)));
    }
    
     public void perimetro(Circunferencia c1){
        
       double perimetro = 2 * Math.PI * c1.getRadio();
        System.out.println("El Perímetro de la circunferencia: " + c1.getNombre() + " es: " + (decimales.format(perimetro)));
    }
}
