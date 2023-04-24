/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema7.ejercicio3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Ejercicio3 {

    public static void main(String[] args) {
File test=new File("Alumnos.dat");
   File promocionan = new File("Promocionan.dat");
     
        
        
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("1. Introducir alumnos");
            System.out.println("2- Comprobar los que promocionan");
            System.out.println("3- Salir");
        
    
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("1- Introducir datos");
                        crear(test);
                        
                        break;
                    case 2:
                        System.out.println("2- Listar nombres");
                      leer(test);
                        break;
                        
                        
                    case 3:
                        System.out.println("3- Salir");
                        salir=true;
                        break;
               
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
 




    }
    
    
    public static void crear(File fichero) {
        String nombre, ciudad;
        int edad;
        
  FileOutputStream f = null;
        DataOutputStream fd = null;
        boolean resp;
        try {
            f = new FileOutputStream(fichero, true);
            fd = new DataOutputStream(new BufferedOutputStream(f));
            
            nombre = Teclado.EsTexto("Dime un nombre");
            edad = Teclado.esEntero("Dime la edad");
            ciudad = Teclado.EsTexto("Dime una ciudad");

            //lo grabamos en el fichero
            fd.writeUTF(nombre);
            fd.writeInt(edad);
            fd.writeUTF(nombre);
            
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
    String nombre, ciudad;
        int edad;
  FileInputStream f = null;
  DataInputStream fd = null;
  boolean fin = false;
  try {
    //creamos un flujo hacia el fichero
    f = new FileInputStream(fichero);
    fd = new DataInputStream(new BufferedInputStream(f));
    do {
      nombre= fd.readUTF();
      edad= fd.readInt();
      ciudad= fd.readUTF();
      
        System.out.println("Nombre " + nombre);
        System.out.println("Edad " + edad);
        System.out.println("Ciudad " + ciudad);
      
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
