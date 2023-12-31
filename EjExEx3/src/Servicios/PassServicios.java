/*
 Métodos para desarrollar:
● Ingresar datos de usuarios (usando el constructor. HACER INGRESO DE DATOS FIJOS (no por
teclado)
● Crear un método para ingresar una contraseña (crearPass). En este método, debemos
validar que la longitud sea correcta. (10). En caso de ser correcto, almaceno la contraseña.
Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.
● Crear un método para analizar la contraseña(analizarPass). Donde:
o SI Existe al menos una letra z : Es nivel MEDIO
o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
o Si ninguna condición se cumple es nivel BAJO
● Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
acceso a modificar los datos.
● A través de un menú de opciones:
o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
contraseña valida).
o B) Mensaje al usuario que tipo de NIVEL es su contraseña
o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
dar permiso
o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
 */
package Servicios;

import Entidades.Pass;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class PassServicios {
    Scanner leer = new Scanner(System.in);
    Pass claves = new Pass();
    
    public Pass crearPass(){
        String contr;
        System.out.println("Ingrese su contraseña de 10 digitos");
        do{
        contr = leer.next();
        if ((contr.length()) == 10) {
            claves.setPass(contr);
        } else{
            System.out.println("Ingrese nuevamente la contraseña, recuerde que debe tener 10 digitos ni más ni menos PELOTUDO!!");   
        }
        }while(contr.length()!= 10);
        
        return claves;
    }
    
    public void analizarPass(){
        
        //StringBuilder prueba = new StringBuilder(claves.getPass());
       
    
        int cont = 0;
        for (int i = 0; i < claves.getPass().length(); i++) {
          if(claves.getPass().substring(i,i+1).equalsIgnoreCase("a")){
            cont++;
        }  
        }
        if (cont >= 2 && claves.getPass().toLowerCase().contains("z")){
            System.out.println("Su contraseña es de nivel ALTO");
        }else if(claves.getPass().toLowerCase().contains("z")){
            System.out.println("Su contraseña es de nivel MEDIO");
        }else{
            System.out.println("Su contraseña es de nivel BAJO");
        }
        
        
    }
    
}
