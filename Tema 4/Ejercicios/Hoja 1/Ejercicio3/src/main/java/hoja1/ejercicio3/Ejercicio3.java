/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja1.ejercicio3;

/**
 *
 * @author gines
 */
public class Ejercicio3 {

    public static void main(String[] args) {
int []num={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < 10; i++) {
            System.out.println(num[i]);
            
        }
        for (int i = 0; i < num.length; i++) {
            num[i]=10-i;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
            
        }

    }
}
