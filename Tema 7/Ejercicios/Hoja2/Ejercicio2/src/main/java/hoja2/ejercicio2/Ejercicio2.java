/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja2.ejercicio2;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author DAM132
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        //escribir en un fichero 
        
        int c;
	FileOutputStream f=null;
	try{
		f=new FileOutputStream("D:\\Usuarios\\DAM132\\Desktop\\prog\\Tema 7\\Ejercicios\\Hoja2\\Ejercicio1\\mifichero.txt");
		while((c=System.in.read())!='\n')
			f.write((char)c);
	}
	catch(IOException e){
		System.out.println(e.toString());
	}
	finally{
		if(f!=null)
			try {
      f.close();
      } catch (IOException ex) {
        System.out.println("Error al cerrar el fichero.");
      }
        
        
        
    }
    }
}
