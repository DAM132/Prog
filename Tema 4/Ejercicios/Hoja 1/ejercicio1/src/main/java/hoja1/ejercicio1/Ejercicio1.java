/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja1.ejercicio1;

import java.util.Random;

/**
 *
 * @author gines
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        double[] num = {-2,-2,-2,-2,-2,-2,-2,-2,-2,-2};
         for (int i = 0; i < num.length; i++) {
            System.out.println("El resultado es posicion " +i+ "\t"+num[i]+"\t");
            
        }
         
         
        for (int i = 0; i < num.length; i++) {
            num[i]=-1;
            
            
        }
        
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("El resultado es posicion " +i+ "\t"+num[i]+"\t");
            
            
        }
        
        
        for (int i = 0; i < num.length; i++) {
            Random r= new Random();
             num [i]=r.nextInt(10)+1;
            
        }
        
        
            for (int i = 0; i < num.length; i++) {
           System.out.println("El resultado es posicion " +i+ "--"+num[i]+"\t");
            
            
        }
        
    }
}
