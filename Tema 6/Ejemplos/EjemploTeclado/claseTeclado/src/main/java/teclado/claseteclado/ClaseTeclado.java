/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package teclado.claseteclado;

import static java.lang.System.in;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Ginés
 */
public class ClaseTeclado {

    public static void main(String[] args) {
        System.out.println(EsBoolean("dime s o n"));

    }

    public static LocalDate Esfecha(){
       LocalDate fecha = null;
       int dia, mes,anno;
        boolean aux = false;
       while(!aux){
           
   
       try{

           dia=esEntero("Dime un día");
      
           mes=esEntero("Dime un mes");
           
           anno=esEntero("Dime un año");
           
           fecha=LocalDate.of(anno, mes, dia);
           aux=true;
       }catch(DateTimeException e){
           System.out.println("Debe ser una fecha!");
       }
           }
        
        return fecha;
        
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
        
            
    

    
    
    public static String EsTexto(){
       boolean aux = false;
        String i = "";
       
    while(aux==false){
           
     
        Scanner in= new Scanner(System.in);
        System.out.println("Dime texto");
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
       
   
    public static double Esdecimal(){
           boolean aux = false;
        double i = 0;
       
    while(aux==false){
           
     
        Scanner in= new Scanner(System.in);
        System.out.println("Dime el numero decimal");
        try{  
            
     i= in.nextDouble();
     aux=true;
        }catch(InputMismatchException e){
            System.out.println("Debe ser un decumal");
        }
        }
        return i;
        
        
    }
    
    public static String esNombre(String texto){
      Scanner in= new Scanner(System.in);
        boolean auxnombre= false;
          String nombre = "";
        // esto comprueba el nombre
       
    while(!auxnombre){
           

            System.out.println(texto);
            try {
               nombre = in.nextLine();

                if (Pattern.matches("[A-Z][a-zA-Z]*", nombre)) {
                    auxnombre = true;
                } else {
                    System.out.println("No cumple el formato");
                }

            } catch (InputMismatchException e) {
                System.out.println("Debe ser un texto");
            }

        }
        
        return nombre;
    }


    
    
} 



