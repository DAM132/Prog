/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio1;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author DAM132
 */
public class Entrada {
    
    
    public static String EsTexto(String t){
       boolean aux = false;
        String i = "";
       
    while(aux==false){
           
     
        Scanner in= new Scanner(System.in);
        System.out.println(t);
        try{  
            
     i= in.nextLine();
     aux=true;
        }catch(InputMismatchException e){
            System.out.println("Debe ser un texto");
        }
        }
        return i;
            
    }
    
    
    public static int esEntero(String mensaje){
      
        boolean aux = false;
        int i = 0;
        
        Scanner in= new Scanner(System.in);
        
             while (!aux) {
            try {
                System.out.println(mensaje);
                i = in.nextInt();
                aux = true;
               
            } catch (InputMismatchException e) {
                System.out.println("Debe ser un numero");
                 in.next();
            }

        }
        return i;
    
}
    
    
    public static String recorrerMapas(HashMap<String,String> entidad){
        String salida=" ";
        
      
               for (Map.Entry<String, String> listado: entidad.entrySet() ) {
                   salida+=listado.getKey()+" "+ listado.getValue();
               }
        return salida;
               
           }
        
   
        

}


