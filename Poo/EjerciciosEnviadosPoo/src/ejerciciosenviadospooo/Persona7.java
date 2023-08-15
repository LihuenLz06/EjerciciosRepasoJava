/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej7Poo;

/**
 *
 * @author jorge
 */
public class Persona {

    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;
    private double imc;
    private boolean esmayor;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura, double imc, boolean esmayor) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
        this.esmayor = esmayor;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public boolean getEsmayor() {
        return esmayor;
    }

    public void setEsmayor(boolean esmayor) {
        this.esmayor = esmayor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad +
                ", sexo=" + sexo + ", peso=" + peso + ", altura="
                + altura + ", imc=" + imc + ", esmayor=" + esmayor + '}';
    }
    
    

}
