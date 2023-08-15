/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8poo;

import Entidad.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ej8Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CadenaServicio cadS = new CadenaServicio();
        Cadena cad1 = cadS.crearCadena();
        String letraBus;
        
        cadS.mostrarVocales();
        cadS.invertirFrase();
        cadS.vecesRepetido();
        cadS.compararLongitud();
        cadS.unirFrases();
        
        
        System.out.println("Ingrese una letra para buscar en la frase");
        letraBus = leer.next();
        cadS.contiene(letraBus);
    }
    
}
