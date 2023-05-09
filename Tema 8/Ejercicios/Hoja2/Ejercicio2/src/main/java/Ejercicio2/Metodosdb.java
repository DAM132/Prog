package Ejercicio2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author DAM132
 */
public class Metodosdb {

    private Connection getConnection() {
        return AccesoBaseDatos.getInstance().getConn();
    }

    public Pacientes porDNI(String dni) {
        Pacientes auxpaciente = null;
        String sql = "SELECT dni FROM pacientes WHERE dni=?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setString(1, dni);
            try ( ResultSet rs = stmt.executeQuery();) {
                if (rs.next()) {
                    auxpaciente.setDni(dni);
                    auxpaciente.setNombre(Teclado.introTexto("Dime el nombre"));
                    auxpaciente.setTelefono(Teclado.introTexto("Dime el telefono"));

                } else {
                    System.out.println("Ya existe un paciente con ese dni");
                }
            }

        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        }
        return auxpaciente;
    }
    

    public void insertarPaciente(String dni) {

        Pacientes aux = porDNI(dni);
        if (aux != null) {

            PreparedStatement ps = null;
            Connection conn = AccesoBaseDatos.getInstance().getConn();
            String sql = "INSERT INTO productos (dni,nombre,telefono) VALUES (?,?,?)";
            try {

                ps = conn.prepareStatement(sql);
                // indico que para el primer parámetro el valor pasado por parámetro String nombre
                ps.setString(1, aux.getDni());
                // indico que para el segundo parámetro el valor pasado por parámetro int cantidad
                ps.setString(2, aux.getNombre());
                ps.setString(3, aux.getTelefono());
                int salida = ps.executeUpdate();
                if (salida == 1) {
                    System.out.println("Ha sido insertado el producto");
                } else {
                    throw new Exception("Error no se ha realizado la inserción");
                }
            } catch (SQLException ex) {
                System.out.println("error en la ejecución de insertarProductoBD " + ex.getMessage());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }

    }
    
    public  Visitas crearVisita(String dni){
      Pacientes aux=porDNI(dni);
        
      if(aux==null){
          
      }
        
        
        return aux;
    }

}
