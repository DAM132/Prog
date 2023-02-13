/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja7.ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Ejercicio3 {

    public static void main(String[] args) {
       
       
      try{
         esEntero();
      }
      catch(Exception e){
          System.out.println(e.getMessage());
      }
          
            
        
        
    }
    
     public static void Rango(int a,int x,int y) throws Exception{
        if(a>x||a<y){
            throw new Exception("Debe estar entre 100 y 0");
            
           
        }
     }
        
         public static int esEntero() throws Exception {
 int intentos=0;
        int numEntero = 0,aux1=0;
        boolean aux = false;
        Scanner in = new Scanner(System.in);

        do {
            try {
                System.out.println("Dime un numero");
           
               Rango(in.nextInt(),100,0);
                numEntero = in.nextInt();
                aux = true;

            } catch (InputMismatchException exc) {
                System.out.println("Tiene que ser un numero entero champion =)");
                in.nextLine();
                 intentos++;

            }

        } while (!aux);
             System.out.println("intentos" + intentos);

        return numEntero;

     }

}
