/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej14poo;

import Entidad.Movil;
import Servicios.MovilServicios;

/**
 *
 * @author usuario
 */
public class Ej14Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MovilServicios celAux = new MovilServicios();
        
        Movil cel1 = celAux.cargarCelular();
        Movil cel2 = celAux.cargarCelular();
        
        celAux.cargarCodigo(cel1);
        celAux.cargarCodigo(cel2);
    }
    
}
