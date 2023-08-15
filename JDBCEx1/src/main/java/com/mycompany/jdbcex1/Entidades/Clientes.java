package com.mycompany.jdbcex1.Entidades;


public class Clientes {

    private int id_cliente;
  private String nombre;
  private String calle;
  private int numero;
  private String codigo_postal;
  private String ciudad;
  private String pais;
  private String email;

    public Clientes() {
    }

    public int getId_client() {
        return id_cliente;
    }

    public void setId_client(int id_client) {
        this.id_cliente = id_client;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Clientes{" + "id_client=" + id_cliente + ", nombre=" + nombre + ", calle=" + calle + ", numero=" + numero + ", codigo_postal=" + codigo_postal + ", ciudad=" + ciudad + ", pais=" + pais + ", email=" + email + '}';
    }
}
