
package Stack_Pila;

import java.util.Stack;


public class EjemploStack {
    
    public static void main(String[] args){
        
        Stack<Integer> pila = new Stack<Integer>();
        
        System.out.println("Pila vacia: " + pila);
        System.out.println("Está vacía? " + pila.isEmpty());
        
        //agregar
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        
        //recorrido
        for (Integer pilita : pila) {
            System.out.println(pilita);
        }
        
        //mostrar
        System.out.println("Pila: " + pila);
        System.out.println("Pila vacía? " + pila.isEmpty());
        
        pila.pop(); //Elimina el último registro que entró
        
        System.out.println("Está el tres? " + pila.search(3)); //Busca un elemento en particular especificado, funciona con un elemento no con objetos.
        //search en vez de devolver true or false, devuelve un numero positivo si esta el elemento y un numero negativo si no está.
        System.out.println("Ultimo agregado: " + pila.peek()); //Muestra el ultimo agregado
        
    }
    
}
