
package Servicios;

import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Pelicula;
import java.util.Scanner;

/**
 *
 * @author Julian_Velasco
 */
public class Servicio {
    Scanner sc = new Scanner(System.in);

        public void cargarPelicula(){
            
        System.out.print("Ingrese el título de la película: ");
        String titulo = sc.nextLine();

        System.out.print("Ingrese la duración de la película (en minutos): ");
        int duracion = sc.nextInt();

        System.out.print("Ingrese la edad mínima requerida para ver la película: ");
        int edadMinima = sc.nextInt();

        System.out.print("Ingrese el nombre del director de la película: ");
        sc.nextLine();
        String director = sc.nextLine();
        
        Pelicula pelicula = new Pelicula(titulo, duracion, edadMinima, director);

        System.out.print("Ingrese el precio de la entrada a la sala de cine: ");
        double precio = sc.nextDouble();

        Cine cine = new Cine(precio, pelicula);
        sc.nextLine();

            System.out.print("Cuantos espectadores deseas ingresar?: ");
            int cantEspectadores = sc.nextInt();
            sc.nextLine();
            int cont =0;
            for (int i = 1; i <= cantEspectadores; i++) {
                System.out.print("Nombre del espectador " + i + ": ");
                String nombre = sc.nextLine();
                System.out.print("Edad del espectador " + i + ": ");
                int edad = sc.nextInt();
                System.out.print("Dinero disponible del espectador " + i + ": ");
                int dinero = sc.nextInt();
                sc.nextLine();
                Espectador espectador = new Espectador(nombre, edad, dinero);
                 if (espectador.getDinero() <= precio && espectador.getEdad() <= pelicula.getEdadMinima()) {
                    System.out.println(espectador.getNombre() + ":" + "Usted no posee ni el dinero ni la edad suficiente. Vuelva a su casa pendejo");
                    cont ++;
                }
                if (cont == 0) {
                    if (espectador.getDinero() <= precio) {
                        System.out.println(espectador.getNombre() + ": " + "Usted no posee el dinero suficiente");

                    } else if (espectador.getEdad() <= pelicula.getEdadMinima()) {
                        System.out.println(espectador.getNombre() + ":" + "Usted no posee la edad suficiente");

                    }

                }
                cine.ubicarEspectador(espectador);
                
              
        }
        cine.mostrarSala();
            
    }       
}