/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja2.ejercicio4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author DAM132
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        //4.- Realizar un programa que copie un fichero en otro cuyos nombres pasaremos como
//argumentos a través de la línea de órdenes.
Scanner in = Scanner(System.in);
  FileInputStream fi = null;
        FileOutputStream fo = null;
        int c;
        try {
            fi = new FileInputStream("entrada.txt");
            fo = new FileOutputStream("salida.txt");
            while ((c = fi.read()) != -1) {
                fo.write(c);
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            if (fi != null)
    try {
                fi.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar el fichero.");
            }
            
            if(fo!=null)
                
            try {
                fo.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar el fichero.");
            }
            
        }

    }
}
