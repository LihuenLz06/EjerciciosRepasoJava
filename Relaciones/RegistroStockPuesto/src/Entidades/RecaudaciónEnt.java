
package Entidades;

import java.awt.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class RecaudaciónEnt {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
     public void  diaRecaudación() {
         int[] fecha = new int[3];
         for (int i = 0; i < 2; i++) {
          System.out.println("Ingresar Fecha en números: 00/00/00"); 
          fecha[i]=sc.nextInt();
         }
         
         
  }
     public Double montoRecaudacion(){
         //
         ArrayList<Double> venta = new ArrayList();
        double totalVentas = 0;
         System.out.println("Cargar el monto de la venta: ");
         venta.add(sc.nextDouble());
         for (Double ventas : venta) {
             totalVentas += ventas;
         }
           return totalVentas;
         }
     
     public void calcularAdministraciónRecaudado () {
         
         int alquiler = 70000;
         int reposicion; //Hacer un mentodo para calcular el monto de reposición, en vase a lo que se gasto de mercaderia en el día.
         //Hacer "a partir de que monto se saca tanto porcentaje"
     }
}
