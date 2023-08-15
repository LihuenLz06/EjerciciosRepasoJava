package Entidades;

import Servicios.Servicio;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Julian_Velasco
 */
public class Cine extends Espectador{
    private double precio;
    private Pelicula pelicula;
    private char[][] sala = new char[8][6];
    private int filas = 8;
    private int columnas = 6;
    public String valor="";
    public ArrayList<String> asientos = new ArrayList();

    public Cine() {
    }

    public Cine(double precio, Pelicula pelicula) {
        this.precio = precio;
        this.pelicula = pelicula;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sala[i][j] = ' ';
            }
        }
    }

    public double getPrecio() {
        return precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }
    
    
    public boolean ubicarEspectador(Espectador espectador) {

    int fila = (int) (Math.random() * filas);
    int columna = (int) (Math.random() * columnas);

    while (sala[fila][columna] != ' ') {
        fila = (int) (Math.random() * filas);
        columna = (int) (Math.random() * columnas);
        
    }

    if (espectador.getDinero() >= precio && espectador.getEdad() >= pelicula.getEdadMinima()) {
        sala[fila][columna] = 'X';
        
        return true;
    }

    return false;
}

    public void mostrarSala() {
        char asiento;
        int cont=0;
        
        for (int i = filas - 1; i >= 0; i--) {
            for (int j = 0; j < columnas; j++) {
                asiento = (char) ('A' + j);
                 asientos.add((1 + i) + String.valueOf(asiento));
                System.out.print("(" + (i + 1) + (char) ('A' + j) + ") " + sala[i][j] + " ");

            }
            System.out.println();
        }
        System.out.print("  ");
        System.out.println();
        System.out.println("");

        /* for (int i = 0 ; i > 8; i++) {
            for (int j = 0; j < 4; j++) {
                cont++;
                if(sala[i][j]=='X'){
                    System.out.println(asientos.get(cont));
                }
            }
        }*/
      
    } 

   
}