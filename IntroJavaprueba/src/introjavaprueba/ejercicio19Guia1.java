package introjavaprueba;

import java.util.Scanner;

public class ejercicio19Guia1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 3;
        int min = -1;
        int max = 2;
        int rango = max - min;
        int contador = 0;
        int cantDeValidaciones = n * (n-1);

        int[][] matriz = new int[n][n];
        int[][] matrizT = new int[n][n];

        int i, j;

        for (i = 0; i < matriz[0].length; i++) {
            for (j = 0; j < matriz[1].length; j++) {
                if (j == i) {
                    matriz[i][j] = 0;
                } else {
                    matriz[i][j] = (int) (Math.random() * rango) + min;
                    if (matriz[i][j] == 0) {
                        matriz[i][j] += 1;
                    }

                }

            }
        }
        //Llenando la matriz Traspuesta

        for (i = 0; i < matrizT[0].length; i++) {
            for (j = 0; j < matrizT[1].length; j++) {
                if (j == i) {
                    matrizT[i][j] = 0;
                } else {
                    matrizT[i][j] = matriz[j][i];

                }

            }
        }

        System.out.println("\nMatriz A:");


        for (i = 0; i < matriz[0].length; i++) {
            for (j = 0; j < matriz[1].length; j++) {

                if (i >= 0 && j == 0 && matriz[i][j] >= 0 && matriz[i][j] <= 9) {
                    System.out.print("  " + matriz[i][j] + " ");
                } else if (i >= 0 && j == 0 && matriz[i][j] >= -9 && matriz[i][j] <= -1) {
                    System.out.print(" " + matriz[i][j] + " ");
                } else if (matriz[i][j] >= 10 && matriz[i][j] <= 99) {
                    System.out.print(" " + matriz[i][j] + " ");
                } else if (matriz[i][j] >= -9 && matriz[i][j] <= -1) {
                    System.out.print(" " + matriz[i][j] + " ");
                } else if (matriz[i][j] >= 0 && matriz[i][j] <= 9) {
                    System.out.print("  " + matriz[i][j] + " ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }

            }
            System.out.println("");
        }

        System.out.println("\nMatriz A Traspuesta:");

        for (j = 0; j < matrizT[1].length; j++) {
            for (i = 0; i < matrizT[0].length; i++) {

                if (i >= 0 && j == 0 && matrizT[j][i] >= 0 && matrizT[j][i] <= 9) {
                    System.out.print("  " + matrizT[j][i] + " ");
                } else if (i >= 0 && j == 0 && matrizT[j][i] >= -9 && matrizT[j][i] <= -1) {
                    System.out.print(" " + matrizT[j][i] + " ");
                } else if (matrizT[j][i] >= 10 && matrizT[j][i] <= 99) {
                    System.out.print(" " + matrizT[j][i] + " ");
                } else if (matrizT[j][i] >= -9 && matrizT[j][i] <= -1) {
                    System.out.print(" " + matrizT[j][i] + " ");
                } else if (matrizT[j][i] >= 0 && matrizT[j][i] <= 9) {
                    System.out.print("  " + matrizT[j][i] + " ");
                } else {
                    System.out.print(matrizT[j][i] + " ");
                }
            }
            System.out.println("");
        }

        for (i = 0; i < matrizT[0].length; i++) {
            for (j = 0; j < matrizT[1].length; j++) {
                if (i != j) {
                    if (matriz[i][j] == (matrizT[i][j] * -1)) {

                        contador++;
                    }

                    System.out.println("Matriz " + matriz[i][j] + " i: " + i + " j " + j);
                    System.out.println("MatrizT " + matrizT[i][j] + " i: " + i + " j " + j);
                }
            }
        }
        if (contador == cantDeValidaciones) {
            System.out.println("Es una matriz anti simétrica");
        }
        System.out.println(contador);
    }
}
