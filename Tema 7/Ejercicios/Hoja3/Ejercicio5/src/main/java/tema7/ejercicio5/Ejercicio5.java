/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema7.ejercicio5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author DAM132
 */
public class Ejercicio5 {

    public static void main(String[] args) {
   FileReader fr;
        BufferedReader br = null;
        String linea;
        int cont=0;
        try {
            fr = new FileReader("mifichero.txt");
            br = new BufferedReader(fr);
            while ((linea = br.readLine()) != null) {
                cont++;
                StringTokenizer st= new StringTokenizer(linea);
                System.out.println("Lineas " + cont + "Palabras " + st.countTokens());
                
                while(st.hasMoreTokens()){
                    String Palabra= st.nextToken();
                    System.out.println(Palabra+Palabra.length());
                }
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
