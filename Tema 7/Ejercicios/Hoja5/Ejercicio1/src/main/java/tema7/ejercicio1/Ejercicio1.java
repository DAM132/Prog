/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema7.ejercicio1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author DAM132
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        File f= new File("entrada.txt");
        crear(f);
        leer(f);
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
        int contma = 0, contminus = 0, numeros = 0;
        try {
            fr = new FileReader(fichero);
            br = new BufferedReader(fr);
            while ((linea = br.readLine()) != null) {
                
                for (int i = 0; i < linea.length(); i++) {
                    char aux= linea.charAt(i);
                    
                    if(Character.isUpperCase(aux))
                        contma++;
                    else if(Character.isLowerCase(aux))
                        contminus++;
                    else if(Character.isDigit(aux))
                        numeros++;
                    
                }
                
              
            }
        } catch (IOException ex) {
            System.err.println(ex.toString());
            
        } finally {
            System.out.println("Mayus " +contma
            +"\nMinus " + contminus + "\nNumeros" + numeros);
            if (br != null)
                try {
                    br.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar");
                }
        }
}
}
