/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2poo;

import Entidades.Circunferencia;
import Servicios.CircunferenciaServicios;

/**
 *
 * @author usuario
 */
public class Ej2Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       CircunferenciaServicios cs = new CircunferenciaServicios();
        
       Circunferencia c1 = cs.crearCircunferencia();
       Circunferencia c2 = cs.crearCircunferencia();
                
       cs.area(c1);
       cs.perimetro(c1);
       cs.area(c2);
       cs.perimetro(c2);
       
    }
    
}
