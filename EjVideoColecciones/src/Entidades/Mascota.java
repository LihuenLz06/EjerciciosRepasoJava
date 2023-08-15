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
public class Mascota {
    
    private String nombre;
    private String apodo;
    private String raza;

    public Mascota() {
    }

    public Mascota(String nombre, String apodo, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", raza=" + raza + '}';
    }
    
    
    
    
    
}
