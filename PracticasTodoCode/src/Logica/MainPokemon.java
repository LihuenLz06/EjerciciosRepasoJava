
package Logica;

public class MainPokemon {

   
    public static void main(String[] args) {
       
        Scuartul scuartul = new Scuartul();
        Charmander charmander = new Charmander();
        Bolbasor bolbasor = new Bolbasor();
        Picachu picachu = new Picachu();
        
        scuartul.atacarAraniazo();
        scuartul.atacarHidrobomba();
        charmander.atacarAraniazo();
        charmander.atacarLanzallamas();
        bolbasor.atacarAraniazo();
        bolbasor.atacarDrenaje();
        picachu.atacarAraniazo();
        picachu.atacarImpactrueno();
        
    }
    
}
