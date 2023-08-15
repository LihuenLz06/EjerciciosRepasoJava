
package Logica;


public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }
    
    

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Charmander y este es mi ataque Placaje!"); 
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Charmander, este es mi ataque Arañazo!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Charmander, este es mi ataque Mordisco!");
    }

    @Override
    public void atacarPuniofuego() {
         System.out.println("Hola soy Charmander y este es mi ataque Puño de Fuego!"); 
    }

    @Override
    public void atacarLanzallamas() {
         System.out.println("Hola soy Charmander y este es mi ataque Lanza Llamas!"); 
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy Charmander y este es mi ataque Ascuas!"); 
    }
    
}
