/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja7.ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        
        try
        {
            
      
        Scanner in =new Scanner(System.in);
      
       int a= esEntero();
      
        int b= esEntero();
        
         Division(a,b);
         
           }
        catch(ArithmeticException e){
            System.out.println("No se puede dividir entre 0");
        }
    }
    
     public static int Division(int a,int b) throws ArithmeticException{
        return a/b;
    }
     
      public static int esEntero() {

        int numEntero = 0;
        boolean aux = false;
        Scanner in = new Scanner(System.in);

        do {
            try {
                System.out.println("Dime un numero");
                numEntero = in.nextInt();
                aux = true;

            } catch (InputMismatchException exc) {
                System.out.println("Tiene que ser un numero entero champion =)");
                in.nextLine();

            }

        } while (!aux);

        return numEntero;

     }
}
