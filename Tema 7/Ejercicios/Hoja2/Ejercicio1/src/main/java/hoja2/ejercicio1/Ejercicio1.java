/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja2.ejercicio1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author DAM132
 */
public class Ejercicio1 {

    public static void main(String[] args) {
       //1.- Leer un fichero carácter a carácter.
       

       int c;
FileInputStream f = null;
try {
  f = new FileInputStream("D:\\Usuarios\\DAM132\\Desktop\\prog\\Tema 7\\Ejercicios\\Hoja2\\Ejercicio1\\mifichero.txt");
  while ((c = f.read()) != -1) {
    System.out.print((char) c);
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

    }
}
