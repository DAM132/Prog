/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema7.ejercicio2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DAM132
 */
public class Ejercicio2 {

    public static void main(String[] args) {
          Fichero f=new Fichero("datos.bin");
         Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion; //Guardaremos la opcion del usuario
       do{
           System.out.println("1. Añadir entrada.");
           System.out.println("2. Listar entradas agenda.");
           System.out.println("3. Buscar en la agenda.");
           System.out.println("4. Borrar entrada en la agenda.");
           System.out.println("5. Borrar fichero de clientes completamente.");
           System.out.println("Escribe una de las opciones");
           opcion = sn.nextInt();
           switch(opcion){
               case 1:
                   System.out.println("Has seleccionado la opcion 1");
                  f.Escribir();
                   break;
               case 2:
                   System.out.println("Has seleccionado la opcion 2");
                   f.Leer();
                   break;
                case 3:
                     System.out.println("Has seleccionado la opcion 3");
                  f.buscar(Teclado.EsTexto("Dime el nombre a buscar"));
                   break;
                   case 4:
                       System.out.println("Has seleccionado la opcion 4");
                 f.borrarEntrada(Teclado.EsTexto("Dime el nombre"));
                   break;
                   case 5:
                        System.out.println("Has seleccionado la opcion 5");
                  f.eliminar();
                  break;
                case 6:
                    System.out.println("Hasta Pronto");
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 5");
           }
       }
      while(!salir);
    
    }
    
    
    
    
}
