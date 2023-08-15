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
public class Ej13practico {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num;
        int i, j;
        System.out.println("Ingrese un tamaño");
        num = leer.nextInt();
        for (i = 0; i < num; i++) {
            for (j = 0; j < num; j++) {
                if (i == 0 || i == num - 1) {
                    System.out.print(" * ");
                }else if (j == 0 || j == num - 1) {
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }   
            }
            System.out.println("");
        }
    }
}