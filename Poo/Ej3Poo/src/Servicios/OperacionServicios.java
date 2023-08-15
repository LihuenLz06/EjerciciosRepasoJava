/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class OperacionServicios {
    
    public Operacion crearOperacion(){
        Scanner leer = new Scanner(System.in);
        
        Operacion op = new Operacion();
        
                
        System.out.println("Ingrese el primer numero");
        op.setNum1(leer.nextDouble());
        System.out.println("Ingrese el segundo numero");
        op.setNum2(leer.nextDouble());
                
        return (op);
    }
    
    public void sumar(Operacion op){
        
        double suma;
        suma = op.getNum1() + op.getNum2();
        
        System.out.println("La suma de los dos numeros es: " + suma);
        
    }
    public void restar(Operacion op){
        
        double resta;
        if (op.getNum1() > op.getNum2()){
        resta = op.getNum1() - op.getNum2();
        }else{
         resta = op.getNum2() - op.getNum1();
        }
               
        System.out.println("La suma de los dos numeros es: " + resta);
        
    }
     public void multiplicar(Operacion op){
        
        double mult = 0;
        if (op.getNum1() == 0 && op.getNum2() == 0){
            System.out.println("El resultado es 0, error, todo numero multiplicado por 0 da 0, la operación no tiene sentido");
        }else{
          mult = op.getNum1() * op.getNum2();
        }
        
        System.out.println("La suma de los dos numeros es: " + mult);
        
    }  
     public void dividir(Operacion op){
        
        double div;
        if (op.getNum1() > op.getNum2()){
        div = op.getNum1() / op.getNum2();
        }else{
         div = op.getNum2() / op.getNum1();
        }
               
        System.out.println("La suma de los dos numeros es: " + div);
        
    } 
}
