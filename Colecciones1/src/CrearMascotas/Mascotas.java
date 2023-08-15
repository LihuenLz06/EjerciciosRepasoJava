/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.*/
package CrearMascotas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Mascotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in).useDelimiter("\n");  
        
      List<String> razas = new ArrayList();
      
      String respuesta;
      
      do {
          System.out.println("Ingrese la raza de su perro");
          razas.add(sc.next());
          System.out.println("Desea cargar otra raza de perro?");
          respuesta = sc.next();
          
      }while (respuesta.equalsIgnoreCase("si"));
     
        System.out.println("Las razas cargadas hasta el momento son: ");
      
        for (String raza : razas) {
            System.out.println(raza);
        }
        
        System.out.println("Desea buscar una raza en la lista para eliminarlo?");
        respuesta = sc.next();
        
       String raz;
        int cont = 0;
        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Que raza desea eliminar?");
            raz = sc.next();
            Iterator <String> iterator = razas.iterator(); //Puede o no ir con el tipo de dato entre <>.
         
            while(iterator.hasNext()){
                if (iterator.next().equals(raz)) {
                    cont++;
                    iterator.remove();
                }
                
            }
            
        }
        if (cont == 0) {
            System.out.println("La raza elegida no se encontró en la lista");
        }
        Collections.sort(razas);
        
        System.out.println("Lista nueva: ");
        for (String raza : razas) {
            System.out.println(raza);
        }
    }
    
}
