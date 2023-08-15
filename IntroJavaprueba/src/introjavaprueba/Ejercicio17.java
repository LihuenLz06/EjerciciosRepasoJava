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
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor, ingrese el tamaño del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        
           int min = 1;
        int max = 99999;
        int rango = max - min;
        
        for (int i = 0; i <= n - 1; i++) {
            vector[i] = (int)(Math.random()*rango)+1;
           System.out.println("[" + vector[i] + "]");
        }
       
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
       
        
        for (int i = 0; i <= n - 1 ; i++) {
            if (vector[i] >= 0 && vector[i] < 10){
                cont1++;
            } else if (vector[i] >= 9 && vector[i] < 100){
                cont2++;
            } else if (vector[i] >= 99 && vector[i] < 1000){
                cont3++;
            } else if (vector[i] >= 999 && vector[i] < 10000){
                cont4++;
            } else if (vector[i] >= 9999 && vector[i] < 100000){
                cont5++;
            }
        }
        System.out.println("Su vector posee:");
        System.out.println(cont1 + " numeros de 1 digito");
        System.out.println(cont2 + " numeros de 2 digitos");
        System.out.println(cont3 + " numeros de 3 digitos");
        System.out.println(cont4 + " numeros de 4 digitos");
        System.out.println(cont5 + " numeros de 5 digitos");
       
    }
    
}
