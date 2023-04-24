/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

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
     
         
     public static double Esdouble(String mensaje){
      
        boolean aux = false;
        double i = 0;
        
        Scanner in= new Scanner(System.in);
        
             while (!aux) {
            try {
                System.out.println(mensaje);
                i = in.nextDouble();
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
    
    public static char Sexo(String text){
        Scanner in = new Scanner(System.in);
        System.out.println(text);
       char entrada=in.next().charAt(0);
        
        boolean aux= false;
        while(!aux) 
        {
             if(entrada=='H'||entrada=='h'||entrada=='m'||entrada=='M')
                 aux=true;
             
             else{
                 System.out.println("Dime una entrada valida ");
                 entrada=in.next().charAt(0);
                 
             }
                 
        }
        
       
            
        
        
        
        return entrada;
    }
    
}
