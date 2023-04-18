/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ejercicio9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author DAM132
 */
public class pila {
      private Stack  <String> aux= new Stack <>();

    public pila() {
           FileReader fr;
        BufferedReader br = null;
        String linea;
        try {
            fr = new FileReader("mifichero.txt");
            br = new BufferedReader(fr);
            while ((linea = br.readLine()) != null) {
               aux.push(linea);
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
    
  

public void grabar(){
        Iterator <String> it= aux.iterator();
        PrintWriter salida = null;
        try {
            salida = new PrintWriter("mifichero.txt");
            String cadena;
         
           while(it.hasNext()){
               salida.println(aux.pop());
               
               
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
