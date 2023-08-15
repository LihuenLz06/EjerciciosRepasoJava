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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el límite con un numero positivo");
        int limite = leer.nextInt();
        int suma = 0;
        do {
            System.out.println("Ingrese los numeros a sumar");
            int num = leer.nextInt();
            suma = suma + num;
        } while (limite > suma);
        System.out.println("Alcanzó el límite deseado!");
    }

}
