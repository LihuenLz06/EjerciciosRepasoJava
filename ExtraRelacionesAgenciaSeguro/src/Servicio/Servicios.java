/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Cliente;
import Entidades.Veiculos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author usuario
 */
public class Servicios {
    
    Random random = new Random();
    Cliente cl = new Cliente();
    ArrayList <Cliente> clientes = new ArrayList<>();
    public void crearPersona(String nombre, String apellido, String dni, String domicilio, String telefono, String mail, ArrayList<Veiculos>listaVeiculos){
        Cliente cliente1 = new Cliente();
        cliente1.setApellido(apellido);
        cliente1.setDni(dni);
        cliente1.setNombre(nombre);
        cliente1.setDomicilio(domicilio);
        cliente1.setMail(mail);
        cliente1.setListaVeiculos(listaVeiculos);
        
        clientes.add(cliente1);
    }
    
    public void crearVehiculo(){
        int cantVeiculos;
        
        for (Cliente aux : clientes) {
            cantVeiculos = (int) (Math.random()*3) + 1;
            for (int i = 0; i < cantVeiculos; i++) {
               // Veiculos auto = new Veiculos(Veiculos.Marca[(int)(Math.random()+4)],Veiculo...)
               Veiculos auto = new Veiculos();
                aux.getListaVeiculos().set(i,auto);
            }
        }
    }
}
