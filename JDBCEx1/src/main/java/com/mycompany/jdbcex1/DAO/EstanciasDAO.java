package com.mycompany.jdbcex1.DAO;

import com.mycompany.jdbcex1.Entidades.Estancias;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class EstanciasDAO extends DAO {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public void insertarEstancia3() {
        try {
            crearConexion();
            sentencia = conexion.createStatement();
            Estancias est = new Estancias();
            System.out.println("Lista de estancias");
            System.out.println("Selecciona un código de estancia de la siguiente lista:");
            resultado = sentencia.executeQuery("SELECT id_estancia, id_cliente, id_casa FROM estancias");
            while (resultado.next()) {
                System.out.println(" | " + resultado.getInt("id_estancia") + " | " + resultado.getInt("id_cliente")+ " | " + resultado.getInt("id_casa"));
            }
            int opcion = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese la fecha de disponibilidad inicial (yyyy-MM-dd):");
            String fechaString = sc.nextLine();
            try {
                LocalDate fecha = LocalDate.parse(fechaString);
                est.setFecha_desde(fecha);
            } catch (DateTimeParseException e) {
                System.err.println("Formato de fecha incorrecto.");
            }
            System.out.println("Ingrese la fecha de disponibilidad final (yyyy-MM-dd):");
            String fechaString2 = sc.nextLine();
            try {
                LocalDate fecha2 = LocalDate.parse(fechaString2);
                est.setFecha_hasta(fecha2);
            } catch (DateTimeParseException e) {
                System.err.println("Formato de fecha incorrecto.");
            }
            PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM estancias WHERE id_estancia = ? AND ((fecha_desde <= ? AND fecha_hasta >= ?) OR (fecha_desde >= ? AND fecha_hasta <= ?))");
            consulta.setInt(1, opcion);
            consulta.setDate(2, java.sql.Date.valueOf(est.getFecha_desde()));
            consulta.setDate(3, java.sql.Date.valueOf(est.getFecha_hasta()));
            consulta.setDate(4, java.sql.Date.valueOf(est.getFecha_desde()));
            consulta.setDate(5, java.sql.Date.valueOf(est.getFecha_hasta()));
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                System.out.println("La fecha no está disponible.");
                return;
            }

            System.out.println("Ingrese los nuevos datos de la estancia");
            System.out.println("Ingrese el código del cliente");
            est.setId_cliente(sc.nextInt());
            System.out.println("Ingrese el código de la casa");
            est.setId_casa(sc.nextInt());
            System.out.println("Ingrese el nombre del huesped");
            est.setNombre_huesped(sc.next());
            java.sql.Date fechaSQL = java.sql.Date.valueOf(est.getFecha_desde());
            java.sql.Date fechaSQL2 = java.sql.Date.valueOf(est.getFecha_hasta());
            sentencia.executeUpdate("UPDATE estancias SET id_cliente = " + est.getId_cliente() + ", id_casa = " + est.getId_casa() + ", nombre_huesped = '" + est.getNombre_huesped() + "', fecha_desde = '" + fechaSQL + "', fecha_hasta = '" + fechaSQL2 + "' WHERE id_estancia = " + opcion);
            resultado = sentencia.executeQuery("SELECT * FROM estancias");
            while (resultado.next()) {
                System.out.println(" | " + resultado.getInt("id_estancia") + " | " + " " + resultado.getInt("id_cliente") + " | " + " "
                        + resultado.getInt("id_casa") + " | " + " " + resultado.getString("nombre_huesped") + " | " + resultado.getDate("fecha_desde").toLocalDate() + " | " + resultado.getDate("fecha_hasta").toLocalDate());
            }
        } catch (SQLException e) {
            System.err.println("Error en la conexión.");
        } finally {
            crearDesconexion();
        }
    }
    
    
    
    
}
