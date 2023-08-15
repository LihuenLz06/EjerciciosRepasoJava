
package Excepciones;


public class EjemploExcep {
    
    public static void main(String[] args){
        
        try {
            int resultado = 3/0;
        }
        catch (Exception e){
            System.out.println("No se puede dividir por cero!!!");
        }
        
        
        int edades [] = {15, 12, 23, 30};
        try{
        System.out.println("La edad de la posición 4 es: " + edades[4]);
    }
        catch(Exception e){
            System.out.println("Intentaste acceder a un indice que no existe");
        }
        // Esto se usa mucho en los momentos en los que el programa interactua con el usuario para advertir del error sin que salga como que "se rompe el sistema"
    }


    
}
