/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package teclado.claseteclado;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class ClaseTeclado {

    public static void main(String[] args) {
        System.out.println(EsBoolean());
        System.out.println(Esdecimal());

    }
    
    public static int Esintnumero(){
      
        boolean aux = false;
        int i = 0;
       
    while(aux==false){
           
     
        Scanner in= new Scanner(System.in);
        System.out.println("Dime numero");
        try{  
            
     i= in.nextInt();
     aux=true;
        }catch(InputMismatchException e){
            System.out.println("Debe ser un numero");
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
    
    
    public static boolean EsBoolean(){
           char i = 'f';
        boolean aux = false;
     Scanner in= new Scanner(System.in);   
    while(aux==false){
           
        System.out.println("Dime un char");
       String input = in.next();
        if (input.length() > 1) {
            throw new IllegalArgumentException("Please enter single character.");
        }
        char choice = input.charAt(0);
        
        if(choice=='s')
            aux=true;
        else
            aux=false;
        
            
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
    
    
    
    
}
