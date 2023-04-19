/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema7.ejercicio1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author DAM132
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        File test=new File("donativos.dat");
        crear(test);
        leer(test);
        
        
        
    }
    
  
    
    public static void crear(File fichero) {
  String nombre;
  int edad;
  FileOutputStream f = null;
  DataOutputStream fd = null;
  boolean resp;
  try {
    f = new FileOutputStream(fichero); 
    fd = new DataOutputStream(new BufferedOutputStream(f));    
    do {
      nombre = Teclado.EsTexto("Introduce nombre: ");
      edad = Teclado.esEntero("Introduce edad: ");
      //lo grabamos en el fichero
      fd.writeUTF(nombre);
      fd.writeInt(edad);
      resp = Teclado.EsBoolean("Otro registro: ");
    } while (resp);
  } catch (IOException ex) {
    System.out.println("error " + ex.toString());
  } finally {
    if (fd != null) 
      try {
      fd.close();
    } catch (IOException ex) {
      System.out.println("Error al cerrar el fichero.");
    }  
  }
  
   }
    
    
    public static void leer(File fichero) {
  String nombre;
  int edad;
  FileInputStream f = null;
  DataInputStream fd = null;
  boolean fin = false;
  try {
    //creamos un flujo hacia el fichero
    f = new FileInputStream(fichero);
    fd = new DataInputStream(new BufferedInputStream(f));
    do {
      nombre = fd.readUTF();
      edad = fd.readInt();
      System.out.println("Nombre = " + nombre);
      System.out.println("Edad = " + edad);
    } while (!fin);
  } catch (EOFException eof) {
    fin = true;
  } catch (IOException ex) {
    System.out.println("error " + ex.toString());
  } finally {
    if (fd != null) 
      try {
      fd.close();
    } catch (IOException ex) {
      System.out.println("Error al cerrar el fichero.");
    }
  }
}
    
    
}
  
  
  

