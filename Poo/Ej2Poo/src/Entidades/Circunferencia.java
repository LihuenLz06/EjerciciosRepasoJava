/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author usuario
 */
public class Circunferencia {
    
   private double radio;
   private String nombre;

    public Circunferencia() {
    }

    public Circunferencia(double radio, String nombre) {
        this.radio = radio;
        this.nombre = nombre;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", nombre=" + nombre + '}';
    }

    

   
    
    
}
