/*
 Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
 */
package Servicios;

import Entidad.Curso;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class CursoServicios {
    
    Scanner leer = new Scanner(System.in);
    Curso Cursos = new Curso();
    
     public void cargarAlumnos(){
        
        String[] nombre = new String[5];
        
        System.out.println("Ingrese el nombre del alumno a registrar");
        
        for (int i = 0; i < 5; i++) {
            nombre[i]=leer.next();   
        }
        Cursos.setAlumnos(nombre);
        
          
    }
     
    public Curso crearCurso() {
        
        System.out.println("Ingrese el nombre del Curso");
        Cursos.setNombreCurso(leer.next());
        
        System.out.println("Indique la cantidad de horas que cursan por día");
        Cursos.setCantidadHorasPorDia(leer.nextDouble());
        
        System.out.println("Ingrese la cantidad de días que cursan por semana");
        Cursos.setCantidadDiasPorSemana(leer.nextInt());
        
        do{
              System.out.println("Ingrese el turno correspondiente, M = mañana y T = tarde");
              Cursos.setTurno(leer.next());
        }while(!Cursos.getTurno().equalsIgnoreCase("m") && !Cursos.getTurno().equalsIgnoreCase("t"));
      
        System.out.println("Ingrese el monto por hora catedra");
        Cursos.setPrecioPorHora(leer.nextDouble());
        
        cargarAlumnos();
        System.out.println("Arreglo alumnos: " + Arrays.toString(Cursos.getAlumnos()));
        
         return Cursos;
    }
    
   public void calcularGananciaSemanal() {
       
       
        double gananciaSemanal = ((Cursos.getPrecioPorHora() * Cursos.getCantidadHorasPorDia()) * Cursos.getCantidadDiasPorSemana()) * 5;
        
        
        System.out.println("La ganancia total por semana es de: " + gananciaSemanal);
        
        
       
   }
    
    
    
}
