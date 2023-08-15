
package openbootjava1;

import java.util.Scanner;

public class OpenBootJava1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese un nombre");
        String nom = sc.nextLine();
     
        String nombre = "Lihuen";
         char letra = 'L';
         int edad = 29;
         long dni = 37518108;
         double altura = 1.54;
         boolean mujer = true;
         
        System.out.println("Mi nombre es: " + nombre);
        System.out.println("La letra de mi apellido es: " + letra);
        System.out.println("Mi edad es: " + edad);
        System.out.println("Mi DNI es: " + dni);
        System.out.println("Mi altura es: " + altura);
        System.out.println("Sos mujer? : " + mujer);
        
        
        
    }
    
}
