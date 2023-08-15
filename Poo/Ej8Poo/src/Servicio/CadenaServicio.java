/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cadena cad = new Cadena();

    public Cadena crearCadena() {
        System.out.println("Ingrese una frase o cadena de caracteres");
        cad.setFrase(leer.nextLine());
        cad.setLongitud(cad.getFrase().length());

        return cad;
    }

    public void mostrarVocales() {
        int vocales = 0;
        for (int i = 0; i < cad.getLongitud(); i++) {
            if (cad.getFrase().substring(i, i + 1).equalsIgnoreCase("a")) {
                vocales++;
            } else if (cad.getFrase().substring(i, i + 1).equalsIgnoreCase("e")) {
                vocales++;
            } else if (cad.getFrase().substring(i, i + 1).equalsIgnoreCase("i")) {
                vocales++;
            } else if (cad.getFrase().substring(i, i + 1).equalsIgnoreCase("o")) {
                vocales++;
            } else if (cad.getFrase().substring(i, i + 1).equalsIgnoreCase("u")) {
                vocales++;
            }
        }
        System.out.println("La cantidad de vocales que hay son: " + vocales);
    }

    public void invertirFrase() {
        System.out.println("La cadena invertida queda así: ");
        for (int i = cad.getLongitud() - 1; i >= 0; i--) {
            System.out.print(cad.getFrase().substring(i, i + 1));
        }
        System.out.println("");
    }

    public void vecesRepetido() {
        String letra;
        System.out.println("Ingrese una letra para buscar en su frase");
        letra = leer.next();
        int rep = 0;
        for (int i = 0; i < cad.getLongitud(); i++) {
            if (cad.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                rep++;
            }
        }
        System.out.println("Su letra se encuentra: " + rep + " veces.");
        // Para retornar el resultado con la variable dentro de los parentesis
        //del metodo, hay que convertir rep que es un in a un string 
        //con numCadena(variable creada string)= Integer. toString(numEntero(la variable rep);

    }

    public void compararLongitud() {
        String frase2;
        System.out.println("Ingrese una segunda frase para comparar");
        frase2 = leer.next();
        int longF2 = frase2.length();
        if (longF2 == cad.getLongitud()) {
            System.out.println("Las frase tienen igual longitud");
        } else if (longF2 > cad.getLongitud()) {
            System.out.println("La frase " + frase2 + " Es mayor en longitud");
        } else if (cad.getLongitud() > longF2) {
            System.out.println("La frase " + cad.getFrase() + " Es mayor en longitud");
        }

    }

    public void unirFrases() {
        String frase3;
        System.out.println("Ingrese una frase apara concatenar con la primera");
        frase3 = leer.next();
        System.out.println(cad.getFrase() + " " + frase3);
    }
    
    public void reemplazar(){
        String letraRem;
        String fraseRem = cad.getFrase();
        
        System.out.println("Ingrese una letra para reemplazar por todas las \"A\"");
    letraRem = leer.next();
        for (int i = 0; i < cad.getLongitud(); i++) {
          
                       if(cad.getFrase().substring(i,i+1).equalsIgnoreCase("a")){
                fraseRem = fraseRem.substring(0,i).concat(letraRem);
                fraseRem = fraseRem+cad.getFrase().substring(i+1, cad.getLongitud());

            }
        }
    }
    
    public String contiene(String letraBus){
        boolean respuesta = false;
        String resp;
        int cont = 0;
        for (int i = 0; i < cad.getLongitud(); i++) {
            if (cad.getFrase().substring(i, i+1).equalsIgnoreCase(letraBus)) {
                respuesta = true;
            }else{
                respuesta = false;
            }
            if (cont >= 1) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        }
        System.out.println(respuesta);
        return resp = Boolean.toString(respuesta);
    }

}
