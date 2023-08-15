/*
Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
package Servicios;

import Entidad.Movil;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class MovilServicios {
  Scanner leer = new Scanner(System.in);  
    
  public Movil cargarCelular() {
      
      Movil Cel = new Movil();
      
      System.out.println("Ingrese la marca del celular");
       Cel.setMarca(leer.next());
      System.out.println("Ingrese el precio del celular");
       Cel.setPrecio(leer.nextDouble());
      System.out.println("Ingrese el modelo del celular");
       Cel.setModelo(leer.next());
      System.out.println("Ingrese la memoria Ram del celular");
       Cel.setMemoriaRam(leer.nextInt());
      System.out.println("Ingrese la cantidad almacenamiento del celular");
       Cel.setAlmacenamiento(leer.nextInt());
 
     return Cel; 
  }
  
  public void cargarCodigo(Movil Cel) {
      int[] cod = new int[7];
           System.out.println("Ingrese el codigo de barra de 7 digitos");
       for (int i = 0; i < 7; i++) {
          
           cod[7] = leer.nextInt();
      }
       
        Cel.setCodigo(cod);
  } 
}
