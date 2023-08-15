/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import GUI.Grafica;

/**
 *
 * @author usuario
 */
public class MetodosControladores {
    
    Grafica graf = new Grafica();
   
    public void iniciarVentana(){
        graf.setVisible(true);
        graf.setLocationRelativeTo(null);
        graf.setResizable(false);
    }
    
   
}
