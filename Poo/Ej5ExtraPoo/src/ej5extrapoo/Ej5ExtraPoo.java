/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5extrapoo;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ej5ExtraPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
       String meses[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
       String mesSecreto = meses[(int)(Math.random()*12)];
       String mesUsuario;
       int aux = (int)(Math.random()*12);
       int cont = 0;
       do{
           do{
               cont = 0;
           System.out.println("Adivinar el mes Secreto!");
           mesUsuario = leer.next().toLowerCase();
             for (int i = 0; i < 12; i++) {
                    if (!mesUsuario.equalsIgnoreCase(meses[i])) {
                        cont++;
                    }
                }
                if (cont == 12)
                    System.out.println("La palabra ingresada no es un mes");
            } while (cont == 12);
       
           if (!mesUsuario.equals(mesSecreto)) {
               System.out.println("No has acertado... \n Intenta nuevamente!");
           }
       }while(!mesUsuario.equals(mesSecreto));
        System.out.println("Acertaste!!");
       }

    }


