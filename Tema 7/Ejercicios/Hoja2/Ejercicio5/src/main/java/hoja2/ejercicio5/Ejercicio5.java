/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja2.ejercicio5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author DAM132
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        String vocales="aeiouAEIOU";
         int c;
         int contador=0;
        FileInputStream f = null;
        File o= new File("D:\\Usuarios\\DAM132\\Desktop\\prog\\Tema 7\\Ejercicios\\Hoja2\\Ejercicio5\\hola.txt");
        try {
            f = new FileInputStream("D:\\Usuarios\\DAM132\\Desktop\\prog\\Tema 7\\Ejercicios\\Hoja2\\Ejercicio5\\hola.txt");
          
            while ((c = f.read()) != -1) {
                
         
                
                if(vocales.indexOf(c)>=0) 
                {
                    contador++;
                }
                
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            if (f != null)
    try {
                f.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar el fichero.");
            }
        }
        
      
        System.out.println("Contador " + contador);
System.out.println("Ruta absoluta " + o.getAbsolutePath());
                System.out.println("Longitud " + o.length());
    }
}
