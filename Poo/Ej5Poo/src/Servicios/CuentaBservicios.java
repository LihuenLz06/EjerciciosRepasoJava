/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class CuentaBservicios {

    public CuentaBancaria crearCuenta() {
        Scanner leer = new Scanner(System.in);
        String respuesta;

        CuentaBancaria cuentas = new CuentaBancaria();

        System.out.println("Es miembro de nuestro Banco CMUNIDAD?");
        respuesta = leer.next();

        if (respuesta == "no") {
            System.out.println("Coloque sus datos personales para registrarse");
            System.out.println("Ingrese su DNI");
            cuentas.setDni(leer.nextLong());
            System.out.println("Ingrese su numero de cuenta");
            cuentas.setNumeroDeCuenta(leer.nextInt());
        } else {
            System.out.println("Ingrese su Usuario (DNI)");
            cuentas.setDni(leer.nextLong());
            System.out.println("Ingrese su Clave (numero de cuenta)");
            cuentas.setNumeroDeCuenta(leer.nextInt());
        }

        return cuentas;
    }

}
