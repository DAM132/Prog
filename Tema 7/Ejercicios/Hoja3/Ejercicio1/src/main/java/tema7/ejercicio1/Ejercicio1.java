/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema7.ejercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author DAM132
 */
public class Ejercicio1 {

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
