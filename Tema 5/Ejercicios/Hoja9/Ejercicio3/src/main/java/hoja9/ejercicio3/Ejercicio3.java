/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja9.ejercicio3;

/**
 *
 * @author Ginés
 */
public class Ejercicio3 {

    public static void main(String[] args) {
      int [] e= new int[2];
     try{
         for (int i = 0; i < 3; i++) {
            System.out.println(e[i]);
        }
     } catch(ArrayIndexOutOfBoundsException t){
         System.out.println("Fuera de rango");
     }
        
    }
}
