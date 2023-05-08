/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8.ejermplo1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DAM132
 */
public class FuncionesBD {
    
public static void crearTablas() {
        Statement sentencia = null;
        try {
            Connection conn = AccesoBaseDatos.getInstance().getConn();
            sentencia = conn.createStatement();
            // en String tabla codigo sql con el create table
            String tabla = "create table productos(\n"
                    + "  id smallint NOT NULL AUTO_INCREMENT,\n"
                    + "  nombre varchar(40) NOT NULL,\n"
                    + "  cantidad int NOT NULL,\n"
                    + "  PRIMARY KEY (`id`)\n"
                    + ") ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 ";
            sentencia.executeUpdate(tabla);
            System.out.println("Tabla producto creada con éxito!!");

        } catch (SQLException ex) {
            System.out.println("Error al ejecutar la creacion de tabla " + ex.getMessage());
        } finally {
            try {
                if (sentencia != null) {
                    sentencia.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la sentencia " + ex.getMessage());
            }

        }

    }

// insertar información en la tabla productos
   public static void insertarDatos() {
        Statement sentencia = null;
        Connection conn = AccesoBaseDatos.getInstance().getConn();
        try {
            sentencia = conn.createStatement();
            // dentro de executeUpdate codigo del insert, update o delete
            String inserta = "INSERT INTO productos"
                    + "(nombre,cantidad)"
                    + "VALUES ('melocotones',8),"
                    + "('platanos',12),('peras',3)";
            int resul = sentencia.executeUpdate(inserta);
            if (resul == 3) {
                System.out.println("Filas afectadas: " + resul);
            } else {
                throw new Exception("error no se han insertado todos los registros");
            }
        } catch (SQLException ex) {
            System.out.println("Error en la inserción de datos " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (sentencia != null) {
                    sentencia.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la sentencia " + ex.getMessage());
            }
        }
    }

    
    
    
}
