
package List_LinkedyArrays_DifySim;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class List_collections {
    
    public static void main(String[] args){
    
    List<Persona> listaArrays = new ArrayList<Persona>();
    
    listaArrays.add(new Persona (1, "Lihuen", 29));
    listaArrays.add(new Persona (2, "Eluney", 10));
    listaArrays.add(new Persona (3, "Ezequiel", 30));
    listaArrays.add(new Persona (4, "Andres", 37));
    
    List<Persona> listaLinked = new LinkedList<Persona>();
    
    listaLinked.add(new Persona (1, "Lihuen", 29));
    listaLinked.add(new Persona (2, "Eluney", 10));
    listaLinked.add(new Persona (3, "Ezequiel", 30));
    listaLinked.add(new Persona (4, "Andres", 37));
    
    //Remover en ArrayList
    listaArrays.remove(0);
    
    //Remover en LinkedList
    String borrarPersona = "Lihuen";
        for (Persona persona1 : listaLinked) {
            if (persona1.getNombre().equalsIgnoreCase(borrarPersona)) {
                listaLinked.remove(persona1);
                break; //corto el recorrido por la lista una vez que encuentra el nombre.
            }
        }
        
        System.out.println("--------LUEGO DE ELIMINAR-------");
        
        //RECORRIDO POR FOREACH
        System.out.println("--------ARRAYLIST-------");
        for (Persona persona : listaArrays) {
            System.out.println("prueba: " + persona.getNombre());
        }
        
        System.out.println("--------LINKEDLIST-------");
        for (Persona persona : listaLinked) {
            System.out.println("prueba: " + persona.getNombre());
        }
        
        //Tamaño de lista
        System.out.println("------Que tamaño tienen las Listas?-----");
        System.out.println("ArrayList: " + listaArrays.size());
        System.out.println("LinkedList: " + listaLinked.size());
        
        //Obtener el primer objeto
        System.out.println("----Primer y Ultimo Objeto(Solo para LINKEDLIST)----");
        //System.out.println("Primero de LinkedList: " + listaLinked.getFirst().toString());
        //System.out.println("Ultimo de LinkedList: " + listaLinked.getLast().toString());
        //Ver porque First y Last marcan error.
        
        //Borrar toda la Lista
        System.out.println("-------BORRAR LISTAS-------");
        listaArrays.clear();
        listaLinked.clear();
        
        //Comprobar si está vacia
        System.out.println("---------Esta vacía alguna lista?-------");
        System.out.println("ArrayList: " + listaArrays.isEmpty());
        System.out.println("LinkedList: " + listaLinked.isEmpty());
        //Is Empty es como si preguntara si está vacia y devuelve la respuesta True or Fallse.
    }
    }
    
    

