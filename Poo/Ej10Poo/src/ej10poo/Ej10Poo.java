/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10poo;

import Entidad.Arreglos;
import Servicios.ArregloServicio;

/**
 *
 * @author usuario
 */
public class Ej10Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArregloServicio cs = new ArregloServicio();
        Arreglos AR = cs.crearArreglos();
        cs.ordenarArreglo(AR);
        cs.crearArregrlo2(AR);
    }
    
}
