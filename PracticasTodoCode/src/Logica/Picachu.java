
package Logica;

public class Picachu extends Pokemon implements IElectrico{

    public Picachu() {
    }
    

    @Override
   protected void atacarPlacaje() {
        System.out.println("Hola soy Picachu y este es mi ataque Placaje!"); 
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Picachu, este es mi ataque Arañazo!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Picachu, este es mi ataque Mordisco!");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola soy Picachu y este es mi ataque Impac Trueno!"); 
    }

    @Override
    public void atacarPuniotrueno() {
         System.out.println("Hola soy Picachu y este es mi ataque Puño de Trueno!"); 
    }
    
    
    
}
