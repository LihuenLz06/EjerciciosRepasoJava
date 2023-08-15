/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.entidades.service;

import ejercicio5.entidades.Cuenta;
import java.util.Scanner;

/*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos: 
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las 
operaciones asociadas a dicha clase son: 
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés. **
b) Agregar los métodos getters y setters correspondientes   **
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario. **
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar 
y se la sumara a saldo actual.**
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la 
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el 
saldo actual en 0. **
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el 
usuario no saque más del 20%.**
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. 
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/
/**
 *
 * @author jorge
 */
public class CuentaService {

    Scanner sc = new Scanner(System.in);

    public Cuenta crearCuenta() {

        Cuenta ct = new Cuenta();
        System.out.println("ingrese su DNI por favor");
        ct.setDniDelCliente(sc.nextLong());
        System.out.println("ingrese su numero de cuenta");
        ct.setNumeroCuenta(sc.nextInt());
        System.out.println("su saldo actual es: ");
        ct.setSaldoActual(10000);
        System.out.println(ct.getSaldoActual());
        return ct;
    }

    public void ingDinero(Cuenta ct) {
        System.out.println("Cuanto dinero desea consignar?");
        int miDinero = sc.nextInt();
        ct.setSaldoActual(ct.getSaldoActual() + miDinero);
        System.out.println(ct.getSaldoActual());
    }

    public void retDinero(Cuenta ct) {
        System.out.println("Cuanto dinero desea retirar?");
        int miDinero = sc.nextInt();

        if (miDinero <= ct.getSaldoActual()) {
            ct.setSaldoActual(ct.getSaldoActual() - miDinero);
            System.out.println(ct.getSaldoActual());
        } else {
            ct.setSaldoActual(0);
            System.out.println("SU SALDO ES 0");

        }
    }

    public void extraRap(Cuenta ct) {
        int extraer;
        System.out.println("Cuanto dinero desea retirar?");
        do {
            extraer = sc.nextInt();
            if (extraer > ct.getSaldoActual() * 0.20) {
                System.out.println("USTED NO PUEDE RETIRAR ESTE MONTO, INTENTE NUEVAMENTE");
                System.out.println(ct.getSaldoActual());
            } else {
                ct.setSaldoActual(ct.getSaldoActual() - extraer);
                System.out.println(ct.getSaldoActual());
            }
        } while (extraer > ct.getSaldoActual() * 0.20);
    }

    public void consSaldo(Cuenta ct) {
        System.out.println("SU SALDO ACTUAL ES: " + ct.getSaldoActual());
    }

    public void consDatos(Cuenta ct) {
        System.out.println("SU SALDO ACTUAL ES: " + ct.getSaldoActual());
        System.out.println("SU DNI ES: "+ ct.getDniDelCliente());
        System.out.println("SU NUMETO DE CUENTA ES: "+ct.getNumeroCuenta());
    }
}
