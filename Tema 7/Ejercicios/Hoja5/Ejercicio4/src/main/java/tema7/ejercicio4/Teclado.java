/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ejercicio4;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author DAM132
 */
public class Teclado {
    
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
    
    
    public static boolean EsBoolean(String m) {
           char c = ' ';
           
        boolean aux = false;
        boolean aux1= false;
     Scanner in= new Scanner(System.in);   
    while(!aux1){
         
        
        System.out.println(m);
      try{
          
              c=in.next().charAt(0);
       
       
        
        if(c=='s'|| c=='S'){
              aux=true;
        aux1=true;
        }

          
        
        else if(c=='n'|| c=='N'){
               aux=false;
                aux1=true;
        }
            
         
       
            
        else {
                 throw new Exception("test");
        }
        
      }
      catch(Exception e){
          System.out.println(e.getMessage());
      }
       
        }
        return aux;
     
        
       
        
            
    }
    
     public static boolean validarDNI(String dni) {
         
     dni= dni.toUpperCase();
     
    return Arrays.binarySearch(INVALIDOS, dni) < 0 // (1)
	    && REGEXP.matcher(dni).matches() // (2)
        && dni.charAt(8) == DIGITO_CONTROL.charAt(Integer.parseInt(dni.substring(0, 8)) % 23); // (3)
  }


 private static final Pattern REGEXP = Pattern.compile("[0-9]{8}[A-Z]");
  private static final String DIGITO_CONTROL = "TRWAGMYFPDXBNJZSQVHLCKE";
  //los fija ministerio interior como no validos
  private static final  String[] INVALIDOS = new String[] { "00000000T", "00000001R", "99999999R" };
    
}
