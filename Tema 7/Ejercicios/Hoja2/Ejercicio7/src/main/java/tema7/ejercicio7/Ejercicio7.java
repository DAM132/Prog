/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema7.ejercicio7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author DAM132
 */
public class Ejercicio7 {

    public static void main(String[] args) {
//       //7.- Realizar un programa que recibe como parámetros los nombres de 3 ficheros de texto y
//concatena el contenido de los dos primeros en un tercero. Se comprobará que el tercer fichero
//no exista, se visualizará el tamaño de cada uno de los ficheros, así como la ruta absoluta y por
//último se borrarán los dos primeros y se dejará el último como de solo lectura.

        FileInputStream f1 = null;
        FileInputStream f2 = null;
        FileOutputStream fo = null;
        int c;
        File fout= new File("D:\\Usuarios\\DAM132\\Desktop\\prog\\Tema 7\\Ejercicios\\Hoja2\\Ejercicio7\\salida.txt");
        
        if(fout.exists()){
            System.out.println("Error al crear el fichero, ya existe");
            
        }
        
         
        try {
            f1 = new FileInputStream("entrada1.txt");
            f2 = new FileInputStream("entrada2.txt");
            fo = new FileOutputStream("salida.txt");
            
            
            while ((c = f1.read()) != -1) {
                fo.write(c);
            }
               while ((c = f2.read()) != -1) {
                fo.write(c);
            }
            
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            if (f1 != null||f2!=null)
    try {
                f1.close();
                f2.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar el fichero.");
            }
            

            if (fo != null)
                
            try {
                
                fo.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar el fichero.");
            }
            
        }


    }
}
