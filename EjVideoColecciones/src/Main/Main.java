/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicios.Metodos;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Metodos servMasc = new Metodos();
        
        //servMasc.crearMascota();
        
        servMasc.fabricaLuz(5);
        servMasc.fabricaMilanga(5);
        
        servMasc.mostrarMascota();
        
    }
    
}
