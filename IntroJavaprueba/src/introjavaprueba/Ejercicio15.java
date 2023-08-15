/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaprueba;

/**
 *
 * @author usuario
 */
public class Ejercicio15 {

    public static void main(String[] args) {

        int[] vector = new int[100];
        int i;
        for (i = 0; i < vector.length; i++) {

            vector[i] = i + 1;
        }

        for (i = vector.length -1; i >= 0; i--) {
            System.out.print("[" + vector[i] + "]");
            if (vector[i] > 1) {
                System.out.print("; ");
            } else {
                if (vector[i] == 1) {
                    System.out.println(".");

                }
            }

        }

    }
}
