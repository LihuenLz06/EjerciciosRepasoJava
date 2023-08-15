
package Logica;

public class Scuartul extends Pokemon implements IAgua{

    public Scuartul() {
    }
    
    
    @Override
   protected void atacarPlacaje() {
        System.out.println("Hola soy Scuartul y este es mi ataque Placaje!"); 
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Scuartul, este es mi ataque Arañazo!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Scuartul, este es mi ataque Mordisco!");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola soy Scuartul y este es mi ataque Hidrobomba!"); 
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Scuartul y este es mi ataque Burbuja!"); 
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy Scuartul y este es mi ataque Pistola de Agua!"); 
    }
    
}
