
package Logica;

// Como me doy cuenta cuando usar una clase abstracta o una interface?
// Clase Abstracta: Atributos, caracteristicas, metodos en general, que es?
// Interface: Acciones, metodos particulares, que puede hacer, que hace?

public abstract class Pokemon {
    
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;
    
    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();
   
    
}
