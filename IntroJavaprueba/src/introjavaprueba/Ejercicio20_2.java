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
public class Ejercicio20_2 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

       int[][] matriz = {{2,7,6}, {9,5,1}, {4,3,8}};

      int f=0, c=0, d1=0, d2=0, contf=0, contc=0,contd=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println(" ");

        }
     
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               f += matriz[i][j];
               c += matriz[i][j];
               if (i == j) d1 += matriz[i][j];
               if (i+j == 2) d2 += matriz[i][j]; 
            }
            if (f == 15){
                contf++;
                f = 0;
            }
            if (c == 15){
                contc++;
                c = 0;
            }
        }
        if (d1 == 15 && d2 == 15){
                contd+=2;
            }
         
        boolean magica = contf == 3 && contc == 3 && contd == 2;
        
        if (magica = true){
             System.out.println("El cuadrado es mágico");
        }else{
             System.out.println("El cuadrado no es mágico");
        }
        }   
    }

