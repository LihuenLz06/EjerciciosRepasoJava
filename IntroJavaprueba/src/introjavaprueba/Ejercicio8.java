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
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase o palabra de 8 caracteres de largo");
        String fp = leer.nextLine();
        
        while (fp.length() != 8){
            System.out.println("ERROR. La cantidad de caracteres no debe ser < ó > que 8");
            fp = leer.nextLine();
        }
        
        if (fp.length() == 8){
            System.out.println("CORRECTO!");
        }
    }     
    
}
