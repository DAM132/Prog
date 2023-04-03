/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja1.ejercicio4;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author DAM132
 */
public class Ejercicio4 {

    public static void main(String[] args) {
Scanner  in = new Scanner(System.in);

        File direc=new File("D:\\Usuarios\\DAM132\\Desktop\\prog");
        
         File [] resultado= direc.listFiles();
        
        if(!direc.isDirectory()){
            System.out.println("No es un directorio");
        }
        else{
           
            for (File file : resultado) {
                 if(file.isDirectory()) {
                     System.out.println("nombre directorio" + file.getName());
             visualizarDirectorio(file);
           }
                  if(file.isFile()){
               System.out.println(file.getName());
           }
           
          
            }
          
           
           
        }
        
        
        
       
        
        }
    
    
    private static void visualizarDirectorio(File direc){
        
        
  File [] resultado= direc.listFiles();
        
    
            for (File file : resultado) {
                 if(file.isDirectory()) {
                     System.out.println("\tnombre directorio" + file.getName());
              
           }
           
           if(file.isFile()){
               System.out.println("\tnombre del archivo" + file.getName());
           }
            }
          
           
           
        }
             
    
}
