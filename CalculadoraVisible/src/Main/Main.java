/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicios.MetodosControladores;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MetodosControladores control = new MetodosControladores();
        control.iniciarVentana();
        
        
    }
    
   /* Como usar try cach, comparacion con la funcion de if
    boolean luzverde = false;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("ingrese un numero");
                int num1 = sc.nextInt(), num2 = sc.nextInt();
                int resultado = num1 / num2;
                System.out.println("Su resultado es " + resultado);
                luzverde = true;
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("No puede dividir por cero! Vuelva a intentarlo");
            }
        } while (!luzverde);

        do{
        Scanner sc = new Scanner(System.in);
            System.out.println("ingrese un numero");
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        int resultado;
        if (num2 == 0){
            System.out.println("No se puede dividir por 0!");
        }else{
            resultado = num1/num2;
            luzverde = true;
        }
        }while(!luzverde);
    } */
    
}
