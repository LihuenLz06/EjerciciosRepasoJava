package Main;

import Entidades.Persona;
import Servicios.Metodos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        Metodos met = new Metodos();


        try {
            personas.add(met.crearPersonaConError());
            personas.get(0).isMayorDeEdad();
        } catch (ArithmeticException e) {
            System.out.println("Catch de Arithmetic");
            System.out.println(e.toString());
        } catch (NullPointerException e) {
            System.out.println("Catch de null");
            System.out.println(e.toString());
        } catch (Exception e){
            System.out.println(e.toString());
        }

        System.out.println("Soy el final del codigo");


        /*for (int i = 1; i <= 2; i++) {
            Persona persona = new Persona();
            persona = met.crearPersona(i, persona);
            met.calcularIMC(persona.getPeso(), persona.getAltura(), persona);
            persona.setMayorDeEdad(met.esMayorDeEdad(persona.getEdad()));
            personas.add(persona);
        }
        System.out.println(personas);
        for (Persona per : personas) {
            System.out.println(per);
        }*/
    }

}
/*       • Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
        usuario y después se le asignan a sus respectivos atributos para llenar el objeto
        Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
        Si no es correcto se deberá mostrar un mensaje
        • Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
        kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
        que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
        fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
        está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
        fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
        función devuelve un 1.
        • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
        un booleano.
        A continuación, en la clase main hacer lo siguiente:
        Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
        los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
        sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
        mayor de edad.
        Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
        distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
        cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
        también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.*/
