/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaprueba;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;
        String x = "X";
        String o = "O";
        String FDE = "&&&&&";

        int correctos = 0;
        int incorrectos = 0;
        
        do {
            System.out.println("Ingrese una cadena de texto:");
            cadena = leer.nextLine();

            if (cadena.length() <= 5 && cadena.substring(0, 1).equals(x) && cadena.substring(cadena.length() - 1, cadena.length()).equals(o)) {
                correctos += 1;
            } else {
                incorrectos += 1;
            }
        } while (!cadena.equals(FDE));
        
        if (cadena.equals(FDE)) {
            incorrectos -= 1;
        }
        
        System.out.println("La cantidad de lecturas correctas es: " + correctos);
        System.out.println("La cantidad de lecturas incorrectas es: " + incorrectos);
    
    }
}
