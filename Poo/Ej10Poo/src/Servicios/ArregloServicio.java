/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Arreglos;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class ArregloServicio {
    public Arreglos crearArreglos(){
        Arreglos arreglos = new Arreglos();
        double []arregloAux = new double[50];
        //con el Big rellena con dos cemales, ordenado.
        BigDecimal big1;
        double numero = 0;
        for (int i=0; i<50; i++){
            big1 = new BigDecimal(Math.random()*100);
            numero = big1.setScale(2,RoundingMode.DOWN).doubleValue();
            arregloAux[i] = numero;
        }
        arreglos.setArregloA(arregloAux);
        System.out.println("El arreglo original es:" + Arrays.toString(arregloAux));
        return arreglos;
    }
    
    public void ordenarArreglo(Arreglos arreglos){
        Arrays.sort(arreglos.getArregloA());
        System.out.println("\n el arreglo original es:" + Arrays.toString(arreglos.getArregloA()));
    }
    
    public void crearArregrlo2 (Arreglos arreglos){
        double[] arregloAux2 = new double[20];
       /* for (int i=0;i<20;i++){
             if (i<10){
                 aux[i]=one.getArray()[i];
             }else 
                 aux[i]=0.5;*/

        Arrays.fill(arregloAux2,10,arregloAux2.length,0.5);
        for (int i = 0; i < 10; i++) {
            arregloAux2[i]=arreglos.getArregloA()[i];
            
        }
        arreglos.setArregloB(arregloAux2);
        System.out.println("\n el arreglo dos:" + Arrays.toString(arreglos.getArregloB()));
    }
}
