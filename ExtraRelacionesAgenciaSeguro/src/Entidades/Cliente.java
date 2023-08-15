
package Entidades;

import java.util.ArrayList;

public class Cliente {

    private String nombre;
    private String apellido;
    private String dni;
    private String domicilio;
    private String telefono;
    private String mail;
    private ArrayList<Veiculos> listaVeiculos;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String dni, String domicilio, String telefono, String mail, ArrayList<Veiculos> listaVeiculos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.mail = mail;
        this.listaVeiculos = listaVeiculos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public ArrayList<Veiculos> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setListaVeiculos(ArrayList<Veiculos> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", domicilio=" + domicilio + ", telefono=" + telefono + ", mail=" + mail + ", listaVeiculos=" + listaVeiculos + '}';
    }
    
    
}
