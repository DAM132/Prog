/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja7.ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        boolean aux=false;
       do{
           
      try{
          Rango(esEntero());
          aux=true;
      }
      catch(Exception e){
          System.out.println(e.getMessage());
      }
          
      }
      while(!aux);
          
            
        
        
    }
    
     public static void Rango(int a) throws Exception{
        if(a>100||a<0){
            throw new Exception("Debe estar entre 100 y 0");
           
        }
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
