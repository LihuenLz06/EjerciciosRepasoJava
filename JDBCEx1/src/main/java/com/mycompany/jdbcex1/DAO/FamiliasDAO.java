package com.mycompany.jdbcex1.DAO;

import java.sql.SQLException;


public class FamiliasDAO extends DAO{

    public void listarFamilias() {
        try {
            crearConexion();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery("SELECT nombre, num_hijos, edad_maxima FROM familias WHERE num_hijos >= 3 AND edad_maxima <= 10");
            while (resultado.next()) {
                System.out.println(" | " + resultado.getString ("nombre") + " | " + resultado.getInt("num_hijos") + " | " + resultado.getInt("edad_maxima"));
            }
        } catch (SQLException e) {
        } finally {
            crearDesconexion();
        }
    }
    
     public void hotmailFasmilias() {
         //Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail.
        try {
            crearConexion();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery("SELECT nombre, email FROM familias WHERE email LIKE '%hotmail%'");
            while (resultado.next()) {
                System.out.println(" | " + resultado.getString ("nombre") + " | " + resultado.getString("email"));
            }
        } catch (SQLException e) {
        } finally {
            crearDesconexion();
        }
    }
    
}
