/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema7.ejercicio6;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author DAM132
 */
public class Ejercicio6 {

    public static void main(String[] args) {
     int c;
     int cont = 0;
       
File o= new File("D:\\Usuarios\\DAM132\\Desktop\\prog\\Tema 7\\Ejercicios\\Hoja2\\Ejercicio7\\entrada1.txt");
FileInputStream f = null;
try {
  f = new FileInputStream("D:\\Usuarios\\DAM132\\Desktop\\prog\\Tema 7\\Ejercicios\\Hoja2\\Ejercicio7\\entrada1.txt");
  
  
  while ((c = f.read()) != -1 ) {
    System.out.print((char) c);
    
          cont++;   
            
    
     
    if(c==' '){
        cont--;  
       System.out.println(cont);
          System.out.println("");
          cont=0;
        
    }      
    
    
  }
    
    System.out.println(cont);
} catch (IOException e) {
  System.out.println(e.toString());
} finally {
  if (f != null)
    try {
      f.close();
    } catch (IOException ex) {
      System.out.println("Error al cerrar el fichero.");
    }
}    }
}
