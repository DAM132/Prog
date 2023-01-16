/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja4.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author gines
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int dinero,donativos=0;
        int i=0;
        for (i = 0; donativos < 600; i++) {
            System.out.println("Cantidad que quieres ingresar");
           
            donativos+=in.nextInt();
            
        }
        System.out.println("Se han necesitado" +i);
    }
}
