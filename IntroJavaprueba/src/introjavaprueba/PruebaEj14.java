/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaprueba;

import java.util.Scanner;

/**
 * Crea una aplicación que a través de una función nos convierta una cantidad de
 * euros introducida por teclado a otra moneda, estas pueden ser a dólares,
 * yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
 * moneda a converir que será una cadena, este no devolverá ningún valor y
 * mostrará un mensaje indicando el cambio (void). El cambio de divisas es: 
 * 0.86 libras es un 1 €
 *  1.28611 $ es un 1 € 
 * 129.852 yenes es un 1 €
 * @author usuario
 */
public class PruebaEj14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de euros a convertir");
        double euros = leer.nextDouble();
        System.out.println("Ingrese la moneda a la que desea convertirlo: libra, yen, dolar");
        String cambio = leer.next();
        convertirMoneda(euros,cambio);
    }
    public static void convertirMoneda(double euros, String cambio) {
        
        switch (cambio.toLowerCase()) {
            case "libra" :
                System.out.println("La cantidad de libras son: " + euros * 0.86);
                break;
            case "yen" :
                System.out.println("La cantidad de yenes son: " + euros * 129.852);
                break;
            case "dolar" :
                System.out.println("La cantidad de dolares son: " + euros *  1.28611);
                break;
        }
    }
}
