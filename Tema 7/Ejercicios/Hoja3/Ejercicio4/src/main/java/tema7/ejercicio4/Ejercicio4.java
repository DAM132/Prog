/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema7.ejercicio4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author DAM132
 */
public class Ejercicio4 {

    public static void main(String[] args) {
         FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        
        PrintWriter pw=null;
        String linea;
        if(args.length!=2)
            System.out.println("No hay suficiente argumentos");
        else {
            
    
        try {
            fr = new FileReader(args[0]);
            br = new BufferedReader(fr);
             fw = new FileWriter(args[1]);
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
    
}
