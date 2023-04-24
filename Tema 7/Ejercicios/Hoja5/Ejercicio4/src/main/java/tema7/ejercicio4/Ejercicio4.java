/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema7.ejercicio4;

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
 * @author Ginés
 */
public class Ejercicio4 {

    public static void main(String[] args) {

File f = new File("dni.bin");
crear(f);
leer(f);

    }
    
    
    public static void crear(File fichero) {
        String dni;
        
  FileOutputStream f = null;
        DataOutputStream fd = null;
        boolean resp;
        try {
            f = new FileOutputStream(fichero, true);
            fd = new DataOutputStream(new BufferedOutputStream(f));
            
            dni=Teclado.EsTexto("Dime un dni");
            
            if(Teclado.validarDNI(dni))
            {
                fd.writeUTF(dni);
            }
            else{
                System.out.println("No es un dni valido");
            }
          

            //lo grabamos en el fichero
            
            
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
   String dni;
  FileInputStream f = null;
  DataInputStream fd = null;
  boolean fin = false;
  try {
    //creamos un flujo hacia el fichero
    f = new FileInputStream(fichero);
    fd = new DataInputStream(new BufferedInputStream(f));
    do {
      dni= fd.readUTF();
        System.out.println("Dni " + dni);
      
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
