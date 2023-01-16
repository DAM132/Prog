/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja4.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author gines
 */
public class Ejercicio51 {

    public static void main(String[] args) {
        int max=Integer.MIN_VALUE,min = Integer.MAX_VALUE,num;
        Scanner in= new Scanner(System.in);
        System.out.println("dime un num");
      
        for (int i = 0; i < 10; i++) {
            
            num=in.nextInt();
           
            
            if(num>max){
                max=num;
            }
            if (num<min){
                min=num;
            }
        }
        System.out.println("max"+max+"min"+min);
    }
}
