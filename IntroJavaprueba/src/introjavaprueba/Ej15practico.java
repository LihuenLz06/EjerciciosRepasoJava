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
public class Ej15practico {
   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int[] vector = new int[100]; 
        
         int i;
       for ( i = 0; i < vector.length; i++) {
           vector[i] = i + 1;         
       }
        for ( i = vector.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(vector[i] + ". ");
            }else{
             System.out.println(vector[i] + ", ");      
            }    
       }
        System.out.println("");
   }
   
   }
   
    

