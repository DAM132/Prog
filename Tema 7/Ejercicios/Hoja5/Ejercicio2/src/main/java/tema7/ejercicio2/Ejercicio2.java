/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema7.ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author DAM132
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    
        public static void crear(File fichero) {
 Scanner sc = new Scanner(System.in);
        
        PrintWriter salida = null;
        try {
            salida = new PrintWriter(fichero);
            String cadena;
            System.out.println("Introduce texto:");
            cadena = sc.nextLine();
            while (!cadena.equalsIgnoreCase("*")) {
                salida.println(cadena);
                cadena = sc.nextLine();
            }
            salida.flush();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            if (salida != null) {
                salida.close();
            }
        }
  
   }
        
        
            public static void leer(File fichero) {
       FileReader fr;
        BufferedReader br = null;
        String linea;
        
        try {
            fr = new FileReader(fichero);
            br = new BufferedReader(fr);
            while ((linea = br.readLine()) != null) {
                linea.replace("aeiou", linea);
               
                
              
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
