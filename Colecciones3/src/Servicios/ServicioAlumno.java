package Servicios;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ServicioAlumno {

    Scanner sc = new Scanner(System.in);
    List<Alumno> alumnos = new ArrayList();

    public void cargarAlumnos() {

        String opcion;

        Alumno aluAux = new Alumno();

        do {

            System.out.println("Desea cargar un nuevo alumno? responda S ó N");
            opcion = sc.next();

            System.out.println("Ingrese el nombre del alumno");
            aluAux.setNombre(sc.next());
            System.out.println("Ingrese las 3 notas del alumno: \n " + aluAux.getNombre());
            for (int i = 0; i < 2; i++) {
                System.out.print("Nota " + (i + 1));
                double nota = sc.nextDouble();
                aluAux.getNotas().add(nota); //Se utiliza get y no set porque la función lo que necesita es traer y tomar la posicion de la nota para luego gurdar el dato en ella
                // Al utilizar get veo y traigo eso que necesito, si uso set estoy tratando de guardarlo en un lugar que no se.
            }
            alumnos.add(aluAux);
        } while (opcion.equalsIgnoreCase("s"));

    }

    public void notaFinal() {
        String nom;

        System.out.println("Ingrese el nombre del alumno que desea buscar");
        nom = sc.next();

        for (Alumno aux : alumnos) {
            if (aux.getNombre().equalsIgnoreCase(nom)) {
                double sum = 0;
                for (double nota : aux.getNotas()) {
                    sum += nota;
                }
                System.out.println("El promedio final del alumno es: " + sum/3);
            }else{
                System.out.println("No se encontro el alumno dentro de esta lista");
            }
        } 
    }
}
