/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja1.ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
        Contenedor<Integer> pila= new Contenedor<>(new Integer[0]);
        
        Scanner in = new Scanner(System.in);
        int aux;
        System.out.println("Dime un numero");
         aux=Esintnumero();
          
        while(aux!=-1){
         
       
         System.out.println("Dime un numero");
         pila.Apilar(aux);
         aux=Esintnumero();
         
        }

         System.out.println(pila.Desapilar());
          System.out.println(pila.Desapilar());
           System.out.println(pila.Desapilar());
//         while(pila.Desapilar()!=null){
//             System.out.println(pila.Desapilar());
//         }
           
         
            
        }

        
 public static int Esintnumero(){
      
        boolean aux = false;
        int i = 0;
       
    
           
     
        Scanner in= new Scanner(System.in);
        System.out.println("Dime numero");
       
        do{
        
 
        try{  
            
     i= in.nextInt();
     aux=true;
     }
        catch(InputMismatchException e){
            System.out.println("Debe ser un numero");
        }
        }
        while(aux!=true);
        return i;
           }      
        

    }
   