
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema8.ejermplo1;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author DAM132
 */
public class Ejermplo1 {

    public static void main(String[] args) {
        
        Connection conn = AccesoBaseDatos.getInstance().getConn();
        
        FuncionesBD.crearTablas();
        FuncionesBD.insertarDatos();
        
        if (AccesoBaseDatos.getInstance().cerrar()) {
            System.out.println("Cerrada");
            
        }
        else{
            System.out.println("No cerrada");
        }
        
        
     
        
}
    }
