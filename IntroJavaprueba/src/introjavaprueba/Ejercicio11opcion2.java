
package introjavaprueba;

import java.util.Scanner;


public class Ejercicio11opcion2 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros positivos");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int opinion;
        String respuesta = "a";
        do{
            System.out.println("Si quieres SUMAR digite 1, RESTAR 2, MULTIP 3, DIVIDIR 4 y SALIR 5");
            opinion = leer.nextInt();
            switch(opinion){
                case 1:
                    System.out.println("La suma de los dos numeros es " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de los dos numeros es " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de los dos numeros es " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La division de los dos numeros es " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Si estas seguro de salir preciona S");
                    respuesta = leer.next();
                    
            }
        }while((opinion != 5) || (!respuesta.equalsIgnoreCase("S")));
        
    }
    
}
