/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja9.ejercicio5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int cont=0;
    
        int a;
       int ale=NumAleatorio();
        boolean aux=false;
        System.out.println(ale);
        do{
          cont++;    
       
          a=Esnumero();
       if(a==ale){
           
            System.out.println("Has acertado");
            aux=true;
       }
       else{
           try{
               
           
           if(a>ale){
               throw new Exception("Es mayor");
               
           } 
           else if(ale>a){
               throw new Exception("Es menor");
           }
           }
           catch(Exception e){
                   System.out.println(e.getMessage());
                   }
         
           
            System.out.println("No acierto");
            
     
       }
        }
        while (!aux);
        
        System.out.println("Numero total de intentos" + cont);
    }
    
    
    public static int Esnumero(){
       int i=0;
        Scanner in= new Scanner(System.in);
        System.out.println("Dime numero");
        try{  
     i= in.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Debe ser un numero");
        }
      
        return i;
            
    }
    
    public static int NumAleatorio(){
        int i;
        Random r=new Random();
        i=r.nextInt(500)+1;
        return i;
    }
    
    
}
