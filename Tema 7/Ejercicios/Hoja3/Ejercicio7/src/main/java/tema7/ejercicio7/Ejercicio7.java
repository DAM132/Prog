/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema7.ejercicio7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author DAM132
 */
public class Ejercicio7 {

    public static void main(String[] args) {
         FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        
        PrintWriter pw=null;
        String linea;
       int cont=0;
       boolean aux=false;
          String frase = "";  
    
        try {
            fr = new FileReader("poema.txt");
            br = new BufferedReader(fr);
             fw = new FileWriter("salida.txt");
             pw= new PrintWriter(fw);
            
            while ((linea = br.readLine()) != null) {
                
                cont++;
                for (int i = 0; i < linea.length(); i++) {
                     frase+=(char)(linea.charAt(i)-cont);
                }
                System.out.println(frase);
                pw.println(frase);
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

