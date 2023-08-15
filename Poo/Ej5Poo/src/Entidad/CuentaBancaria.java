/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author usuario
 */
public class CuentaBancaria {
    
    private int numeroDeCuenta;
    private long dni;
    private int saldoActual;
    private int interes;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroDeCuenta, long dni, int saldoActual, int interes) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroDeCuenta=" + numeroDeCuenta + ", dni=" + dni + ", saldoActual=" + saldoActual + ", interes=" + interes + '}';
    }

   
    
    
    
}
