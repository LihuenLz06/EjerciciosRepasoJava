/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Persona {
    
    private String nombre;
    private Date FechaNac;

    public Persona() {
    }

    public Persona(String nombre, Date FechaNac) {
        this.nombre = nombre;
        this.FechaNac = FechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(Date FechaNac) {
        this.FechaNac = FechaNac;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", FechaNac=" + FechaNac + '}';
    }
    
    
    
}
