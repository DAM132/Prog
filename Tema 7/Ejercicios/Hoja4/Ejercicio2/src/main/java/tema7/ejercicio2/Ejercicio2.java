/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema7.ejercicio2;

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
 * @author DAM132
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        File test=new File("donativos.dat");
     
        
        
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("1. Añadir un nuevo donativo (pide datos y añade un nuevo registro)");
            System.out.println("2. Listado de donativos (listado de todos los donativos y el total acumulado)");
            System.out.println("3. Salir (se cierra el programa)");
    
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        crear(test);
                        
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        leer(test);
                        break;
               
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
 
    
        
        
        
    }
    
  
    
    public static void crear(File fichero) {
  String nombre;
  String dni;
  int importe;
  FileOutputStream f = null;
  DataOutputStream fd = null;
  boolean resp;
  try {
    f = new FileOutputStream(fichero, true); 
    fd = new DataOutputStream(new BufferedOutputStream(f));    
    do {
      nombre = Teclado.EsTexto("Introduce nombre: ");
      dni = Teclado.EsTexto("Introduce dni: ");
      importe= Teclado.esEntero("Introduce el importe: ");
      //lo grabamos en el fichero
      fd.writeUTF(nombre);
      fd.writeUTF(dni);
      fd.writeInt(importe);
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
  String dni;
  int importe;
  int total = 0;
  FileInputStream f = null;
  DataInputStream fd = null;
  boolean fin = false;
  try {
    //creamos un flujo hacia el fichero
    f = new FileInputStream(fichero);
    fd = new DataInputStream(new BufferedInputStream(f));
    do {
      nombre = fd.readUTF();
      dni = fd.readUTF();
      importe=fd.readInt();
      total+=importe;
      System.out.println("Nombre = " + nombre);
      System.out.println("Dni = " + dni);
      
    } while (!fin);
      
  } catch (EOFException eof) {
    fin = true;
     System.out.println("Total= " + total);
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
  
  
  

