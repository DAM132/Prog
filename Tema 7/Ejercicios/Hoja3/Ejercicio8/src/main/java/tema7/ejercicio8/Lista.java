/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ejercicio8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author DAM132
 */
public class Lista {
    
    private ArrayList <String> aux= new ArrayList<String>();

    public Lista() {
           FileReader fr;
        BufferedReader br = null;
        String linea;
        try {
            fr = new FileReader("mifichero.txt");
            br = new BufferedReader(fr);
            while ((linea = br.readLine()) != null) {
                aux.add(linea);
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
    }
    
    
    
    
    
    
    
    public boolean añadir(String n){
        return aux.add(n);
    }
    
    
    public boolean borrar(String n){
        boolean aux1=false;
        Iterator <String> it=aux.iterator();
        
        while (it.hasNext()) {            
        
         if(it.next().equalsIgnoreCase(n)){
             it.remove();
             aux1=true;
        }
         
       
    }
        return aux1;
    }
    

public void salir(){
      
        PrintWriter salida = null;
        try {
            salida = new PrintWriter("mifichero.txt");
            String cadena;
         
            for (String nombres : aux) {
                salida.println(nombres);
            }
            salida.flush();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            if (salida != null) {
                salida.close();
            }
        }
    }
   
    
}
    

