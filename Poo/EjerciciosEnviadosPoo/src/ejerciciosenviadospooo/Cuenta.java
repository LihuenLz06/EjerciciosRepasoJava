/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.entidades;

/**
 *
 * @author jorge
 */
public class Cuenta {

    //ATRIBUTOS
    private int numeroCuenta;
    private long dniDelCliente;
    private int saldoActual;
    private int interes;
            
    
// CONSTRUCTOR VACIO
        public Cuenta() {
    }
//CONSTRUCTOR CON PARAMETROS
    public Cuenta(int numeroCuenta, long dniDelCliente, int saldoActual, int interes) {
        this.numeroCuenta = numeroCuenta;
        this.dniDelCliente = dniDelCliente;
        this.saldoActual = saldoActual;
        this.interes=interes;
    }
//GETTERS AND SETTERS
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniDelCliente() {
        return dniDelCliente;
    }

    public void setDniDelCliente(long dniDelCliente) {
        this.dniDelCliente = dniDelCliente;
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

//toSTRING

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta +
                ", dniDelCliente=" + dniDelCliente + 
                ", saldoActual=" + saldoActual + 
                ", interes=" + interes + '}';
    }
    
                
    }
    
    
    
    

