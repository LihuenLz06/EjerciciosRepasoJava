/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej7Poo;

import java.util.Scanner;


public class Ejercicio7 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        PersonaService perserv = new PersonaService();
        Persona[] pers = new Persona[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("REGISTRE PERSONA " + (i + 1));
            pers[i] = perserv.crearPersona();

        }
        double pesob = 0, peson = 0, speso = 0;
        double cant = pers.length;
        int opcion = 0;

        do {
            System.out.println("seleccione la opcion de su preferencia?\n"
                    + "1. evalucion de peso\n2.validar mayoria de edad"
                    + "\n3. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("EVALUACION");
                    for (int i = 0; i < 2; i++) {

                        if (perserv.calcularIMC(pers[i]) == -1) {
                            pesob++;
                        } else if (perserv.calcularIMC(pers[i]) == 0) {
                            peson++;

                        } else if (perserv.calcularIMC(pers[i]) == 1) {
                            speso++;
                        }
                    }
                    System.out.println("el porcentaje de personas con IMC bajo es:" + ((pesob / cant) * 100) + " % ");
                    System.out.println("el porcentaje de personas con IMC normal es :" + ((peson / cant) * 100) + " % ");
                    System.out.println("el porcentaje de personas con IMC alto es: " + ((speso / cant) * 100) + " % ");
                    break;
                case 2:
                    double mayor = 0d;
                    double menor= 0d;
                    System.out.println("VALIDACION DE PERSONAS CON MAYORIA DE EDAD");
                    for (int i = 0; i < 2; i++) {
                        if (perserv.esMayorDeEdad(pers[i]) == true) {
                            mayor++;
                            System.out.println("la persona" + (i + 1) + "es mayor de edad");
                        } else {
                            menor++;
                            System.out.println("la persona" + (i + 1) + " es menor de edad");
                        }
                    }
                    System.out.println("el porcentaje de personas mayor de edad son : " + ((mayor / cant) * 100) + " % ");
                    System.out.println("el porcentaje de personas menor de edad son: " + ((menor / cant) * 100) + " % ");
                    break;
            }

        } while (opcion != 3);
    }
}
