/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cic
 */
public class UsuarioDAOImp implements Repositorio<Usuarios> {

    // metodo privado que nos devuelve la conexión
    private Connection getConnection() {
        return AccesoBaseDatos.getInstance().getConn();
    }
    // recuperamos todos los registros de la bd
    @Override
    public List<Usuarios> listar() {
        List<Usuarios> usuarios = new ArrayList<>();
        try ( Statement stmt = getConnection().createStatement();  
                ResultSet rs = stmt.executeQuery("SELECT id,username,password,email FROM Usuarios");) {
            while (rs.next()) {
                Usuarios usuario = new Usuarios( rs.getInt("id"),rs.getString("username"),rs.getString("password"),rs.getString("email"));
                if (!usuarios.add(usuario)) {
                    throw new Exception("error no se ha insertado el objeto en la colección");
                }
            }

        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return usuarios;
    }
    // recuperamos objeto por clave primaria
    @Override
    public Usuarios porId(int id) {
        Usuarios usuario = null;
        String sql = "SELECT id,username,password,email FROM Usuarios WHERE id=?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setInt(1, id);
            try ( ResultSet rs = stmt.executeQuery();) {
                if (rs.next()) {
                    usuario = new Usuarios( rs.getInt("id"),rs.getString("nombre"),rs.getString("password"),rs.getString("email"));
                }
            }

        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        }
        return usuario;
    }
    // implementa tanto insertar como modificar
    // distinguimos que es una inserción porque el id en la tabla se genera automáticamente
    @Override
    public void guardar(Usuarios usuario) {
        String sql = null;
        if (this.porId(usuario.getId()) != null) {
            sql = "UPDATE Usuarios SET id=?,username=?,password=md5(?),email=? WHERE id=?";
        } else {
            sql = "INSERT INTO Usuarios(id,username,password,email) VALUES (?,?,?,?)";
        }
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {

            if (this.porId(usuario.getId()) != null) {
                stmt.setInt(3, usuario.getId());
            }
            stmt.setInt(1, usuario.getId());
            stmt.setString(2, usuario.getNombre());
            stmt.setString(3, usuario.getPassword());
            stmt.setString(4, usuario.getEmail());       
            int salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception(" No se ha insertado/modificado un solo registro");
            }else{
                System.out.println("Fila insertada: "+salida);
            }

        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    // borrar en la base de datos por clave primaria
    @Override
    public void eliminar(int id) {

       String sql="DELETE FROM Usuarios WHERE id=?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setInt(1, id);
            int salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception(" No se ha borrado un solo registro");
            }
        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    
}
