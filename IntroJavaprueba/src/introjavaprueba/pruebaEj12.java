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
public class pruebaEj12 {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Por favor, ingrese cadenas de 5 caracteres de largo. bla bla.");
        String frase;
        String FDE = "&&&&&";
        int contCorrectas = 0;
        int contIncorrectas = 0;
        String primerChar = "X";
        String ultimoChar = "O";
        do{
           frase = leer.nextLine();
           if(frase.substring(0,1).equalsIgnoreCase(primerChar) && frase.substring(frase.length()-1).equalsIgnoreCase(ultimoChar) && frase.length() <= 5) {
               contCorrectas++;
           }else if (frase.equals(FDE)){
               contIncorrectas += 0;
           } else {
               contIncorrectas++;
           }
   
        } while(!frase.equals(FDE));
        System.out.println("La cantidad de véces que ingresó correctamente la frase es de: " + contCorrectas);
        System.out.println("Y la cantidad de véces que se ha ingresado incorrectamente es de: " + contIncorrectas);
                        
         }

    
}
