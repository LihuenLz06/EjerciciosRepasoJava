/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3poo;

import Entidad.Operacion;
import Servicios.OperacionServicios;



/**
 *
 * @author usuario
 */
public class Ej3Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        OperacionServicios ops = new OperacionServicios();
       
        Operacion op1 = ops.crearOperacion();
        
       
        ops.sumar(op1);
        ops.restar(op1);
        ops.multiplicar(op1);
        ops.dividir(op1);
        
        
    }
    
}
