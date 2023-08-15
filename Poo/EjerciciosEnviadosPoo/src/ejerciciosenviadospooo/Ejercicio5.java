/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosenviadospooo;

import ejercicio5.entidades.Cuenta;
import ejercicio5.entidades.service.CuentaService;

/**
 *
 * @author jorge
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaService cts = new CuentaService();
        
        Cuenta cta1 = cts.crearCuenta();

        
        cts.ingDinero(cta1);
        cts.retDinero(cta1);
        cts.extraRap(cta1);
        cts.consSaldo(cta1);
        cts.consDatos(cta1);
        


    }
    
}
