/*
 
 */
package ej13poo;

import Entidad.Curso;
import Servicios.CursoServicios;

/**
 *
 * @author usuario
 */
public class Ej13Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CursoServicios cursoS = new CursoServicios();
        
        Curso c1 = cursoS.crearCurso();
        
       cursoS.calcularGananciaSemanal();
        
        
       
    }
    
}
