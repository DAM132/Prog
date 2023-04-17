/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerlineaalinea;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nuria
 */
public class LeerLineaALinea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileReader fr;
        BufferedReader br = null;
        String linea;
        try {
            fr = new FileReader("mifichero.txt");
            br = new BufferedReader(fr);
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException ex) {
            System.err.println(ex.toString());
        } finally {
            if (br != null)
                try {
                    br.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar");
                }
        }
    }
}
