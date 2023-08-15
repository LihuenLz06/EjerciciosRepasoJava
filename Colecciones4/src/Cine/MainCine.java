/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine;

import Servicios.PeliculasServicio;

/**
 *
 * @author usuario
 */
public class MainCine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println( numeroMayor(5,8));
        PeliculasServicio ps = new PeliculasServicio();
        
        
        ps.menuPeliculas();
        
    }
    
    public static int numeroMayor(int num1, int num2){
        return num1 > num2?num1:num2;
    } // return condicional 
}
