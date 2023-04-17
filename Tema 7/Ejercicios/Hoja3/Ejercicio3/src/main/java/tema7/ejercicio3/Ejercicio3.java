/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema7.ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author DAM132
 */
public class Ejercicio3 {

    public static void main(String[] args) {
             
           FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        
        PrintWriter pw=null;
        String linea;
        try {
            fr = new FileReader("mifichero.txt");
            br = new BufferedReader(fr);
             fw = new FileWriter("otroFichero.txt");
             pw= new PrintWriter(fw);
            while ((linea = br.readLine()) != null) {
               pw.println(linea);
            }
        } catch (IOException ex) {
            System.err.println(ex.toString());
        } finally {
            if (br != null)
                try {
                    br.close();
                    fr.close();
                    fw.close();
                    pw.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar");
                }
        }
        
    }
    
}
