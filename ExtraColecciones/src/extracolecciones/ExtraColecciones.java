/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extracolecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author usuario
 */
public class ExtraColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<String> prueba = new ArrayList();
        prueba.add("Pablo");
        prueba.add("Giuliano");
        prueba.add("Gabriel");
        prueba.add("Gabriel");
        prueba.add("Lihuen");

        System.out.println(prueba);

        if (prueba.contains("Pablo")) {
            prueba.remove("Pablo");
        }

        HashSet<Object> nombres = new HashSet();

        nombres.add("Pablo");
        nombres.add("Giuliano");
        nombres.add("Gabriel");
        nombres.add("Gabriel");
        nombres.add("Lihuen");
        nombres.add(125);
        nombres.add(340);
        nombres.add(2000000);
        nombres.add(true);
        nombres.add(false);
        
        Collections.sort((List)nombres);
        
        for (Object nombre : nombres) {
            System.out.println(nombre);
            System.out.println(nombre.hashCode());
        }
        
    }

}
