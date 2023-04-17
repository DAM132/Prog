/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema7.ejercicio6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author DAM132
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        File f1= null;
        File f2= null;

         FileReader fr1 = null;
         FileReader fr2 = null;
        BufferedReader br1 = null;
        BufferedReader br2 = null;
        FileWriter fw = null;
        
        PrintWriter pw=null;
        String linea;
        String linea2;
        try {
            f1= new File ("mifichero.txt");
            f2= new File ("mifichero2.txt");
            fr1 = new FileReader(f1);
            fr2= new FileReader(f2);
            br1 = new BufferedReader(fr1);
            br2= new BufferedReader(fr2);
            
             fw = new FileWriter("otroFichero.txt");
             pw= new PrintWriter(fw);
            while ((linea = br1.readLine()) != null) {
               pw.println(linea);
            }
            while((linea2=br2.readLine()) != null){
                pw.println(linea2);
            }
        } catch (IOException ex) {
            System.err.println(ex.toString());
        } finally {
            if (br1 != null && br2!=null)
                try {
                    br1.close();
                    br2.close();
                    fr1.close();
                    fr2.close();
                    f1.delete();
                    f2.delete();
                    fw.close();
                    pw.close();
                    
                } catch (IOException ex) {
                    System.out.println("Error al cerrar");
                }
        }
        
    }
    }

