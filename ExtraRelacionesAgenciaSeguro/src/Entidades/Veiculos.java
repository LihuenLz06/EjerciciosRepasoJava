/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author usuario
 */
public class Veiculos {

    private String marca;
    private String modelo;
    private LocalDate anio;
    private String motor;
    private String chasis;
    private String color;
    private String tipo;
    private Polizas poliza;
    
    public static final String Marca[] = {"Renaul", "Chevrolet", "Toyota", "Audi", "Kia"};
    public static final String Modelo[] = {"Turingo", "Picanto", "Tracker", "Hilux", "C3"};
    public static final String Color[] = {"Rojo", "Verde", "Blanco", "Negro", "Azul"};
    public static final String Tipo[] = {"Camioneta", "Auto", "Trailer", "Camion", "utilitario"};
    
    

    public Veiculos() {
    }

    public Veiculos(String marca, String modelo, LocalDate anio, String motor, String chasis, String color, String tipo, Polizas poliza) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.motor = motor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
        this.poliza = poliza;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getAnio() {
        return anio;
    }

    public void setAnio(LocalDate anio) {
        this.anio = anio;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Polizas getPoliza() {
        return poliza;
    }

    public void setPoliza(Polizas poliza) {
        this.poliza = poliza;
    }
    
    
    
}
