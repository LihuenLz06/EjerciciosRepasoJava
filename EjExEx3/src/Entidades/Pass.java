/*
Crear una clase Pass, donde declaremos los siguientes atributos:
● pass : Del tipo String
● nombre: Del tipo String
● dni: Del tipo int.
 */
package Entidades;

/**
 *
 * @author usuario
 */
public class Pass {
    private String pass;
    private String nombre;
    private long dni;

    public Pass() {
        nombre = "Pepito Martinez";
        dni = 36589605;
        
    }

    public Pass(String pass, String nombre, long dni) {
        this.pass = pass;
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Pass{" + "pass=" + pass + ", nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
}
