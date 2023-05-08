/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema7.ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DAM132
 */
public class Ejercicio1 {

    public static void main(String[] args) {
  File   fichero1 = null,fichero2=null,ficheros= null;           
        
        FileReader fr = null;
  BufferedReader br = null;
  FileWriter wfr = null;
  BufferedWriter wbr = null;
  String linea;
  String cadena = "";
  
  if(args.length !=3)
            System.out.println("No has introducido tres nombres de fichero como parametros");
  
  else{
      fichero1= new File(args[0]);
      fichero2= new File(args[0]);
      ficheros= new File(args[0]);
  }
  if(!fichero1.exists()){
      System.out.println("Ya existe el fichero no se puede iniciar");
  }
  else if(!fichero2.exists())
            System.out.println("Ya existe fichero de salida");
  
  
  else if(!ficheros.exists()){ 
      

  try {
      FileReader fr1 = new FileReader(fichero1);
    br = new BufferedReader(fr);
    while ((linea = br.readLine()) != null) {
     cadena+=linea;
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
  
  
  try {
    wfr = new FileWriter("otroFichero.txt", true);
    wbr = new BufferedWriter(wfr);
    wbr.write(cadena);
    wbr.write(System.lineSeparator());
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
  
        
        
        
        
    }
    
    
    
    public static void leer(File entrada, File salida){

    
   
}
