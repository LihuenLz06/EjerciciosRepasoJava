/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej7Poo;

import Ej7Poo.Persona;
import java.util.Scanner;

/*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo 
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro 
atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.**
• Un constructor con todos los atributos como parámetro.**
• Métodos getters y setters de cada atributo.**
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al 
usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. 
Si no es correcto se deberá mostrar un mensaje**
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en 
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa 
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la 
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona 
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la 
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la 
función devuelve un 1. **
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve 
un booleano.**
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos 
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene 
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es 
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en 
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y 
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.*/
/**
 *
 * @author jorge
 */
public class PersonaService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        boolean validacion;
        Persona per = new Persona();
        System.out.println("Registre su nombre y apellido");
        per.setNombre(sc.next());
        per.setNombre(sc.nextLine());
        System.out.println("Registre su edad");
        per.setEdad(sc.nextInt());
        System.out.println("Registre su sexo, H para hombre, M para mujer, O para otro");
        String sex;
        do {
            sex = (sc.next());
            if (sex.equalsIgnoreCase("H") || sex.equalsIgnoreCase("M") || sex.equalsIgnoreCase("O")) {
                per.setSexo(sex);
                validacion = false;
            } else {
                System.out.println("Ingrese una letra valida");
                validacion = true;
            }
        } while (validacion == true);
        System.out.println("Registre su peso");
        per.setPeso(sc.nextDouble());
        System.out.println("Registre su altura");
        per.setAltura(sc.nextDouble());

        return per;
    }

    public double calcularIMC(Persona per) {

        int condicion;
        per.setImc(per.getPeso() / (Math.pow(per.getAltura(), 2)));
        if (per.getImc() < 20) {
            condicion = -1;
        } else if (per.getImc() <= 25) {
            condicion = 0;
        } else {
            condicion = 1;
        }
        return condicion;
    }

    public boolean esMayorDeEdad(Persona per) {
        boolean validacion;
        if (per.getEdad() < 18) {
            per.setEsmayor(false);
            validacion = false;
        } else {
            per.setEsmayor(true);
            validacion = true;
        }
        return validacion;
    }

    public void mostrar(Persona per) {
        System.out.println(per);
    }
}
