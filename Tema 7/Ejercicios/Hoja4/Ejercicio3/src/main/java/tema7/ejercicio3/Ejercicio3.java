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
 * @author DAM132
 */
public class Ejercicio3 {

    public static void main(String[] args) {
   File test=new File("Alumnos.dat");
   File promocionan = new File("Promocionan.dat");
     
        
        
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("1. Añadir un nuevo donativo (pide datos y añade un nuevo registro)");
            System.out.println("2- Comprobar los que promocionan");
            System.out.println("3- visualizar los dos ficheros");
            System.out.println("4- Salir");
    
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("1- Introducir alumnos");
                        crear(test);
                        
                        break;
                    case 2:
                        System.out.println("2- Comprobar los que promocionan");
                        aprueban(promocionan);
                        break;
                        
                        
                    case 3:
                        System.out.println("3- visualizar los dos ficheros");
                        leer(test);
                        System.out.println("promocionan");
                        leer(promocionan);
                        break;
               
                    case 4:
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
        int nmatricula;
        String nombre;
        int nota1;
        int nota2;
        int nota3;
  FileOutputStream f = null;
        DataOutputStream fd = null;
        boolean resp;
        try {
            f = new FileOutputStream(fichero, true);
            fd = new DataOutputStream(new BufferedOutputStream(f));
         
                nmatricula = Teclado.esEntero("Introduce nmatricula: ");
                nombre = Teclado.EsTexto("Introduce nombre: ");
                nota1 = Teclado.esEntero("Introduce nota1: ");
                nota2 = Teclado.esEntero("Introduce nota2: ");
                nota3 = Teclado.esEntero("Introduce nota3: ");

                //lo grabamos en el fichero
                fd.writeInt(nmatricula);
                fd.writeUTF(nombre);
                fd.writeInt(nota1);
                fd.writeInt(nota2);
                fd.writeInt(nota3);

               
            
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
    
    
    public static void aprueban(File fichero) {
       
        DataOutputStream fdo = null;
    int nmatricula;
        String nombre;
        int nota1;
        int nota2;
        int nota3;
  FileInputStream f = null;
  DataInputStream fd = null;
  boolean fin = false;
  try {
    //creamos un flujo hacia el fichero
    f = new FileInputStream(fichero);
      FileOutputStream fo = new FileOutputStream(ficherosalida, true);
    fd = new DataInputStream(new BufferedInputStream(f));
     fdo = new DataOutputStream(new BufferedOutputStream(fo));
    do {
      nmatricula = fd.readInt();
      nombre = fd.readUTF();
      nota1=fd.readInt();
      nota2=fd.readInt();
      nota3=fd.readInt();
      
      if(nota1>=5&&nota2>=5&&nota3>=5){
          fdo.writeInt(nmatricula);
         fdo.writeUTF(nombre);
         int notaf=((nota1+nota2+nota3)/3);
        fdo.writeInt(notaf);
          
          
      }
      
      
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
    
    
     public static void leer(File fichero) {
   int nmatricula;
        String nombre;
        int nota1;
        int nota2;
        int nota3;
  FileInputStream f = null;
  DataInputStream fd = null;
  boolean fin = false;
  try {
    //creamos un flujo hacia el fichero
    f = new FileInputStream(fichero);
    fd = new DataInputStream(new BufferedInputStream(f));
    do {
      nmatricula = fd.readInt();
      nombre = fd.readUTF();
      nota1=fd.readInt();
      nota2=fd.readInt();
      nota3=fd.readInt();
      System.out.println("nmatricula = " + nmatricula);
      System.out.println("nombre = " + nombre);
        System.out.println("nota1 " + nota1);
        System.out.println("nota1 " + nota2);
        System.out.println("nota1 " + nota3);
      
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

