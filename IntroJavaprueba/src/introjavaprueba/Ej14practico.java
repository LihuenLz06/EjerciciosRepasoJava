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
public class Ej14practico {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor a convertir");
        double valor = leer.nextDouble();
        System.out.println("Elija el tipo de moneda: Dolar, Yen, Libra");
        String opc = leer.next();
        
        conversorMoneda(valor, opc);
    }

    public static void conversorMoneda(double valor, String opc) {

        switch (opc) {
            case "Dolar":
                System.out.println("El valor de conversion es: " + (valor * 1.28611));
                break;
            case "Yen":
                System.out.println("El valor convertido es: " + (valor * 129.852));
                break;
            case "Libra":
                System.out.println("El valor convertido es: " + valor * 0.86);
                break;
        }

    }
}
