package Ej3Ex;

import java.util.Scanner;


public class DivisionNumero {
     public static void main(String[] args) {
         
         Scanner sc = new Scanner(System.in);
         
         String num1, num2;
         
         System.out.println("Ingrese el numero 1");
         num1 = sc.next();
         System.out.println("Ingrese el numero 2");
         num2 = sc.next();
         
         int n1 = Integer.parseInt(num1);
         int n2 = Integer.parseInt(num2);
         int resultado = 0;
         try {
              resultado = n1/n2;
         } catch (ArithmeticException e) {
             System.out.println(e.getMessage());
             resultado = n2/n1;
         } catch (Exception a) {
             System.out.println(a);
         }
}
}
