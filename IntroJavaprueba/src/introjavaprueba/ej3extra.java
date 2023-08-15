/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ej3extra {

    /**Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       String vocal;
       System.out.println("Por favor, ingrese una letra");
       vocal=leer.nextLine();
        if (vocal.equalsIgnoreCase("A") ||vocal.equalsIgnoreCase ("E") || vocal.equalsIgnoreCase("I") || vocal.equalsIgnoreCase("O") || vocal.equalsIgnoreCase("U")) {
            System.out.println("Correcto, la letra ingresada es una vocal");
    /*    } else if (vocal.equalsIgnoreCase ("E")) {
            System.out.println("Correcto, la letra ingresada es una vocal");
        } else if (vocal.equalsIgnoreCase("I")) {     
            System.out.println("Correcto, la letra ingresada es una vocal");
        } else if (vocal.equalsIgnoreCase("O")) {
            System.out.println("Correcto, la letra ingresada es una vocal");
        } else if (vocal.equalsIgnoreCase("U")) { 
             System.out.println("Correcto, la letra ingresada es una vocal");*/
        } else {
                System.out.println("Incorrecto, la letra ingresada no es una vocal");

        }
    }
}
