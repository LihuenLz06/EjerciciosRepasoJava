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
public class Ej5extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double descuento = 0;
        double saldoApagar = 0;
        System.out.println("Ingrese el valor del tratamiento a realizar");
        double costoTrat = leer.nextDouble();
        System.out.println("Ingrese su categoria de socio: A,B,C");
        String categoria = leer.nextLine();

        while (!categoria.equalsIgnoreCase("a") || !categoria.equalsIgnoreCase("b") || !categoria.equalsIgnoreCase("c")) {

            System.out.println("Error la letra ingresada es inválida, ingresela nuevamente");
            categoria = leer.nextLine();
        }
         switch (categoria) {
            case "A":
                System.out.println("El descuento es de: $" + (costoTrat * 0.5));
                break;
            case "B":
                System.out.println("El descuento es de: " + (costoTrat * 0.38));
                break;
            case "C":
                System.out.println("El descuento es de: " + (costoTrat * 0.86));
                break;
        }
         
         if (categoria.equalsIgnoreCase("a")) {
             System.out.println("Saldo a pagar por el tratamiento: : " + (costoTrat * 0.50));
            
        }else if (categoria.equalsIgnoreCase("b")){
            descuento = costoTrat * 0.38;
            saldoApagar = costoTrat - descuento;
             System.out.println("Saldo a pagar por el tratamiento: " + saldoApagar);
            
                    }else if (categoria.equalsIgnoreCase("c")){
            descuento = costoTrat * 0.86;
            saldoApagar = descuento - costoTrat;
             System.out.println("Saldo a pagar por el tratamiento: " + saldoApagar);            
                    }

    }
}
