
package PracticaJuegoRelaciones;

import java.util.ArrayList;
import java.util.List;

public class VideoJuegoMain {
    
    public static void main(String[] args){
        
        List <VideoJuegoEntidades> listaVJ = new ArrayList();
        
        VideoJuegoEntidades vj1 = new VideoJuegoEntidades(123, "Banjo Kazooie", "Nintendo 64", 4, "Plataforma");
        VideoJuegoEntidades vj2 = new VideoJuegoEntidades(356, "Mario Party 3", "Nintendo 64", 3, "Plataforma");
        VideoJuegoEntidades vj3 = new VideoJuegoEntidades(871, "Age of Empire II", "PC", 1, "Estrategia");
        VideoJuegoEntidades vj4 = new VideoJuegoEntidades(352, "Counter Strike 1.6", "PC", 2, "Shooter");
        VideoJuegoEntidades vj5 = new VideoJuegoEntidades(101, "Mario Kart 64", "Nintendo 64", 3, "Plataforma");
        
        listaVJ.add(vj1);
        listaVJ.add(vj2);
        listaVJ.add(vj3);
        listaVJ.add(vj4);
        listaVJ.add(vj5);
        
        for (VideoJuegoEntidades juego : listaVJ) {
            System.out.println("Título: " + juego.getTitulo() + " Consola: " + juego.getTipoConsola() +
                    " Cantidad de Jugadores: " + juego.getCantJugadores());
        }
        
        //Para cambiar un dato dentro del objeto directamente pongo el nombre del objeto y seteo el dato a cambiar.
        
        vj1.setTitulo("Banjo Kazooie 3");
        vj1.setCantJugadores(2);
        
        vj4.setTitulo("Counter Strike 2.0");
        vj4.setCantJugadores(4);
        
        for (VideoJuegoEntidades juego : listaVJ) {
            if (juego.getTipoConsola().equalsIgnoreCase("Nintendo 64")) {
                System.out.println(juego.toString());                
            }
        }
        
        
    }
    
}
