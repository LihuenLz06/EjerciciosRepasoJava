
package Main;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class PracticasCollections {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
      byte opcion;
        ArrayList<Integer> numerosA = new ArrayList();
       int x = 20, y = 3, g = 8;
       numerosA.add(x);
       numerosA.add(y);
       numerosA.add(g);
       //Ordenarla= Listas
       Collections.sort(numerosA);
       
       HashSet<Integer> numerosB = new HashSet();
       Integer u = 2, z = 333, o = 8;
       numerosB.add(u);
       numerosB.add(z);
       numerosB.add(o);
       //Ordenarla= conjunto. Primero comvierto a lista y despues ordeno
       ArrayList<Integer> numerosBlista = new ArrayList(numerosB);
       Collections.sort(numerosBlista);
       
       
       //Iterator creacion y muestra de elementos (Para mostrar no hace falta especificar el tipo de dato en la creación del objeto iterator)
       Iterator  iterator = numerosA.iterator();
       
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }
       //Eliminar con iterator (Para eliminar si hay que especificar el tipo de dato en la creacion del iterator)
       Iterator <Integer> iter = numerosB.iterator();
       
       while (iter.hasNext()){
           if (iter.next() == 3) {
               iter.remove();
           }
       }
       
      do{  
           System.out.println("Ingrese la opcion que desea ver: numerosA = opcion 1, numerosB = opcion 2");
        opcion = sc.nextByte();
        switch (opcion) {
            case 1: 
                for (Integer numA : numerosA) {
                    System.out.println("Los numeros A son: " + numA);
                }
                break;
            case 2:   
                for (Integer numB : numerosB) {
                    System.out.println("Los numeros B son: " + numB);
                }
                break;
            default: 
                System.out.println("La opcion es incorrecta! Ingrese otra opcion");
                break;
        }
    }while(opcion != 1 && opcion != 2);
      
      //Formato de Escritura de mapas
      Map <String, Integer> mapa = new HashMap();
       Map <Integer, String> treemap = new TreeMap();
       Map <Integer, String> listaMapa = new LinkedHashMap();
       
 
       
       /*HashMap<Integer, String> alumnos = new HashMap();
       int dni1 = 3751815, dni2 = 39007654, dni3 = 36518905;
       String nombre1 = "Lihuen", nombre2 = "Pepe", nombre3 = "Alberto";
       alumnos.put(dni1, nombre1);
       alumnos.put(dni2, nombre2);
       alumnos.put(dni3, nombre3);
       
        for (Integer clave : alumnos.keySet() ) {
            
           // Integer valor = alumnos.get(dni1);
            //System.out.println("La clave " + clave + "tiene el valor" + valor);
            //Ver como se hace esta parte de arriba comentada
        } */
  
    }
    
}
