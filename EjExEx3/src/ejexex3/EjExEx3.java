/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejexex3;

import Servicios.PassServicios;

/**
 *
 * @author usuario
 */
public class EjExEx3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PassServicios claveAux = new PassServicios();
        
        claveAux.crearPass();
        claveAux.analizarPass();
    }
    
}
