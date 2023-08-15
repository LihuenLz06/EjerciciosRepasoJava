
package Main;

import java.util.ArrayList;

public class MainPracticas {

   /* public static void main(String[] args) { //Relación uno a uno.
        
        Persona persona = new Persona();
        persona.setNombre("Lihuen");
        persona.setApellido("Lorenzo");
        
        PersonaDni dni = new PersonaDni();
        dni.setLetra('A');
        dni.setNumero(37518105);
        
        persona.setDni(dni);
        
        System.out.println("La persona es: " + persona.toString());
     
    } */
    
     public static void main(String[] args) { //Relación uno a muchos.
        
        Jugador jugador1 = new Jugador("Pepe", "Garcia", 3, 1);
        Jugador jugador2 = new Jugador("Gonzalo", "Luciem", 1, 2);
        Jugador jugador3 = new Jugador("Armando", "Gomez", 2, 3);
        
        ArrayList<Jugador> jugadores = new ArrayList();
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        jugadores.add(jugador3);
        
        Equipo equipo1 = new Equipo();
        equipo1.setJugadores(jugadores);
         
        System.out.println("El equipo 1 es : " + equipo1.toString());
     
    }
}
