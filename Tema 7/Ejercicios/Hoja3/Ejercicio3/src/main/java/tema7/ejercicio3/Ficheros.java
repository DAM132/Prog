/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DAM132
 */
public class Ficheros {
    
    public static void leer(){
        
           FileReader fr;
        BufferedReader br = null;
        FileWriter fw;
        BufferedWriter wr = null;
        String linea;
        try {
            fr = new FileReader("mifichero.txt");
            br = new BufferedReader(fr);
             fw = new FileWriter("otroFichero.txt", true);
            wr = new BufferedWriter(fw);
            while ((linea = br.readLine()) != null) {
               wr.write(linea);
               wr.write(System.lineSeparator());
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
