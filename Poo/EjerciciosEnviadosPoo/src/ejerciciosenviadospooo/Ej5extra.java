package ejercicio;

import java.util.Scanner;

/*Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado! */
public class Ej5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont;
        int aux = (int) (Math.random() * 12);

        String meses[] = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
                "octubre", "noviembre", "diciembre" };

        String mesSecreto = meses[aux];
        System.out.println(mesSecreto);
        String mesUsuario;
        do {

            do {
                cont = 0;
                System.out.println("Intente adivinar el mes secreto");
                mesUsuario = leer.next().toLowerCase();
                for (int i = 0; i < 12; i++) {
                    if (!mesUsuario.equalsIgnoreCase(meses[i])) {
                        cont++;
                    }
                }
                if (cont == 12)
                    System.out.println("La palabra ingresada no es un mes");
            } while (cont == 12);

            if (!mesUsuario.equals(mesSecreto))
                System.out.println("No has acertado!!");

        } while (!mesUsuario.equals(mesSecreto));
        System.out.println("Acertaste!!");

        leer.close();
    }
}
