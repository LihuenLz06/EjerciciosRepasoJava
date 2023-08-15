
package Logica;


public class Bolbasor extends Pokemon implements IPlanta{

    public Bolbasor() {
    }
    
    

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bolbasor y este es mi ataque Placaje!"); 
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Bolbasor, este es mi ataque Arañazo!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Bolbasor, este es mi ataque Mordisco!");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bolbasor y este es mi ataque Drenaje!");  
    }

    @Override
    public void atacarParalizar() {
         System.out.println("Hola soy Bolbasor y este es mi ataque Paralizante!"); 
    }
    
}
