/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class ej18 {

    /**Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int [4][4], matriztrans= new int [4][4];        
    Rellenar(matriz);
    Imprimir(matriz);
    Trasprellenar(matriz, matriztrans);
    Trasnueva(matriztrans);
    }

    private static void Rellenar(int[][] matriz) {
        Random ran = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz [i][j] = ran.nextInt(10);
            }
        }
    }

    private static void Imprimir(int[][] matriz) {
        System.out.println("Esta es la matriz original: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {   
                System.out.print(matriz[i][j]+ " " + "\t");
            } System.out.println(); 
        }  
    }

    private static void Trasprellenar(int[][] matriz,int[][]matriztrans) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) { 
             matriztrans[i][j] = matriz[j][i];
            }
    }
    
}

    private static void Trasnueva(int[][] matriztrans) {
        System.out.println("Esta es la nueva matriz: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {   
                System.out.print(matriztrans[i][j]+ " " + "\t");
            } System.out.println(); 
        }  
    }
}