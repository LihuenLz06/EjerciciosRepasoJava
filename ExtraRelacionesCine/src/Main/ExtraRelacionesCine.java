
package Main;


import Entidades.Cine;
import Servicios.Servicio;
import java.util.ArrayList;

public class ExtraRelacionesCine {

   
    public static void main(String[] args) {
      Servicio servicio = new Servicio();  
      servicio.cargarPelicula(); 
      
      Cine lugarAsignado = new Cine();
      
        ArrayList<String> asientos = lugarAsignado.asientos;
     /* if (lugarAsignado.ubicarEspectador()) {
                    System.out.println(cine.mostrarSala(asientos));
                }
*/    }
}
