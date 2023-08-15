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
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        String eureka = "eureka";
        
        if (frase.equalsIgnoreCase(eureka)) {
            System.out.println("Correcto!");
        }else{
            System.out.println("Incorrecto");
        }
        
    }    
}
