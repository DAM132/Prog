/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja1.ejercicio6;

/**
 *
 * @author gines
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        int []num={1,2,3,4,45,6,7,15,9,10};
        int aux= Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            if(num[i]>aux){
                aux=num[i];
            }
        }
        System.out.println("El mayor es" + aux);
       
    }
}
