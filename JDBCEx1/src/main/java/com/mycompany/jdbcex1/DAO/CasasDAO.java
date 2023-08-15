package com.mycompany.jdbcex1.DAO;


import com.mycompany.jdbcex1.Entidades.Casas;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class CasasDAO extends DAO{

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public void listarCasasDisponibles() {
        //Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de agosto de
//2020 y el 31 de agosto de 2020 en Reino Unido.
        try {
            crearConexion();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery("SELECT tipo_vivienda, fecha_desde, fecha_hasta, pais FROM casas WHERE pais = "
                    + "'Reino Unido' AND fecha_desde >= '2020-08-01' and fecha_hasta <= '2020-08-31'");
            while (resultado.next()) {
                System.out.println(" | " + resultado.getString ("tipo_vivienda") + " | " + resultado.getDate("fecha_desde") + " | " 
                        + resultado.getDate("fecha_hasta") + " | " + resultado.getString("pais"));
            }
        } catch (SQLException e) {
        } finally {
            crearDesconexion();
        }
    }
    
     public void CasasDisponiblesDatos() {
        //Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha dada
        //y un número de días específico.
        Casas casas = new Casas();
        int dias;
        try {
            crearConexion();
            sentencia = conexion.createStatement();
            System.out.println("Ingrese la fecha en la que desea ingresar");
          casas.setFecha_desde(LocalDate.parse(sc.next()));
            System.out.println("Cuantos dias desea quedarse");
            dias = sc.nextInt();
            resultado = sentencia.executeQuery("SELECT tipo_vivienda, fecha_desde, tiempo_minimo, tiempo_maximo FROM casas "
                    + "WHERE fecha_desde <= ' " + casas.getFecha_desde() +" ' AND tiempo_minimo <=" + dias + " AND tiempo_maximo >=" + dias);
            while (resultado.next()) {
                System.out.println(" | " + resultado.getString ("tipo_vivienda") + " | " + resultado.getDate("fecha_desde") 
                        +  " | " + resultado.getInt("tiempo_minimo") + " | " + resultado.getInt("tiempo_maximo"));
            }
        } catch (SQLException e) {
        } finally {
            crearDesconexion();
        }
    }
     
     public void consultarCasas() {
        try {
            crearConexion();
            sentencia = conexion.createStatement();
            System.out.println("Ingrese los nuevos datos a consultar");
            Casas casa = new Casas();
            System.out.println("Ingrese la fecha de disponibilidad (yyyy-MM-dd):");
            String fechaString = sc.nextLine();
            try {
                LocalDate fecha = LocalDate.parse(fechaString);
                casa.setFecha_desde(fecha);
            } catch (DateTimeParseException e) {
                System.err.println("Formato de fecha incorrecto.");
            }
            System.out.println("Ingrese la cantidad mínima de días");
            casa.setTiempo_minimo(sc.nextInt());
            System.out.println("Ingrese la cantidad máxima de días");
            casa.setTiempo_maximo(sc.nextInt());

            LocalDateTime fechaDesde = casa.getFecha_desde().atStartOfDay();
            ZonedDateTime fechaDesdeZoned = fechaDesde.atZone(ZoneId.systemDefault());

            resultado = sentencia.executeQuery("SELECT id_casa, fecha_desde, tiempo_minimo, tiempo_maximo FROM casas WHERE"
                    + " fecha_desde <= '" + fechaDesdeZoned + "' \n"
                    + " AND tiempo_minimo <= " + casa.getTiempo_minimo() + " AND tiempo_maximo >= " + casa.getTiempo_maximo() + ";");

            while (resultado.next()) {
                System.out.println(" | " + resultado.getInt("id_casa") + " | " + " " + resultado.getDate("fecha_desde") + " | " 
                        + resultado.getInt("tiempo_minimo") + " | " + resultado.getInt("tiempo_maximo"));
            }
        } catch (SQLException e) {
            System.err.println("Error en la consulta de casas: " + e.getMessage());
        } finally {
            crearDesconexion();
        }
    }
    
     public void consultarCasas3() {
        try {
            crearConexion();
            sentencia = conexion.createStatement();
            System.out.println("Ingrese los nuevos datos a consultar");
            Casas casa = new Casas();
            System.out.println("Ingrese la fecha de disponibilidad (yyyy-MM-dd):");
            String fechaString = sc.nextLine();
            LocalDate fecha = null;
            try {
                fecha = LocalDate.parse(fechaString);
                casa.setFecha_desde(fecha);
            } catch (DateTimeParseException e) {
                System.err.println("Formato de fecha incorrecto.");
            }
            System.out.println("Ingrese la cantidad mínima de días");
            casa.setTiempo_minimo(sc.nextInt());
            System.out.println("Ingrese la cantidad máxima de días");
            casa.setTiempo_maximo(sc.nextInt());
            sc.nextLine();
            java.sql.Date fechaSQL = java.sql.Date.valueOf(casa.getFecha_desde()); //funciona como un parse para transformar a fechaSQL
            resultado = sentencia.executeQuery("SELECT id_casa, pais, fecha_desde, tiempo_minimo, tiempo_maximo FROM casas WHERE"
                    + " fecha_desde <= '" + fechaSQL + "' \n"
                    + " AND tiempo_minimo <= " + casa.getTiempo_minimo() + " AND tiempo_maximo >= " + casa.getTiempo_maximo()
                    + " AND '" + fechaSQL + "' BETWEEN fecha_desde AND fecha_hasta \n"
                    + ";");
            while (resultado.next()) {
                System.out.println(" | " + resultado.getInt("id_casa") + " | " + " " + resultado.getDate("fecha_desde").toLocalDate() + " | "
                        + resultado.getInt("tiempo_minimo") + " | " + resultado.getInt("tiempo_maximo"));
            }
        } catch (SQLException e) {
        } finally {
            crearDesconexion();
        }
    }
    
}
