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
public class Ejercicio9 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
         System.out.println("Ingrese una frase o palabra");
         String fp = leer.nextLine();
         
         String A = "a";
         String letra = fp.substring(0,1);
         
         if (letra.equalsIgnoreCase(A)){
             System.out.println("CORRECTO!!");
         } else {
             System.out.println("INCORECTO");
         }
        
    }   
}
