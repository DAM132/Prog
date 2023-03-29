/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja1.ejercicio2;

import java.io.File;
import java.security.Guard;

/**
 *
 * @author DAM132
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        File f=new File("D:\\Usuarios\\DAM132\\Documents\\prueba\\prueba.txt"); 
        
        if(f.exists()){
            System.out.println(f.getName());
            System.out.println(f.getPath());
            System.out.println(f.getAbsolutePath());
        
        if(f.canRead())
            System.out.println("se puede leer");
        else
            System.out.println("no se puede leer");
        
        if(f.canWrite())
            System.out.println("se puede escribir");
        else
            System.out.println("no se puede escribir");
        
        System.out.println("Tamaño del fichero" + f.length());
        
        
        }else
        System.out.println("No existe");
    
    
    
    }
}
