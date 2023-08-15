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
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numero a sumar");
        System.out.println("Numero 1");
        int num1 = leer.nextInt();
        System.out.println("Numero 2");
        int num2 = leer.nextInt();
        
        int resultado = num1 + num2;
        
        System.out.println("El resultado de la suma es: " + resultado);
    }
}


