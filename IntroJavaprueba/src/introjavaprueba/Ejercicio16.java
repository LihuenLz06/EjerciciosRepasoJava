/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaprueba;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio16 {
     public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         
                
         System.out.println("Ingrese un numero para dar el tamaño");
         int n = leer.nextInt();
         
         int[] vector = new int[n];
         
         for ( int i = 0; i <= n -1; i++) {
             vector[i] = (int) (Math.random()*20) + 1;
             System.out.print("[" + vector[i] + "]");
         }
         
         System.out.println("");
         System.out.println("Ingrese un numero a buscar");
         int num = leer.nextInt();
         int cont;
                 
         cont = 0;
         for (int i = 0; i <= n -1; i++) {
             if (vector[i] == num ) {
                 cont ++;
                 System.out.println("El numero se encontro en la posicion " + i);
                 
             }
         }
         System.out.println("El numero se encontro " + cont + " veces.");
         
                 
     }
    
}
