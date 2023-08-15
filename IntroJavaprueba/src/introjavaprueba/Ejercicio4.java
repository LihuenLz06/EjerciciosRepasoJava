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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados Centigrados");
        double Ce = leer.nextDouble();
        double Fa = 32 + (9 * Ce / 5);
        System.out.println("Su equivalente en grados Fahrenheit es: " + Fa);
    }    
}
