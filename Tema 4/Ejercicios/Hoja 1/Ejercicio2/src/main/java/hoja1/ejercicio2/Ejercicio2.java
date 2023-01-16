/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja1.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author gines
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        boolean encontrado= false;
        int intro;
        int []num={1,2,3,4,5,6,7,8,9,10};
         System.out.println("Dime un numero");
            intro=in.nextInt();
        for (int i = 1; i < num.length; i++) {
           
           
            
            if(intro==num[i]){
                System.out.println("He encontrado el numero" + (i+1));
                encontrado=true;
                
            }
           
        }
            
        if(!encontrado){
            System.out.println("no encontrado");
        
        }
        
    }
}
